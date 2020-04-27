package com.course.httpclient.cookies;

import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @ClassName MyCookiesForPost
 * @Description TODO
 * @Author zhongyang.he
 * @Date 2020/4/26 22:46
 **/
public class MyCookiesForPost {
    private String url;
    private ResourceBundle bundle;
    private CookieStore cookieStore;
    @BeforeTest
    public void befortest(){
        bundle=ResourceBundle.getBundle("application", Locale.CHINA);
        url=bundle.getString("test.url");
    }

    @Test
    public void testGetCookies() throws IOException {
        String result;
//        从配置文件中拼接测试URL
        String testUrl=url+bundle.getString("getcookies.uri");
//        获取cookies信息
        cookieStore=new BasicCookieStore();
        CloseableHttpClient httpClient= HttpClients.custom().setDefaultCookieStore(cookieStore).build();
//        测试逻辑
        HttpGet httpGet=new HttpGet(testUrl);
        CloseableHttpResponse httpResponse=httpClient.execute(httpGet);
//        打印返回值
        result= EntityUtils.toString(httpResponse.getEntity(),"utf-8");
        System.out.println(result);
//        读取cookies信息
        List<Cookie> cookieList=cookieStore.getCookies();
        for (Cookie cookie:cookieList) {
            String name=cookie.getName();
            String value=cookie.getValue();
            System.out.println("cookieName="+name+"----"+"cookieValue="+value);
        }

    }
    @Test(dependsOnMethods = {"testGetCookies"})
    public void testPostWithCookies() throws IOException {
        String uri=bundle.getString("test.post.With.Cookies");
        String testurl=url+uri;
//        声明一个Client对象，用来进行方法的执行
        CloseableHttpClient httpClient= HttpClients.custom().setDefaultCookieStore(cookieStore).build();
//        声明一个方法，这个方法就是post方法
        HttpPost httpPost=new HttpPost(testurl);
//        添加参数
        JSONObject param=new JSONObject();
        param.put("name","huhansan");
        param.put("age","18");
//        设置请求头信息
        httpPost.setHeader("Content-Type","application/json");
//        将参数信息添加到方法中
        StringEntity stringEntity=new StringEntity(param.toString(),"utf-8");
        httpPost.setEntity(stringEntity);
//        声明一个对象进行响应信息进行存储
        String result;
//        执行post方法
        CloseableHttpResponse httpResponse=httpClient.execute(httpPost);
//        获取响应结果
        result= EntityUtils.toString(httpResponse.getEntity(),"utf-8");
        System.out.println(result);
//        处理结果，判断返回结果是否符合预期
        JSONObject resultJson=new JSONObject(result);
//        具体的判断返回结果的值
        String success= (String) resultJson.get("huhansan");
        String status= (String) resultJson.get("status");
        Assert.assertEquals("success",success);
        Assert.assertEquals("1",status);

    }
}
