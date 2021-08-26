package com.lumen.b2c;


public class Config {

    MessageProperties properties;

    public Config (MessageProperties properties) {
        this.properties = properties;
    }

    public String getMessage() {
        return properties.getMessage();
    }

    public String getIsGluuRunning() {
        return properties.getIsGluuRunning();
    }
}