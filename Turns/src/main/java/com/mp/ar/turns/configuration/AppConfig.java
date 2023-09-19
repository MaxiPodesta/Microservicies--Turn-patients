package com.mp.ar.turns.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class AppConfig {
    @Bean("apiConsume")
    public RestTemplate registrarTemplate(){
        return new RestTemplate();
    }
}
