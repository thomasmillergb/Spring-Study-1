package com.thomas;

/**
 * Created by Thomas on 30/10/2015.
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

        //HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld1");

        obj.getMessage();
    }
}