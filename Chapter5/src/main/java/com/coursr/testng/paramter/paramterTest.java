package com.coursr.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @ClassName paramterTest
 * @Description TODO
 * @Author zhongyang.he
 * @Date 2020/4/23 14:40
 **/
public class paramterTest {
    @Test
    @Parameters({"name","age"})
    public void paramterTest1(String name,int age){
        System.out.println("name="+name+"----age="+age);
    }
}
