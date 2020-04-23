package com.coursr.testng;

import org.testng.annotations.Test;

/**
 * @ClassName IgnoreTest
 * @Description TODO
 * @Author zhongyang.he
 * @Date 2020/4/23 13:54
 **/
public class IgnoreTest {
    @Test
    public void Ignore1(){
        System.out.println("Ignore1执行");
    }

//    enabled=false  不执行该方法，不填写enabled时默认为true
    @Test(enabled = false)
    public void Ignore2(){
        System.out.println("Ignore2执行");
    }
}
