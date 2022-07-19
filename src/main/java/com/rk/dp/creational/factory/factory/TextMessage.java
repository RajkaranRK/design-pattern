package com.rk.dp.creational.factory.factory;

public class TextMessage extends Message {

    public TextMessage(String title, String body) {
        super(title, body);
    }

    @Override
    public String getMsg() {
        return "TEXT" + getTitle() + getBody();
    }
}
