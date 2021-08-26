package com.b2c.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConfigController {

    private final MessageProperties properties;

    public ConfigController(MessageProperties properties) {
        this.properties = properties;
    }

    @GetMapping("/config")
    public Config config() {
        return new Config(properties);
    }
}