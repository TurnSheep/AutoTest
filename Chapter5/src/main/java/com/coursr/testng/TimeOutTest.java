package com.coursr.testng;

import org.testng.annotations.Test;

/**
 * @ClassName timeOutTest
 * @Description TODO
 * @Author zhongyang.he
 * @Date 2020/4/23 22:37
 **/
public class TimeOutTest {

    @Test(timeOut = 3000)
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
    }
    @Test(timeOut = 2000)
    public void testFailed() throws InterruptedException {
        Thread.sleep(3000);
    }
}
