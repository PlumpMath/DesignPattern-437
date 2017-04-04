package com.shenbaoyong.designpattern.Singleton;

/**
 * 参考  https://my.oschina.net/lichhao/blog/107766
 * 获取单例的工厂
 * Created by Shen Baoyong on 2017/4/4.
 */
public class ResourceFactory {
    /**
     * 虚拟机启动时，这个类不会被初始化
     */
    private static class ResourceHolder{
        public static Resource resource = new Resource();
    }

    /**
     * 第一次调用这个方法时，因为引用了，类ResourceHolder的静态成员，会加载类ResourceHolder
     * 进而初始化resource成员变量（生成一个Resource对象）
     * @return
     */
    public static Resource getResource(){
        return ResourceHolder.resource;
    }
}

/**
 * 单例类
 */
class Resource{

}

/**
 * 类的生命周期
 * 加载（Loading）、验证（Verification）、准备（Preparation）、解析（Resolution）、初始化（Initialization）、使用（Using）和卸载（Unloading）七个阶段
 *
 * 初始化一个类的条件
 * 1.虚拟机启动时，初始化含有main方法的类
 * 2.加载（Loading）、验证（Verification）、准备（Preparation）、解析（Resolution）、初始化（Initialization）、使用（Using）和卸载（Unloading）七个阶段
 * 3.对一个类进行反射调用时，如果还没有初始化这个类，需要先对其进行初始化
 * 4.遇到new、getstatic、putstatic或invokestatic这四条字节码指令
 * （使用new关键字实例化对象的时候、读取或设置一个类的静态字段（被final修饰、已在编译期把结果放入常量池的静态字段除外）的时候，以及调用一个类的静态方法的时候。）
 *
 * 被动引用不会触发类的初始化
 * 1.使用new关键字实例化对象的时候、读取或设置一个类的静态字段（被final修饰、已在编译期把结果放入常量池的静态字段除外）的时候，以及调用一个类的静态方法的时候。
 * 2.通过数组定义来引用类，不会触发此类的初始化。
 * 3.常量在编译阶段会存入调用类的常量池，本质上没有直接引用到定义常量的类，因此不会触发定义常量的类的初始化。
 */