package com.shenbaoyong.designpattern.observer;

/**
 * Created by Shen Baoyong on 2017/4/4.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notiryAllObservers();
}
