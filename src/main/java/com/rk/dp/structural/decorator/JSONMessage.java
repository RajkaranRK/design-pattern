package com.rk.dp.structural.decorator;


public class JSONMessage implements Message {

    private Message message;

    public JSONMessage(Message message){
        this.message = message;
    }

    @Override
    public String getContent() {
        return String.format("{\"msg\":\"%s\"}", message.getContent());
    }
}
