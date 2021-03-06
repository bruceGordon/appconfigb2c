package com.lumen.b2c;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ConfigController {

    private final MessageProperties properties;

    public ConfigController(MessageProperties properties) {
        this.properties = properties;
    }

    @GetMapping("/config")
    public MessageProperties config() {
        return properties;
    }
}