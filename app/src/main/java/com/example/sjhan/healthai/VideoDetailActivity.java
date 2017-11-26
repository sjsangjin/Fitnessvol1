package com.example.sjhan.healthai;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sjhan.healthai.Bean.VideoDataBean;
import com.example.sjhan.healthai.Util.ActivityUtil;


public class VideoDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_detail);
        TextView txtTitle = (TextView)findViewById(R.id.txtTitle);
        WebView webView = (WebView)findViewById(R.id.wbvYoutube);
        TextView txtDes = (TextView)findViewById(R.id.txtDes);
        ImageView imgWorkout = (ImageView)findViewById(R.id.imgWorkout);
        webView.getSettings().setJavaScriptEnabled(true);

        VideoDataBean video = (VideoDataBean)getIntent().getSerializableExtra("video");

        ActivityUtil.setActionBarColor(this, R.color.colorAccent);


        if(video!=null)
        {
            webView.loadData(video.getVideoUrl(), "text/html", "utf-8");
            txtTitle.setText(video.getTitle());
            imgWorkout.setImageResource(video.getPart());
            txtDes.setText(video.getDescript());
        }

//        타이머기능
//        final Chronometer chronometer = (Chronometer) findViewById(R.id.chronometer);
//        Button buttonStart = (Button) findViewById(R.id.buttonstart);
//        Button buttonStop = (Button) findViewById(R.id.buttonstop);
//
//
//        buttonStart.setOnClickListener(new Button.OnClickListener() {
//            public void onClick(View v) {
//                chronometer.setBase(SystemClock.elapsedRealtime());
//                chronometer.start();
//            }
//        });
//
//        buttonStop.setOnClickListener(new Button.OnClickListener() {
//            public void onClick(View v) {
//                chronometer.stop();
//            }
//        });
    }

}
