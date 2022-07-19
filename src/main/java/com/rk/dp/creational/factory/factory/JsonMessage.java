package com.rk.dp.creational.factory.factory;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Base64.Encoder;

public class JsonMessage extends Message{

    public JsonMessage(String title, String body) {
        super(title, body);
    }

    @Override
    public String getMsg() {
       return "JSON : {"+ getTitle() + getBody() +"}";
    }
    
    @Override
    public Message encrypt() {
        Encoder base64Encoder = Base64.getEncoder();
        String body = new String(base64Encoder.encode(getBody().getBytes()), StandardCharsets.UTF_8);
        String title = new String(base64Encoder.encode(getTitle().getBytes()), StandardCharsets.UTF_8);
        return new JsonMessage(title, body);
    }

}
