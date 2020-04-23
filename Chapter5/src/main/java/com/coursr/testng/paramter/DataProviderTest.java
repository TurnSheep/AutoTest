package com.coursr.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @ClassName DataProviderTest
 * @Description TODO
 * @Author zhongyang.he
 * @Date 2020/4/23 21:11
 **/
public class DataProviderTest {

    @Test(dataProvider="data")
    public void testDataProvider(String name,int age){
        System.out.println("name="+name+"----age="+age);
    }

    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] o=new Object[][]{{"zhangsan",10},{"lisi",20},{"wangwu",30}};
        return o;
    }

    @Test(dataProvider="method")
    public void test1(String name,int age){
        System.out.println("name="+name+"----age="+age);
    }
    @Test(dataProvider="method")
    public void test2(String name,int age){
        System.out.println("name="+name+"----age="+age);
    }
    @DataProvider(name="method")
    public Object[][] methodData(Method method){
        Object[][] result=null;
        if(method.getName().equals("test1")){
            result=new Object[][]{{"zhangsan",10},{"lisi",20}};
        }else if (method.getName().equals("test2")){
            result=new Object[][]{{"wangwu",30}};
        }

        return result;
    }
}
