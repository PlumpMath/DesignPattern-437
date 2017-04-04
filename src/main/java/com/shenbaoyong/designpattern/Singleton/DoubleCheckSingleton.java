package com.shenbaoyong.designpattern.Singleton;

/**
 * Created by Shen Baoyong on 2017/4/4.
 */
public class DoubleCheckSingleton {

    /**
     * 此时静态变量不能声明为final，因为需要在工厂方法中对它进行实例化
     */
    private static DoubleCheckSingleton instance;

    /**
     * 私有构造函数，确保无法在类外实例化该类
     */
    private DoubleCheckSingleton(){

    }

    /**
     *既能解决同步问题，又能保证instance实例化后不会再有线程去获取锁
     */
    public static DoubleCheckSingleton getInstance(){
        if(instance == null){
            synchronized (DoubleCheckSingleton.class){
                if(instance == null){
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
