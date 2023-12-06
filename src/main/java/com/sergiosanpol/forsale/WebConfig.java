package com.sergiosanpol.forsale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@Configuration
public class WebConfig {

    @Bean
    XmlMapper objectMapper() {
        return new XmlMapper();
    }
}
