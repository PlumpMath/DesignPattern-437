package com.shenbaoyong.designpattern.Singleton;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Shen Baoyong on 2017/4/4.
 */
public class ResourceFactoryTest {
    @Test
    public void test(){
        Resource instance = ResourceFactory.getResource();
        Resource anotherInstance = ResourceFactory.getResource();
        Assert.assertEquals(instance, anotherInstance);
    }
}
