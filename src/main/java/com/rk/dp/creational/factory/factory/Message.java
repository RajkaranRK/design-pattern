package com.rk.dp.creational.factory.factory;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Base64.Encoder;

public abstract class Message {
    
    private String body;
    
    private String title;
    
    protected Message(String title, String body) {
        this.body = body;
        this.title = title;
    }
   
    
    public abstract String getMsg();


    public String getBody() {
        return body;
    }


    public String getTitle() {
        return title;
    }
    
    public Message encrypt() {
        Encoder base64Encoder = Base64.getEncoder();
        this.body = new String(base64Encoder.encode(getBody().getBytes()), StandardCharsets.UTF_8);
        this.title = new String(base64Encoder.encode(getTitle().getBytes()), StandardCharsets.UTF_8);
        return this;
    }


    @Override
    public String toString() {
        return "Message [body=" + body + ", title=" + title + "]";
    }
    
    
}
