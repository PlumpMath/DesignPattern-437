package com.shenbaoyong.designpattern.Singleton;

/**
 * Created by Shen Baoyong on 2017/4/4.
 */
public class EagerSingleton {

    /** 通过静态变量初始化的类实例 */
    private static final EagerSingleton instance = new EagerSingleton();

    /**
     * 私有的默认构造函数
     */
    private EagerSingleton(){

    }

    /**
     * 获取唯一类实例的静态工厂方法
     *
     * @return
     */
    public static EagerSingleton getInstance(){
        return instance;
    }
}
