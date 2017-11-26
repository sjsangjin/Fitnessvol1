package com.example.sjhan.healthai.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sjhan.healthai.Bean.VideoDataBean;
import com.example.sjhan.healthai.R;
import com.example.sjhan.healthai.VideoDetailActivity;

import java.util.List;

/**
 * Created by sjhan on 2017-11-22.
 */

public class ListAdapter extends BaseAdapter{

    private Context context;
    private List<VideoDataBean> list;

    public ListAdapter(Context context, List<VideoDataBean> list){
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater li = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = li.inflate(R.layout.lay_video, null); //null에는 가져오고자하는 부모가 있는 경우에 써줌

        //데이터 찾는다.
        final VideoDataBean video = list.get(position);       //실행되느 시점에 누군가 변경을 하지 못하게 final선언

        //찾고자하는 뷰 기준으로 findViewById를 해야함
        ImageView imgAlbum = (ImageView)convertView.findViewById(R.id.imgPhoto);
        TextView txtTitle = (TextView)convertView.findViewById(R.id.txtTitle);

        imgAlbum.setImageResource(video.getPhoto());
        txtTitle.setText(video.getTitle());


        convertView.setOnClickListener(new View.OnClickListener() {     //new + ctrl + 스페이스
            @Override
            public void onClick(View v) {   //익명 클래스

                Intent intent = new Intent(context, VideoDetailActivity.class);

                intent.putExtra("video", video);

                context.startActivity(intent);

            }
        });

        return convertView;
    }
}
