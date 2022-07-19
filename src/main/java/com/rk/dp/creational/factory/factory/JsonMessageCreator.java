package com.rk.dp.creational.factory.factory;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Base64.Encoder;

public class JsonMessageCreator extends MessageCreator {

    @Override
    public Message createMessage(String title, String body) {
      return new JsonMessage(title, body);
    }

}
