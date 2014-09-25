package com.devbay.spring.Impl;

import com.devbay.spring.IMessageService;
import org.springframework.stereotype.Component;

public class MessageService implements IMessageService {
    @Override
    public String getMessage() {
        return "Hello Spring by XML!";
    }
}
