package com.cursor.homework16.properties;

import com.cursor.homework16.ConfigurationEnabler;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass({ConfigurationEnabler.class})
public class MyAutoConfigForClassPath {
   public MyAutoConfigForClassPath() {
       System.out.println("I am auto-configuration with the condition - class in classpath");
   }
}
