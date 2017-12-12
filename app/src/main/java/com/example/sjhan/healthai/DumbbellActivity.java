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

public class DumbbellActivity extends AppCompatActivity {

    private TextView txtMachieName;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dumbbell);
        ActivityUtil.setActionBarColor(this, R.color.colorAccent);

        TextView txtMachineName = (TextView) findViewById(R.id.machineName);
        GridView listView = (GridView) findViewById(R.id.listview);

        txtMachineName.setText("덤벨");

        VideoDataBean video1 = new VideoDataBean(R.drawable.dumbbellsholderpress,"덤벨 숄더프레스","운동부위:어깨",
                "주의사항\n덤벨이 지나치게 몸쪽이나 바깥쪽으로 나가면 주변 근육의 상해의 위험이 있으므로 주의한다.\n덤벨이 뒤쪽으로 넘어가게 되면 어깨 탈구의 위험이 증가하게 되므로 주의한다." +
                        "\n\n운동팁\n덤벨이 서로 부딪히거나 팔꿈치가 완전히 펴지게 되지 않도록 주의한다.");
        video1.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/T9t0Po2yxHU\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video2 = new VideoDataBean(R.drawable.dumbbellcurl,"덤벨 컬","운동부위:위팔 앞(이두)",
                "주의사항\n팔꿈치가 앞으로 나가지 않도록 고정시킨다." +
                        "\n\n운동팁\n목표 근육의 수축에 최대한 집중하기 위해 벤치에 앉아서 실시하는 것이 좋다.");
        video2.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/SA1mLjTxgjU\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video3 = new VideoDataBean(R.drawable.dumbbellpress,"덤벨 벤치프레스","운동부위:가슴",
                "주의사항\n덤벨을 내리면서 어깨가 등 뒤로 과도하게 젖혀지면 어깨 주변 근육의 부상위험이 커질 수 있다." +
                        "\n\n운동팁\n덤벨을 밀어 올리는 동작에서 양손이 벌어지지 않게 살짝 모아줌으로써 대흉근의 수축을 최대화한다." +
                "\n팔로만 미는 경우엔 가슴 근육의 발달이 이루어지지 않으며 덤벨을 당기고 밀어올릴 때 전완이 양옆으로 벌어지지 않고 수직을 유지하도록 한다.");
        video3.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/ZrMM99aVVtA\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video4 = new VideoDataBean(R.drawable.dumbbellfly,"덤벨 플라이","운동부위:가슴",
                "가슴 안쪽 라인을 발달시키는 데 필수적인 운동으로 추천된다.\n주의사항\n덤벨이 어깨 밑으로 지나치게 내려갈 경우 어깨 주변 근육의 상해를 유발할 수 있다." +
                        "\n\n운동팁\n두 손의 그립은 몸쪽을 향하도록 하며 팔꿈치의 각도가 너무 굽혀져서도 너무 펴져서도 안 된다.");
        video4.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/jKY-7DYF_Qs\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video5 = new VideoDataBean(R.drawable.onearmdumbbellrow,"원암 덤벨 로우","운동부위:등",
                "주의사항\n수축 시 상체가 지나치게 돌아가지 않도록 주의한다.");
        video5.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/JKco1JuWHeo\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video6 = new VideoDataBean(R.drawable.dumbbellkickback,"덤벨 킥백","위팔 뒤(삼두)",
                "주의사항\n등이 지면과 수평에 가깝게 하며 어깨가 과도하게 등 위로 올라가지 않도록 한다.\n운동 중 팔은 옆구리에 붙이고 팔꿈치 각도가 90도 이하가 되지 않게 한다.");
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
