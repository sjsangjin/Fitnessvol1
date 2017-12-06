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


public class Tab4Fragment extends Fragment {

    public Tab4Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab1, container, false);
        GridView gridView = (GridView) view.findViewById(R.id.gridViewUp);


        VideoDataBean video1 = new VideoDataBean(R.drawable.rollerneck,"폼롤러스트레칭-목,어깨","운동부위:목, 어깨", "");
        video1.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/4rKInO5sL-s\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video2 = new VideoDataBean(R.drawable.rollerleg,"폼롤러스트레칭-하체","운동부위:하체","");
        video2.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/B1qXfXW5cPw\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video3 = new VideoDataBean(R.drawable.rollerbackbone,"폼롤러스트레칭-척추","운동부위:척추","");
        video3.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/PR-W-5lldME\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video4 = new VideoDataBean(R.drawable.rollerbody,"폼롤러스트레칭-전신","운동부위:전신","");
        video4.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/h1OsPKL08No\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video5 = new VideoDataBean(R.drawable.rollerbelly,"폼롤러스트레칭-복부","운동부위:복부","");
        video5.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/MFOkyPHMEBg\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");
        VideoDataBean video6 = new VideoDataBean(R.drawable.rollercalf,"폼롤러스트레칭-종아리","운동부위:종아리","");
        video6.setVideoUrl("<div style=\"position:relative;height:0;padding-bottom:56.25%\"><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/9sUbDZrVus4\" frameborder=\"0\" width=\"640\" height=\"360\" style=\"position:absolute;width:100%;height:100%;left:0\" allowfullscreen></iframe></div>");


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
