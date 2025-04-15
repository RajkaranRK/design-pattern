package com.rk.dp.structural.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {
    
    public static void main(String[]args) {
        Message message = new TextMessage("Good Morning");
        log.info("Plain text message : {}",message.getContent());
        message = new Base64EncodedMessage(message);
        log.info("Encrypted message : {}",message.getContent());
        message = new JSONMessage(message);
        log.info("JSON formatted message : {}",message.getContent());
    }

}
