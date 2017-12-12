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

public class SmithActivity extends AppCompatActivity {

    private TextView txtMachieName;
    private GridView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smith);
        ActivityUtil.setActionBarColor(this, R.color.colorAccent);


        TextView txtMachineName = (TextView)findViewById(R.id.machineName);
        GridView listView = (GridView)findViewById(R.id.listview);

//        String machine = (String) getIntent().getSerializableExtra("smith").toString();

        txtMachineName.setText("스미스머신");

        VideoDataBean video1 = new VideoDataBean(R.drawable.deadlift,"루마니안 데드리프트","운동부위:허리",
                "둔근, 대퇴 후면 근육 등 전신 근육 발달에 중요한 영향을 끼치는 운동이다. 근육들의 근력을 전반적으로 향상 시킬 수 있는 운동이다." +
                        "\n주의사항\n무릎 각을 유지하도록 하며 상하체의 힘이 적절히 조화될 수 있도록 한다.");
        video1.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/Vi-RLKMYmgI\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video2 = new VideoDataBean(R.drawable.bentoverrow,"벤트 오버 바벨로우","운동부위:등",
                "주의사항\n허리에 부담이 갈 수 있으므로 스트레칭을 실시해준다.\n등과 허리라인은 아치형을 유지하도록 한다.");
        video2.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/xnf8T80nCLY\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video3 = new VideoDataBean(R.drawable.squart,"스쿼트","운동부위:허벅지 앞",
                "주의사항\n안정성을 위해 허리는 항상 곧게 펴고, 척추의 곡선을 그대로 유지해주어야한다. 무릎을 바깥쪽 혹은 안쪽으로 굽히지 말고 일정하게 수평을 이루며 동작을 실시한다." +
                        "\n\n운동팁\n맨몸스쿼트, 바벨스쿼트, 덤벨스쿼트 등 다양하게 운동할 수 있다.");
        video3.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/VVUue5HtdRM\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video4 = new VideoDataBean(R.drawable.behindneckpress,"비하인드 넥 프레스","운동부위:어깨",
                "w주의사항\n허리가 지나치게 젖혀지지 않도록 자세를 유지한다.\n상체가 앞으로 나오지 않도록 주의한다." +
                        "\n\n운동팁\n바벨 숄더프레스보다 약간 더 가벼운 중량을 이용하며 견갑골을 가능한 등 뒤로 당겨놓은 상태에서 동작하는 것이 관절의 안정성을 높일 수 있다.");
        video4.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/WjtlVYVwKU0\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video5 = new VideoDataBean(R.drawable.smithbenchpress,"벤치 프레스","운동부위:가슴",
                "주의사항\n가슴 부위로 지나치게 내리는 경우 어깨관련 근육에 손상이 발생할 수 있다.\n손목이 지나치게 꺾이지 않도록 한다." +
                "\n\n운동팁\n운동 중 팔꿈치를 완전히 펴지 않는다.");
        video5.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/LWIdFqkHUXQ\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video6 = new VideoDataBean(R.drawable.smithcarfraise,"카프레이즈","운동부위:종아리",
                "주의사항\n운동 중 무릎이 굽혀지지 않도록 한다.");
        video6.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/vwKndcWuQ7E\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");

        List<VideoDataBean> list = new ArrayList<VideoDataBean>();
        list.add(video1);
        list.add(video2);
        list.add(video3);
        list.add(video4);
        list.add(video5);
        list.add(video6);

        ListAdapter adapter = new ListAdapter(this, list);
        listView.setAdapter(adapter);

    }
}
