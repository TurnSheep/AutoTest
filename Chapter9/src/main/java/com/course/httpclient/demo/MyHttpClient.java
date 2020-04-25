package com.course.httpclient.demo;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @ClassName MyHttpClient
 * @Description TODO
 * @Author zhongyang.he
 * @Date 2020/4/25 19:25
 **/
public class MyHttpClient {

    @Test
    public void test1() throws IOException {
        String result;
        HttpGet httpGet=new HttpGet("http://www.baidu.com");
        CloseableHttpClient httpClient= HttpClientBuilder.create().build();
        CloseableHttpResponse httpResponse=httpClient.execute(httpGet);
        result=EntityUtils.toString(httpResponse.getEntity(),"utf-8");
        System.out.println(result);

    }
}
