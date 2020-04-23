package com.coursr.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @ClassName multiThreadOnXml
 * @Description TODO
 * @Author zhongyang.he
 * @Date 2020/4/23 22:14
 **/
public class multiThreadOnXml {

    @Test
    public void test1(){
        System.out.println("Thread ID :%s%n"+Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.println("Thread ID :%s%n"+Thread.currentThread().getId());
    }

    @Test
    public void test3(){
        System.out.println("Thread ID :"+Thread.currentThread().getId());
    }
}
