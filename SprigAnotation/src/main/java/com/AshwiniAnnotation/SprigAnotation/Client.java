package com.AshwiniAnnotation.SprigAnotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(" spring-config.xml");
        Student student = context.getBean("name", Student.class);
        student.display();
        System.out.println(student);
        ((AbstractApplicationContext) context).close();
    }
}


