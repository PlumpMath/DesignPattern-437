package com.shenbaoyong.designpattern.Singleton;

/**
 * Created by Shen Baoyong on 2017/4/4.
 */
public class LazySingleton {
    /**
     * 此时静态变量不能声明为final，因为需要在工厂方法中对它进行实例化
     */
    private static LazySingleton instance;

    /**
     * 私有构造函数，确保无法在类外实例化该类
     */
    private LazySingleton(){

    }

    /**
     * synchronized 解决多线程同步问题
     */
    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
