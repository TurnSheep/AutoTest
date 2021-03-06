package com.course.server;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @ClassName MyGetMethod
 * @Description TODO
 * @Author zhongyang.he
 * @Date 2020/4/27 15:20
 **/
@RestController
@Api(value = "/",description = "这是我全部的Post方法")
public class MyPostMethod {
//        HttpServletRequest   装请求信息的类
//        HttpServletResponse  装响应信息的类
//    这个变量是装cookies的信息
    private static Cookie cookie;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ApiOperation(value = "登陆接口，成功后获取cookies信息",httpMethod = "POST")
    public String login(HttpServletResponse response,
                        @RequestParam(value = "userName",required = true) String username,
                        @RequestParam(value = "password",required = true) String password) {
        if (username.equals("zhangsan")&&password.equals("123456")){
            cookie=new Cookie("login","true");
            response.addCookie(cookie);
            return "登陆成功";
        }
        return "用户名或密码错误";
    }

//    /**
//     * 要求客户端携带cookies访问
//     * 这是一个需要携带cookies信息才能访问的请求
//     */
//    @RequestMapping(value = "/get/with/cookies",method = RequestMethod.GET)
//    @ApiOperation(value = "要求客户端携带cookies访问",httpMethod = "GET")
//    public String getWithCookies(HttpServletRequest request){
//        Cookie[] cookies=request.getCookies();
//        if (Objects.isNull(cookies)){
//            return "你必须携带Cookies信息来";
//        }
//        for (Cookie cookie:cookies) {
//            if(cookie.getName().equals("login")&&cookie.getValue().equals("true")){
//                return "这是一个需要携带cookies信息才能访问的请求";
//            }
//        }
//        return "你必须携带Cookies信息来";
//    }
//    /**
//     * 开发一个需要携带参数信息才能访问的Get请求
//     * 第一种实现方式 url: key=value&key=value
//     * 我们来模拟获取商品列表
//     */
//    @RequestMapping(value = "/git/with/param",method = RequestMethod.GET)
//    @ApiOperation(value = "需要携带参数信息才能访问的Get请求方法一",httpMethod = "GET")
//    public Map<String,Integer> getList(@RequestParam Integer start,@RequestParam Integer end){
//        Map<String,Integer> myList=new HashMap<>();
//        myList.put("鞋",400);
//        myList.put("干脆面",1);
//        myList.put("衬衫",300);
//        return myList;
//    }
//    /**
//     * 开发一个需要携带参数信息才能访问的Get请求
//     * 第二种实现方式 url:ip:port:/get/with/param/10/20
//     * 我们来模拟获取商品列表
//     */
//    @RequestMapping(value = "/git/with/param/{start}/{end}",method = RequestMethod.GET)
//    @ApiOperation(value = "需要携带参数信息才能访问的Get请求方法二",httpMethod = "GET")
//    public Map<String,Integer> myGetList(@PathVariable Integer start,@PathVariable Integer end){
//        Map<String,Integer> myList=new HashMap<>();
//        myList.put("鞋",400);
//        myList.put("干脆面",1);
//        myList.put("衬衫",300);
//        return myList;
//    }
}
