package com.course.httpclient.cookies;

import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @ClassName MyCookiesForGet
 * @Description TODO
 * @Author zhongyang.he
 * @Date 2020/4/25 23:26
 **/
public class MyCookiesForGet {
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
}
