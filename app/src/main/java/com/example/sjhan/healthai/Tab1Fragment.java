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


public class Tab1Fragment extends Fragment {


    public Tab1Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tab1, container, false);
        GridView gridView = (GridView) view.findViewById(R.id.gridViewUp);

        //데이터 생성
        VideoDataBean video1 = new VideoDataBean(R.drawable.smithbenchpress,"1 벤치 프레스","운동부위:가슴",
                "주의사항\n가슴 부위로 지나치게 내리는 경우 어깨관련 근육에 손상이 발생할 수 있다.\n손목이 지나치게 꺾이지 않도록 한다." +
                        "\n\n운동팁\n운동 중 팔꿈치를 완전히 펴지 않는다.");
        video1.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/LWIdFqkHUXQ\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");

        VideoDataBean video2 = new VideoDataBean(R.drawable.dumbbellfly,"2 인클라인 벤치프레스","운동부위:윗가슴",
                "");
        video2.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/TCthmlUhpo\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");

        VideoDataBean video3 = new VideoDataBean(R.drawable.dumbbellfly,"3 덤벨 플라이","운동부위:가슴",
                "가슴 안쪽 라인을 발달시키는 데 필수적인 운동으로 추천된다.\n주의사항\n덤벨이 어깨 밑으로 지나치게 내려갈 경우 어깨 주변 근육의 상해를 유발할 수 있다." +
                        "\n\n운동팁\n두 손의 그립은 몸쪽을 향하도록 하며 팔꿈치의 각도가 너무 굽혀져서도 너무 펴져서도 안 된다.");
        video3.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/jKY-7DYF_Qs\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");

        VideoDataBean video4 = new VideoDataBean(R.drawable.dumbbellsholderpress,"4 덤벨 숄더프레스","운동부위:어꺠",
                "주의사항\n덤벨이 지나치게 몸쪽이나 바깥쪽으로 나가면 주변 근육의 상해의 위험이 있으므로 주의한다.\n덤벨이 뒤족으로 넘어가게 되면 어깨 탈구의 위험이 증가하게 되므로 주의한다." +
                        "\n\n운동팁\n덤벨이 서로 부딪히거나 팔꿈치가 완전히 펴지게 되지 않도록 주의한다.");
        video4.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/T9t0Po2yxHU\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");

        VideoDataBean video5 = new VideoDataBean(R.drawable.dumbbellside,"5 덤벨 사이드레터럴레이즈","운동부위:어깨",
                "주의사항\n승모근의 개입없이 해야한다.\n어깨에 힘이 많이 들어가는 경우 경갑골을 뒤로하고 상체를 살짝 앞으로 숙ㅇ");
        video5.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/waFBA39TwRY\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");

        VideoDataBean video6 = new VideoDataBean(R.drawable.dumbbelltriceps,"6 덤벨 트라이셉스 익스텐션","운동부위:위팔 뒤(삼두)",
                "주의사항\n가슴과 허리를 펴주고 고개가 앞으로 나오지 않게 주의한다.\n뒤로 덤벨을 내릴때 팔꿈치를 과도하게 움직여 반동을 사용하지 않도록 한다.");
        video6.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/vOfMmuS0snE\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");

        VideoDataBean video7 = new VideoDataBean(R.drawable.dumbbellkickback,"7 덤벨 킥백","운동부위:위팔 뒤(삼두)",
                "주의사항\n등이 지면과 수평에 가깝게 하며 어깨가 과도하게 등 위로 올라가지 않도록 한다.\n운동 중 팔은 옆구리에 붙이고 팔꿈치 각도가 90도 이하가 되지 않게 한다.");
        video7.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/IEVv7AfDNsY\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");


        List<VideoDataBean> list = new ArrayList<VideoDataBean>();
        list.add(video1);
        list.add(video2);
        list.add(video3);
        list.add(video4);
        list.add(video5);
        list.add(video6);
        list.add(video7);

        GridViewAdapter adapter = new GridViewAdapter(getContext(), list);
        gridView.setAdapter(adapter);

        return view;

    }

}
