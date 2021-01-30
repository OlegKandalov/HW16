package com.cursor.homework16.properties;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoConfigForProperty {
    public AutoConfigForProperty() {
    }

    @Bean
    @ConditionalOnProperty(value = "custom.configuration.enabled", havingValue = "true")
    public void BeanWithApplicationProperty() {
    }
}
