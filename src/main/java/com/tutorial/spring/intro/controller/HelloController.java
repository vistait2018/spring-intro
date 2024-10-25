package com.tutorial.spring.intro.controller;

import com.tutorial.spring.intro.components.HelloWorldComponent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private HelloWorldComponent helloWorldComponent;

    public HelloController(HelloWorldComponent helloWorldComponent) {
        this.helloWorldComponent = helloWorldComponent;
    }

    @GetMapping("/")
    public String sayHello(){
        return  helloWorldComponent.greet();
    }


    @GetMapping("/yaml")
    public String sayHelloYaml(){
        return helloWorldComponent.sayHelloYaml();
    }

}
