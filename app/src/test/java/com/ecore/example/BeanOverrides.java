package com.ecore.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

@TestConfiguration
@Slf4j
public class BeanOverrides {
    @Value(value = "${server.port}")
    private int port;
    @Bean(name = "applicationUrl")
    public String applicationUrl() {
        return String.format("http://localhost:%d/", port);
    }


}
