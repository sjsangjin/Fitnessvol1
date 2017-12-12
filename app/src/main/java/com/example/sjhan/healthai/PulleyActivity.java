package com.example.sjhan.healthai;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.sjhan.healthai.Adapter.ListAdapter;
import com.example.sjhan.healthai.Bean.VideoDataBean;
import com.example.sjhan.healthai.Util.ActivityUtil;

import java.util.ArrayList;
import java.util.List;

public class PulleyActivity extends AppCompatActivity {

    private TextView txtMachieName;
    private GridView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pulley);
        ActivityUtil.setActionBarColor(this, R.color.colorAccent);


        TextView txtMachineName = (TextView)findViewById(R.id.machineName);
        GridView listView = (GridView)findViewById(R.id.listview);

//        String machine = (String) getIntent().getSerializableExtra("machine").toString();

        txtMachineName.setText("하이 풀리");

        VideoDataBean video1 = new VideoDataBean(R.drawable.latpulldown,"랫 풀 다운","운동부위:등",
                "주의사항\n상체가 지나치게 뒤로 넘어가지 않도록 한다.\n잡고 있는 바의 수축지점이 가슴 밑으로 내려가지 않도록 한다." +
                "\n\n운동팁\n허벅지 윗부분을 패드 아래에 고정시켜 몸이 흔들리지 않도록 하며 허리를 세우고 가슴을 피고 있어야 한다.");
        video1.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/oP3pI794CUo\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video2 = new VideoDataBean(R.drawable.behindlatpulldown,"비하인드 랫 풀 다운","운동부위:등",
                "주의사항\n유연성이 부족한 경우 바를 당길 때 몸통을 앞으로 ㅅ라짝 내밀어서 운동을한다." +
                "\n\n운동팁\n랫 풀 다운보다 조금 더 넓게 잡는다..\n바를 당길 때는 빠르게, 내려놓을 때는 천천히 내려놓는다.\n허벅지 윗부분을 패드 아래에 고정시켜 몸이 흔들리지 않도록 하며 허리를 세우고 가슴을 피고 있어야 한다.");
        video2.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/B1qXfXW5cPw\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");

        List<VideoDataBean> list = new ArrayList<VideoDataBean>();
        list.add(video1);
        list.add(video2);

        ListAdapter adapter = new ListAdapter(this, list);
        listView.setAdapter(adapter);
    }
}
