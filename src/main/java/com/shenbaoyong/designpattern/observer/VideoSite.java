package com.shenbaoyong.designpattern.observer;

import java.util.ArrayList;

/**
 * Created by Shen Baoyong on 2017/4/4.
 */
public class VideoSite implements Subject {

    /**订阅者列表*/
    private ArrayList<Observer> userList;
    /**自己的内容（广播）*/
    private ArrayList<String> videos;

    public VideoSite() {
        this.userList = new ArrayList<Observer>();
        this.videos = new ArrayList<String>();
    }

    /**
     * 增加订阅者
     */
    public void registerObserver(Observer o) {
        userList.add(o);
    }

    /**
     * 删除订阅者
     */
    public void removeObserver(Observer o) {
        userList.remove(o);
    }

    /**
     * 通知所有的订阅者
     */
    public void notiryAllObservers() {
        for (Observer observer : userList) {
            observer.update(this);
        }
    }

    /**
     * 增加新的广播时通知所有订阅者
     */
    public void addVideos(String video){
        videos.add(video);
        notiryAllObservers();
    }

    public ArrayList<String> getVideos() {
        return videos;
    }

    public String toString(){
        return videos.toString();
    }
}
