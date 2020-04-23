package com.coursr.testng;

import org.testng.annotations.*;

/**
 * @ClassName BasicAnnotation
 * @Description TODO
 * @Author zhongyang.he
 * @Date 2020/4/23 12:40
 **/
public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.println("这就是测试用例1");
    }
    @Test
    public void testCase2(){
        System.out.println("这就是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod在测试方法运行之前运行");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod在测试方法运行之后运行");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass在类运行之前运行");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass在类运行之后运行");
    }
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("这是BeforeSuite测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("这是afterSuite测试套件");
    }

}
