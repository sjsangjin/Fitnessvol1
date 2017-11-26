package com.example.sjhan.healthai.Bean;

import java.io.Serializable;

public class VideoDataBean implements Serializable{

    public int photo; //영상 시작 화면
    public String title;
    public int part;
    public String descript;
    public String videoUrl;


    public VideoDataBean(int photo, String title, int part, String descript)
    {
        this.photo=photo;
        this.title=title;
        this.part=part;
        this.descript=descript;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPart() {
        return part;
    }

    public void setPart(int part) {
        this.part = part;
    }

    public String getDescript(){
        return descript;
    }

    public void setDescript(String descript){
        this.descript = descript;
    }


    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

}
