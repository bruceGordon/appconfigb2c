package com.lumen.b2c;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "config")
public class MessageProperties {
    private String message;
    private String isGluuRunning;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getIsGluuRunning() {
        return isGluuRunning;
    }

    public void setIsGluuRunning(String isGluuRunning) {
        this.isGluuRunning = isGluuRunning;
    }
}
