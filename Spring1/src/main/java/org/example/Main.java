package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext apc =new ClassPathXmlApplicationContext("applicationContext.xml");
        MyFirstClass fc =apc.getBean(MyFirstClass.class,"ab");
        fc.fun1();
    }
}