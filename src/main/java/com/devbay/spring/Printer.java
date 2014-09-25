package com.devbay.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Printer {

    @Autowired
    IMessageService messageService;

    public void printMessage() {
        System.out.println(messageService.getMessage());
    }

}
