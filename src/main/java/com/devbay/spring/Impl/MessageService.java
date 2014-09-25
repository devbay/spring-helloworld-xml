package com.devbay.spring.Impl;

import com.devbay.spring.IMessageService;

public class MessageService implements IMessageService {
    @Override
    public String getMessage() {
        return "Hello Spring by XML!";
    }
}
