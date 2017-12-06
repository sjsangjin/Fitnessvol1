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


public class Tab3Fragment extends Fragment {

    public Tab3Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab1, container, false);
        GridView gridView = (GridView) view.findViewById(R.id.gridViewUp);


        //데이터 생성
        VideoDataBean video1 = new VideoDataBean(R.drawable.squart,"1 스쿼트","운동부위:허벅지 앞",
                "주의사항\n안정성을 위해 허리는 항상 곧게 펴고, 척추의 곡선을 그대로 유지해주어야한다. 무릎을 바깥쪽 혹은 안쪽으로 굽히지 말고 일정하게 수평을 이루며 동작을 실시한다." +
                        "\n\n운동팁\n맨몸스쿼트, 바벨스쿼트, 덤벨스쿼트 등 다양하게 운동할 수 있다.");
        video1.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/VVUue5HtdRM\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video2 = new VideoDataBean(R.drawable.legpress, "2 레그프레스","운동부위:허벅지 앞",
                "주의사항\n무릎을 완전히 펴지 말고 약간 구부려주는 것이 운동 효과에 좋다. 대퇴사두근의 힘으로 지탱하며 지속적으로 실시하고 이때 엉덩이와 허리가 항상 기구에 밀착해 있어야 한다." +
                        "\n\n운동팁\n발판의 보폭을 좁게하면 대퇴부 바깥쪽이, 넓게 하면 대퇴부 안쪽이 발달된다.\n발을 발판의 윗쪽에 대고하면 대둔근이, 아래쪽에 대고 하면 대퇴사두근 아래쪽이 발달한다.");
        video2.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/0lvSmzOkeik\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video3 = new VideoDataBean(R.drawable.legcurl,"3 레그컬","운동부위:허벅지 뒤",
                "주의사항\n과도한 중량으로 동작 시 엉덩이를 사용할 경우 요통이 유발될 수 있다.\n다리를 완전히 내리지 않도록 주의한다.\n\n" +
                        "운동팁\n발을 몸쪽 방향으로 잡아 당긴 상태로 실시하면 더 큰 자극을 느낄 수 있다.");
        video3.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/xLVE_7gjUl0\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video4 = new VideoDataBean(R.drawable.legextension, "4 레그익스텐션", "운동부위:허벅지 앞",
                "주의사항\n상체에 반동이 일어나지 않도록 천천히 실시한다.\n\n운동팁\n무릎의 각도가 90도 이상 과도하게 넘지 않도록 한다.");
        video4.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/sL0DCxjxppU\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");


        List<VideoDataBean> list = new ArrayList<VideoDataBean>();
        list.add(video1);
        list.add(video2);
        list.add(video3);
        list.add(video4);


        GridViewAdapter adapter = new GridViewAdapter(getContext(), list);
        gridView.setAdapter(adapter);

        return view;

    }
}
