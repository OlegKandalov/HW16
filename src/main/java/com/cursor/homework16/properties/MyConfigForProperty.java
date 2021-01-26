package com.cursor.homework16.properties;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigForProperty {
    public MyConfigForProperty() {
        System.out.println("I am auto-config with the condition - property");
    }

    @Bean
    @ConditionalOnProperty(value = "custom.configuration.enabled", havingValue = "true")
    public void myBeanWithApplicationProperty() {
        System.out.println("Bean was created");
    }
}
