package com.guan.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by likoguan on 11/10/17.
 */
public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        context.start();
        try {
            System.in.read();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
