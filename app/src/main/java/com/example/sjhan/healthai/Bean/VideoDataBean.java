package com.example.sjhan.healthai.Bean;

import java.io.Serializable;

public class VideoDataBean implements Serializable{

    public int photo; //영상 시작 화면
    public String title;
    public String part;
    public String descript;
    public String videoUrl;
    public String part2;


    public VideoDataBean(int photo, String title, String part2, String descript)
    {
        this.photo=photo;
        this.title=title;
        this.part2 = part2;
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

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
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

    public String getPart2(){return part2;}

    public void setPart2(String part2){
        this.part2 = part2;
    }
}
