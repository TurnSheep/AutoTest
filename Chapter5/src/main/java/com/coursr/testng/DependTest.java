package com.coursr.testng;

import org.testng.annotations.Test;

/**
 * @ClassName DependTest
 * @Description TODO
 * @Author zhongyang.he
 * @Date 2020/4/23 14:36
 **/
public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}
