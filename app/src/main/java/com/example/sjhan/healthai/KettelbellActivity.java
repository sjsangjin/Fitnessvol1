package com.example.sjhan.healthai;

//유튜브 6개 모을것!

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

public class KettelbellActivity extends AppCompatActivity {

    private TextView txtMachieName;
    private GridView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kettelbell);
        ActivityUtil.setActionBarColor(this, R.color.colorAccent);


        TextView txtMachineName = (TextView) findViewById(R.id.machineName);
        GridView listView = (GridView) findViewById(R.id.listview);

//        String machine = (String) getIntent().getSerializableExtra("kettlebell").toString();

        txtMachineName.setText("케틀벨");

        VideoDataBean video1 = new VideoDataBean(R.drawable.kettelbellswing, "케틀벨 스윙", "운동부위:전신",
                "주의사항\n20회정도 반복가능한 무게로 실시한다.\n허리가 앞으로 말리지 않게 코어에 지속적으로 힘을 준다.\n들어올리는 동작에서 배를 과하게 내밀지 않는다.\n\n운동팁\n진자운동을 하듯 앞뒤로 움직인다.");
        video1.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"400\" src=\"https://www.youtube.com/embed/v2eqKv9Z4Zc\" frameborder=\"0\" width=\"640\" height=\"400\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video2 = new VideoDataBean(R.drawable.kettelbellsquart, "케틀벨 스쿼트", "운동부위:허벅지, 엉덩이",
                "주의사항\n엉덩이를 뒤로 빼고 케틀벨에 최대한 붙여 허리를 곧게 펴준다.\n허리가 앞으로 말리지 않게 코어에 지속적으로 힘을 준다.");
        video2.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"400\" src=\"https://www.youtube.com/embed/hWy_Ixx0jOU\" frameborder=\"0\" width=\"640\" height=\"400\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video3 = new VideoDataBean(R.drawable.kettelbellpushpress, "케틀벨 푸쉬 프레스", "운동부위:허벅지, 허리, 어깨",
                "주의사항\n적당한 무게의 케틀벨을 선택한다.");
        video3.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"400\" src=\"https://www.youtube.com/embed/nW6obVt0KjQ\" frameborder=\"0\" width=\"640\" height=\"400\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video4 = new VideoDataBean(R.drawable.kettlebelldeadlift, "케틀벨 데드리프트",  "운동부위:허리",
                "주의사항\n허리가 굽어져서 내려가지 않도록 주의한다.");
        video4.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"400\" src=\"https://www.youtube.com/embed/9AaMdXB0cEw\" frameborder=\"0\" width=\"640\" height=\"400\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video5 = new VideoDataBean(R.drawable.kettlebellsnatch, "케틀벨 스내치", "운동부위:전신, 코어",
                "주의사항\n허리를 튕기지 않도록 주의한다.\n동작 간에 등과 허리는 항상 1자로 유지하며 실시한다.\n\n운동팁\n스내치 동작 간에 배에 힘을 꾹 주고하면 코어에 도움이 된다.");
        video5.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"400\" src=\"https://www.youtube.com/embed/aGsQjCe7GOc\" frameborder=\"0\" width=\"640\" height=\"400\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");

        List<VideoDataBean> list = new ArrayList<VideoDataBean>();
        list.add(video1);
        list.add(video2);
        list.add(video3);
        list.add(video4);
        list.add(video5);

        ListAdapter adapter = new ListAdapter(this, list);

        listView.setAdapter(adapter);

    }
}
