package com.shenbaoyong.designpattern.observer;

/**
 * Created by Shen Baoyong on 2017/4/4.
 */
public class VideoFans implements Observer {
    private String name;

    public VideoFans(String name) {
        this.name = name;
    }

    public void update(Subject s) {
        System.out.println("----------------------");
        System.out.println(name + ": new videos are available!!");
        System.out.println(s);
    }
}
