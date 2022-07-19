package com.rk.dp.creational.factory.factory;

public class TextMessageCreator extends MessageCreator{

    @Override
    public Message createMessage(String title, String body) {
       return new TextMessage(title, body);
    }

}
