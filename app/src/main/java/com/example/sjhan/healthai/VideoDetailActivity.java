package com.example.sjhan.healthai;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sjhan.healthai.Bean.VideoDataBean;
import com.example.sjhan.healthai.Util.ActivityUtil;


public class VideoDetailActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_detail);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getColor(R.color.actionbar)));


        TextView txtTitle = (TextView)findViewById(R.id.txtTitle);
        TextView txtDes = (TextView)findViewById(R.id.txtDes);
        TextView imgWorkout = (TextView) findViewById(R.id.imgWorkout);
        webView = (WebView)findViewById(R.id.wbvYoutube);
        webView.getSettings().setJavaScriptEnabled(true);

        VideoDataBean video = (VideoDataBean)getIntent().getSerializableExtra("video");

        ActivityUtil.setActionBarColor(this, R.color.colorAccent);


        if(video!=null)
        {
            webView.loadData(video.getVideoUrl(), "text/html", "utf-8");
            webView.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
            txtTitle.setText(video.getTitle());
            imgWorkout.setText(video.getPart2());
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

    @Override
    protected void onPause() {
// TODO Auto-generated method stub
        super.onPause();
        webView.pauseTimers();
    }

    /* (non-Javadoc)
    * @see android.app.Activity#onResume()
    */
    @Override
    protected void onResume() {
// TODO Auto-generated method stub
        super.onResume();
        webView.resumeTimers();
    }


}
