package com.shenbaoyong.designpattern.Singleton;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Shen Baoyong on 2017/4/4.
 */
public class DoubleCheckSingletonTest {
    @Test
    public void test()
    {
        DoubleCheckSingleton instance = DoubleCheckSingleton.getInstance();
        DoubleCheckSingleton anotherInstance = DoubleCheckSingleton.getInstance();
        Assert.assertEquals(instance, anotherInstance);
    }
}
