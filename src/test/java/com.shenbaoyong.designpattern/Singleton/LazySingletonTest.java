package com.shenbaoyong.designpattern.Singleton;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Shen Baoyong on 2017/4/4.
 */
public class LazySingletonTest {
    @Test
    public void test(){
        LazySingleton instance = LazySingleton.getInstance();
        LazySingleton anotherInstance = LazySingleton.getInstance();
        Assert.assertEquals(instance, anotherInstance);
    }
}
