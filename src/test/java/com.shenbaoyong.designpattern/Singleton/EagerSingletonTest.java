package com.shenbaoyong.designpattern.Singleton;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Shen Baoyong on 2017/4/4.
 */
public class EagerSingletonTest {
    @Test
    public void test(){
        EagerSingleton instance = EagerSingleton.getInstance();
        EagerSingleton anotherInstance = EagerSingleton.getInstance();
        Assert.assertEquals(instance, anotherInstance);
    }
}
