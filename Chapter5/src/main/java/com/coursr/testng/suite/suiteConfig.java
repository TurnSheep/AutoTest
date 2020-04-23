package com.coursr.testng.suite;

import org.testng.annotations.*;

/**
 * @ClassName suiteConfig
 * @Description TODO
 * @Author zhongyang.he
 * @Date 2020/4/23 12:56
 **/
public class suiteConfig {
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite运行了");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite运行了");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest运行了");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest运行了");
    }
//    @BeforeClass
//    public void beforeClass(){
//        System.out.println("beforeClass运行了");
//    }
//    @AfterClass
//    public void afterClass(){
//        System.out.println("afterClass运行了");
//    }
//    @BeforeMethod
//    public void beforeMethod(){
//        System.out.println("beforeMethod运行了");
//    }
//    @AfterMethod
//    public void afterMethod(){
//        System.out.println("afterMethod运行了");
//    }
    @Test
    public void Test1(){
        System.out.println("Test1运行了");
    }
    @Test
    public void Test2(){
        System.out.println("Test2运行了");
    }
}
