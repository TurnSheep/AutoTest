package com.coursr.testng;

import org.testng.annotations.Test;

/**
 * @ClassName ExpectedException
 * @Description TODO
 * @Author zhongyang.he
 * @Date 2020/4/23 14:30
 **/
public class ExpectedException {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimrExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimrExceptionSuccess(){
        System.out.println("这是我的异常测试");
       throw  new RuntimeException();
    }

}
