package com.rk.dp.structural.decorator;

import java.util.Base64;

public class Base64EncodedMessage implements Message {
    
    private Message message;
    
    public Base64EncodedMessage(Message message) {
       this.message = message;
    }

    @Override
    public String getContent() {
        return new String(
                Base64.getEncoder()
                .encode(message
                        .getContent()
                        .getBytes()
                        )
                );
    }

}
