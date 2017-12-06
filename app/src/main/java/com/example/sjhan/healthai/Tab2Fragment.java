package com.example.sjhan.healthai;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;


import com.example.sjhan.healthai.Adapter.GridViewAdapter;
import com.example.sjhan.healthai.Bean.VideoDataBean;

import java.util.ArrayList;
import java.util.List;


public class Tab2Fragment extends Fragment {


    public Tab2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tab1, container, false);
        GridView gridView = (GridView) view.findViewById(R.id.gridViewUp);


        //데이터 생성
        VideoDataBean video1 = new VideoDataBean(R.drawable.latpulldown,"1 랫 풀 다운","운동부위:등",
                "주의사항\n상체가 지나치게 뒤로 넘어가지 않도록 한다.\n잡고 있는 바의 수축지점이 가슴 밑으로 내려가지 않도록 한다." +
                        "\n\n운동팁\n허벅지 윗부분을 패드 아래에 고정시켜 몸이 흔들리지 않도록 하며 허리를 세우고 가슴을 피고 있어야 한다.");
        video1.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/oP3pI794CUo\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video2 = new VideoDataBean(R.drawable.bentoverrow,"2 벤트 오버 로우","운동부위:등",
                "주의사항\n허리에 부담이 갈 수 있으므로 스트레칭을 실시해준다.\n등과 허리라인은 아치형을 유지하도록 한다.");
        video2.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/xnf8T80nCLY\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video3 = new VideoDataBean(R.drawable.onearmdumbbellrow,"3 원암 덤벨 로우","운동부위:등",
                "주의사항\n수축 시 상체가 지나치게 돌아가지 않도록 주의한다.");
        video3.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/JKco1JuWHeo\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video4 = new VideoDataBean(R.drawable.upper1,"4 루마니안 데드리프트","운동부위:등",
                "둔근, 대퇴 후면 근육 등 전신 근육 발달에 중요한 영향을 끼치는 운동이다. 근육들의 근력을 전반적으로 향상 시킬 수 있는 운동이다." +
                "\n주의사항\n무릎 각을 유지하도록 하며 상하체의 힘이 적절히 조화될 수 있도록 한다.");
        video4.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/hZSKRFBhZns\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");

        VideoDataBean video5 = new VideoDataBean(R.drawable.barbellcurl,"5 바벨 컬","운동부위:위팔 앞(이두)",
                "주의사항\n최대한 팔꿈치와 상체는 고정한 상태로 팔의 힘으로 올려준다.");
        video5.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/XRk9dp-nUYI\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video6 = new VideoDataBean(R.drawable.dumbbellcurl,"6 덤벨 컬","운동부위:위팔 앞(이두)",
                "주의사항\n팔꿈치가 앞으로 나가지 않도록 고정시킨다." +
                        "\n\n운동팁\n목표 근육의 수축에 최대한 집중하기 위해 벤치에 앉아서 실시하는 것이 좋다.");
        video6.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/SA1mLjTxgjU\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");

        List<VideoDataBean> list = new ArrayList<VideoDataBean>();
        list.add(video1);
        list.add(video2);
        list.add(video3);
        list.add(video4);
        list.add(video5);
        list.add(video6);


        GridViewAdapter adapter = new GridViewAdapter(getContext(), list);
        gridView.setAdapter(adapter);

        return view;

    }
}
