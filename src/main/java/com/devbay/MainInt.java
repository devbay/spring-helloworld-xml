package com.devbay;

import com.devbay.spring.Printer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainInt {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Printer printer = context.getBean(Printer.class);
        printer.printMessage();
    }
}

