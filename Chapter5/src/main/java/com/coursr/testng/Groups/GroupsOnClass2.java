package com.coursr.testng.Groups;

import org.testng.annotations.Test;

/**
 * @ClassName GroupsOnClass1
 * @Description TODO
 * @Author zhongyang.he
 * @Date 2020/4/23 14:18
 **/
@Test(groups = "stu")
public class GroupsOnClass2 {
    public void stu1(){
        System.out.println("GroupsOnClass2中的stu111运行");
    }
    public void stu2(){
        System.out.println("GroupsOnClass2中的stu222运行");
    }
}
