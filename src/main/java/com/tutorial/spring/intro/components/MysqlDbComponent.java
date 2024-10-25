package com.tutorial.spring.intro.components;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class MysqlDbComponent implements DBComponent{
    @Override
    public String performDbOperation() {
       return "Hello MysqlDB";
    }
}
