package com.b2c.demo;


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