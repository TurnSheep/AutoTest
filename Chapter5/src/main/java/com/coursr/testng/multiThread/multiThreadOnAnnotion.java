package com.coursr.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @ClassName multiThreadOnAnnotion
 * @Description TODO
 * @Author zhongyang.he
 * @Date 2020/4/23 22:07
 **/
public class multiThreadOnAnnotion {
//    invocationCount线程数，threadPoolSize线程池
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test1(){
        System.out.println(1);
        System.out.println("Thread ID :%s%n"+Thread.currentThread().getId());
    }
}
