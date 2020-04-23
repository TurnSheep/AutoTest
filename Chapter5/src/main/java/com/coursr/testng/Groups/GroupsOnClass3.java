package com.coursr.testng.Groups;

import org.testng.annotations.Test;

/**
 * @ClassName GroupsOnClass1
 * @Description TODO
 * @Author zhongyang.he
 * @Date 2020/4/23 14:18
 **/
@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void tearch1(){
        System.out.println("GroupsOnClass3中的tearch111运行");
    }
    public void tearch2(){
        System.out.println("GroupsOnClass3中的tearch222运行");
    }
}
