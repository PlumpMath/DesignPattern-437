package com.shenbaoyong.designpattern.observer;

import org.junit.Test;

/**
 * Created by Shen Baoyong on 2017/4/4.
 */
public class ObserverTest {
    @Test
    public void test(){
        VideoSite videoSite = new VideoSite();
        VideoFans fans1 = new VideoFans("zhang san");
        VideoFans fans2 = new VideoFans("li si");

        videoSite.registerObserver(fans1);
        videoSite.addVideos("video_1");

        videoSite.registerObserver(fans2);
        videoSite.addVideos("video_2");
    }
}
