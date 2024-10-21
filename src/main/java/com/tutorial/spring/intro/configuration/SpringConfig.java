package com.tutorial.spring.intro.configuration;

import com.tutorial.spring.intro.model.Employee;
import com.tutorial.spring.intro.model.Oganisation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringConfig {
    @Bean
    public String firstName(){
        return "Jide";
    }
    @Bean
    public int employeeNo(){
        return 1;
    }

    @Bean(name = "jide")
    public  Employee employee(){
        return new Employee(1, "jide aoppoqw",oganisation());
    }

    @Bean
    public Oganisation  oganisation(){
        return new Oganisation(1,"Vista");
    }
}
