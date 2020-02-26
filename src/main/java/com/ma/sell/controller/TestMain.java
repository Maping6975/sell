package com.ma.sell.controller;

import java.io.File;
import java.io.IOException;

/**
 * @program: sell
 * @description
 * @author: mapping
 * @create: 2020-02-25
 **/
public class TestMain {
    public static void main(String[] args) {
        TestMain testMain = new TestMain();
        testMain.getUrl();
    }

    private String getUrl(){
        //获取当前类的路径  getResource("/")是获取类的根路径
        String url = this.getClass().getResource("/").getPath();
        System.out.println(url+"file");
        return url;
    }
}