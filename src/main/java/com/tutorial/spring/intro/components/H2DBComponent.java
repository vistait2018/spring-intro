package com.tutorial.spring.intro.components;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Primary
@Profile("qa")
public class H2DBComponent implements DBComponent{
    @Override
    public String performDbOperation() {
        return "Hello HDB";
    }
}
