package com.example.sjhan.healthai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sjhan.healthai.Adapter.ListAdapter;
import com.example.sjhan.healthai.Bean.MachineBean;
import com.example.sjhan.healthai.Bean.VideoDataBean;
import com.example.sjhan.healthai.R;
import com.example.sjhan.healthai.Util.FileUtil;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class DumbbellActivity extends AppCompatActivity {

    private TextView txtMachieName;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        TextView txtMachineName = (TextView)findViewById(R.id.machineName);
        ListView listView = (ListView)findViewById(R.id.listview);

        String machine = (String) getIntent().getSerializableExtra("machine").toString();

        txtMachineName.setText("덤벨");

            VideoDataBean video1 = new VideoDataBean(R.drawable.upper1, "덤벨",  R.drawable.upper1, "ㅇㅇ");
            video1.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"400\" src=\"https://www.youtube.com/embed/jpTQdM7okkI\" frameborder=\"0\" width=\"640\" height=\"400\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");

            List<VideoDataBean> list = new ArrayList<VideoDataBean>();
            list.add(video1);
        //        list.add(video2);
//        list.add(video3);
//        list.add(video4);
//        list.add(video5);
//        list.add(video6);
            ListAdapter adapter = new ListAdapter(this, list);

            listView.setAdapter(adapter);

    }
}
