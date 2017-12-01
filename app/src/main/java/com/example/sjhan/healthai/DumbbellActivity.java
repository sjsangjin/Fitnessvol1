package com.example.sjhan.healthai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
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

        TextView txtMachineName = (TextView) findViewById(R.id.machineName);
        GridView listView = (GridView) findViewById(R.id.listview);

//        String machine = (String) getIntent().getSerializableExtra("machine").toString();

        txtMachineName.setText("덤벨");

        //사진 바꿔야됑
        VideoDataBean video1 = new VideoDataBean(R.drawable.upper1,"덤벨 숄더프레스",R.drawable.upper1,"","");
        video1.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/T9t0Po2yxHU\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video2 = new VideoDataBean(R.drawable.upper1,"덤벨 컬",R.drawable.upper1,"","");
        video2.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/SA1mLjTxgjU\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video3 = new VideoDataBean(R.drawable.upper1,"덤벨 프레스",R.drawable.upper1,"","");
        video3.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/ZrMM99aVVtA\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video4 = new VideoDataBean(R.drawable.upper1,"덤벨 플라이",R.drawable.upper1,"","");
        video4.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/jKY-7DYF_Qs\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video5 = new VideoDataBean(R.drawable.upper1,"원암 덤벨 로우",R.drawable.upper1,"","");
        video5.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/JKco1JuWHeo\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video6 = new VideoDataBean(R.drawable.upper1,"덤벨 킥백",R.drawable.upper1,"","");
        video6.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/IEVv7AfDNsY\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");



        List<VideoDataBean> list = new ArrayList<VideoDataBean>();
        list.add(video1);
        list.add(video2);
        list.add(video3);
        list.add(video4);
        list.add(video5);
        list.add(video6);

        ListAdapter adapter = new ListAdapter(DumbbellActivity.this, list);
        listView.setAdapter(adapter);
    }


}
