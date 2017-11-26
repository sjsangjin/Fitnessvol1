package com.example.sjhan.healthai;

import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sjhan.healthai.Bean.MachineBean;
import com.flurgle.camerakit.CameraListener;
import com.flurgle.camerakit.CameraView;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by swucomputer on 2017. 5. 19..
 */
// 인식률 몇퍼센트 이상이어야 할 지 정하기

public class CameraActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    private static final int INPUT_SIZE = 299;
    private static final int IMAGE_MEAN = 128;
    private static final float IMAGE_STD = 128;
    private static final String INPUT_NAME = "Mul";
    private static final String OUTPUT_NAME = "final_result";

    private static final String MODEL_FILE = "file:///android_asset/retrained_graph_optimized.pb";
    private static final String LABEL_FILE =
            "file:///android_asset/retrained_labels.txt";
    private Classifier classifier;
    private Executor executor = Executors.newSingleThreadExecutor();
    private TextView textViewResult;
    private ImageView btnDetectObject, btnToggleCamera;
    private ImageView imageViewResult;
    private CameraView cameraView;

    private boolean authenticated = false;


    int flagged = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        Bundle bundle = this.getIntent().getExtras();


        IntentFilter filter = new IntentFilter(Intent.ACTION_SCREEN_OFF);
        IntentFilter filter_on = new IntentFilter(Intent.ACTION_SCREEN_ON);


        cameraView = (CameraView) findViewById(R.id.cameraView);
        imageViewResult = (ImageView) findViewById(R.id.imageViewResult);
        textViewResult = (TextView) findViewById(R.id.textViewResult);
        textViewResult.setMovementMethod(new ScrollingMovementMethod());

        btnToggleCamera = (ImageView) findViewById(R.id.btnToggleCamera);
        btnDetectObject = (ImageView) findViewById(R.id.btnDetectObject);


        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON
                | WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD
                | WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON
                | WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);


        cameraView.setCameraListener(new CameraListener() {
            @Override
            public void onPictureTaken(byte[] picture) {
                try {
                    super.onPictureTaken(picture);
                    Bitmap bitmap = BitmapFactory.decodeByteArray(picture, 0, picture.length);
                    bitmap = Bitmap.createScaledBitmap(bitmap, INPUT_SIZE, INPUT_SIZE, false);


                    imageViewResult.setImageBitmap(bitmap);

                    //TensorFlowImageClassifier의 이미지분류 데이터를 넘겨주기
                    final List<Classifier.Recognition> results = classifier.recognizeImage(bitmap);


                    //Classifier의 toString()호출로, 화면에 인식결과를 찍어내기
                    textViewResult.setText(results.toString());


                    //hj
                    //성공메시지 띄우는 메소드
                    verifyImage();

                    //hj
                    //verifyImage()결과, 실패 횟수에 따른 다른 작동

                    if (flagged == 1) {
                        Toast.makeText(CameraActivity.this, "(1회 실패) 인식률이 낮습니다. ", Toast.LENGTH_SHORT).show();

                    } else if (flagged == 2) {
                        Toast.makeText(CameraActivity.this, "(2회 실패) 인식률이 낮습니다. ", Toast.LENGTH_SHORT).show();

                    } else if (flagged == 3) {
                        Toast.makeText(CameraActivity.this, "(3회 실패) 인식률이 낮습니다. ", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e) {

                }

            }
        });

        btnToggleCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cameraView.toggleFacing();
            }
        });

        //탐지 버튼이 눌리면
        btnDetectObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    cameraView.captureImage(); //이미지 캡쳐
                } catch (Exception e) {

                }
            }
        });

        initTensorFlowAndLoadModel();


        cameraView.start();
    }


    //hj
    // 미션성공시 성공메시지 출력
    public boolean verifyImage() {


        //퍼센테이지 추출
        String resultObject = textViewResult.getText().toString();

        int ratioIndexPrev = resultObject.indexOf("(");
        int ratioIndexTail = resultObject.indexOf(".");

        int ratioIndexStart = ratioIndexPrev + 1;
        int ratioIndexEnd = ratioIndexTail;

        String ratioResult = resultObject.substring(ratioIndexStart, ratioIndexEnd);



        boolean flag = false;

        //인증 성공하면 알람이 꺼지는 동작 넣기

        if ((textViewResult.getText().toString().contains("chin dip assist")) && (Integer.valueOf(ratioResult) >= 0)) {

            flagged = 0;
            flag = true;
            authenticated = true;

            MachineBean machineBean = new MachineBean("chin");
            Intent intent = new Intent(CameraActivity.this, ChinActivity.class);
            intent.putExtra("machine", machineBean.getMachineName());
            startActivity(intent);
            finish();

        } else if ((textViewResult.getText().toString().contains("dumbbell")) && (Integer.valueOf(ratioResult) >= 0)) {

            flagged = 0;
            flag = true;
            authenticated = true;

            MachineBean machineBean = new MachineBean("dumbbell");
            Intent i = new Intent(CameraActivity.this, DumbbellActivity.class);
            i.putExtra("machine", machineBean.getMachineName());
            startActivity(i);
            finish();

        } else if ((textViewResult.getText().toString().contains("high pulley")) && (Integer.valueOf(ratioResult) >= 0)) {

            flagged = 0;
            flag = true;
            authenticated = true;

            MachineBean machineBean = new MachineBean("pulley");
            Intent intent = new Intent(CameraActivity.this, PulleyActivity.class);
            intent.putExtra("machine", machineBean.getMachineName());
            startActivity(intent);
            finish();

        } else if ((textViewResult.getText().toString().contains("power leg press")) && (Integer.valueOf(ratioResult) >= 0)) {

            flagged = 0;
            flag = true;
            authenticated = true;

            MachineBean machineBean = new MachineBean("press");
            Intent intent = new Intent(CameraActivity.this, PressActivity.class);
            intent.putExtra("machine", machineBean.getMachineName());
            startActivity(intent);
            finish();

        } else if ((textViewResult.getText().toString().contains("smith machine")) && (Integer.valueOf(ratioResult) >= 0)) {

            flagged = 0;
            flag = true;
            authenticated = true;

            MachineBean machineBean = new MachineBean("smith");
            Intent intent = new Intent(CameraActivity.this, SmithActivity.class);
            intent.putExtra("machine", machineBean.getMachineName());
            startActivity(intent);
            finish();
        }


        return flag;
    }


    //이화면에서 제일 먼저 시작되는 메소드
    @Override
    protected void onResume() {
        super.onResume();

        cameraView.start();

    }

    @Override
    protected void onPause() {

        cameraView.stop();
        super.onPause();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        executor.execute(new Runnable() {
            @Override
            public void run() {
                classifier.close();
            }
        });
    }

    private void initTensorFlowAndLoadModel() {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    classifier = TensorFlowImageClassifier.create(
                            getAssets(),
                            MODEL_FILE,
                            LABEL_FILE,
                            INPUT_SIZE,
                            IMAGE_MEAN,
                            IMAGE_STD,
                            INPUT_NAME,
                            OUTPUT_NAME);
                    makeButtonVisible();
                } catch (final Exception e) {
                    throw new RuntimeException("Error initializing TensorFlow!", e);
                }
            }
        });
    }

    private void makeButtonVisible() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                btnDetectObject.setVisibility(View.VISIBLE);
            }
        });
    }


}
