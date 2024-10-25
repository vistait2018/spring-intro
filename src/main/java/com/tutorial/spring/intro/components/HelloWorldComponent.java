package com.tutorial.spring.intro.components;

import com.tutorial.spring.intro.config.ConfigPrefix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldComponent {

     @Autowired
     private ConfigPrefix configPrefix;
    @Value("${custom.property.message}")
    private String message;

    @Value("${custom.yaml.message}")
    private String yamlMessage;
    public String greet(){
        //return message;

        return message+" "+ configPrefix.getFirstName() +" "+ configPrefix.getLastName();
    }

    public String sayHelloYaml() {
        return yamlMessage+" "+ configPrefix.getFirstName() +" "+ configPrefix.getLastName();
    }
}
