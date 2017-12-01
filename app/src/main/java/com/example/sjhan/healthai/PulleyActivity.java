package com.example.sjhan.healthai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.sjhan.healthai.Adapter.ListAdapter;
import com.example.sjhan.healthai.Bean.VideoDataBean;

import java.util.ArrayList;
import java.util.List;

public class PulleyActivity extends AppCompatActivity {

    private TextView txtMachieName;
    private GridView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pulley);

        TextView txtMachineName = (TextView)findViewById(R.id.machineName);
        GridView listView = (GridView)findViewById(R.id.listview);

//        String machine = (String) getIntent().getSerializableExtra("machine").toString();

        txtMachineName.setText("하이 풀리");

        VideoDataBean video1 = new VideoDataBean(R.drawable.upper1,"랫 풀 다운",R.drawable.upper1,"","");
        video1.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/oP3pI794CUo\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video2 = new VideoDataBean(R.drawable.upper1,"와이드 그립 비하인드 랫 풀 다운",R.drawable.upper1,"","");
        video2.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/B1qXfXW5cPw\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");

        List<VideoDataBean> list = new ArrayList<VideoDataBean>();
        list.add(video1);
        list.add(video2);

        ListAdapter adapter = new ListAdapter(this, list);
        listView.setAdapter(adapter);
    }
}
