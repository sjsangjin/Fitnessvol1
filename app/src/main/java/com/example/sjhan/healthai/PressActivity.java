package com.example.sjhan.healthai;

import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.sjhan.healthai.Adapter.ListAdapter;
import com.example.sjhan.healthai.Bean.VideoDataBean;

import java.util.ArrayList;
import java.util.List;

public class PressActivity extends AppCompatActivity {

    private TextView txtMachieName;
    private GridView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_press);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getColor(R.color.actionbar)));


        TextView txtMachineName = (TextView) findViewById(R.id.machineName);
        GridView listView = (GridView) findViewById(R.id.listview);

        String machine = (String) getIntent().getSerializableExtra("machine").toString();

        txtMachineName.setText("파워 레그프레스");

        VideoDataBean video1 = new VideoDataBean(R.drawable.legpress, "레그프레스",  "운동부위:허벅지 앞",
                "주의사항\n무릎을 완전히 펴지 말고 약간 구부려주는 것이 운동 효과에 좋다. 대퇴사두근의 힘으로 지탱하며 지속적으로 실시하고 이때 엉덩이와 허리가 항상 기구에 밀착해 있어야 한다." +
                        "\n\n운동팁\n발판의 보폭을 좁게하면 대퇴부 바깥쪽이, 넓게 하면 대퇴부 안쪽이 발달된다.\n발을 발판의 윗쪽에 대고하면 대둔근이, 아래쪽에 대고 하면 대퇴사두근 아래쪽이 발달한다.");
        video1.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/0lvSmzOkeik\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video2 = new VideoDataBean(R.drawable.hipuplegpress, "힙업 레그프레스",  "운동부위:허벅지 앞, 엉덩이",
                "레그프레스 자세에서 발을 발판의 윗쪽에 대고 하면 대둔근이 발달한다.");
        video2.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/zA8_lwm0Ah4\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video3 = new VideoDataBean(R.drawable.onelegpress, "원 레그프레스",  "운동부위:허벅지 앞",
                "주의사항\n발을 골반너비로 붙이고 앉으며 중량은 일반적인 레그프레스 중량의 절반 이하로 선택한다.\n양 쪽 다리 모두 똑같은 횟수로 실시한다.");
        video3.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/tnVCvECVLPk\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");

        List<VideoDataBean> list = new ArrayList<VideoDataBean>();
        list.add(video1);
        list.add(video2);
        list.add(video3);

        ListAdapter adapter = new ListAdapter(this, list);

        listView.setAdapter(adapter);
    }
}
