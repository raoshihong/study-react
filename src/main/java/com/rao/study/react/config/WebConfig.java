package com.rao.study.react.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


@Configuration
public class WebConfig extends WebMvcConfigurationSupport {


    @Override
    protected void addCorsMappings(CorsRegistry registry) {
        super.addCorsMappings(registry);
        CorsRegistration corsRegistration = registry.addMapping("/**");
        corsRegistration.allowCredentials(true).
                allowedOrigins(CorsConfiguration.ALL).
                allowedHeaders(CorsConfiguration.ALL).
                allowedMethods(CorsConfiguration.ALL);
    }

}
