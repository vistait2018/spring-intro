package com.tutorial.spring.intro.importer;

import com.tutorial.spring.intro.model.Employee;
import com.tutorial.spring.intro.model.Oganisation;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


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
    public  Employee employee(@Qualifier("oganisation1") Oganisation oganisation){
        return new Employee(1, "jide aoppoqw",oganisation);
    }

    @Bean
    public Oganisation  oganisation1(){
        return new Oganisation(1,"Vista");
    }

    @Bean
   // @Primary
    public Oganisation  oganisation2(){
        return new Oganisation(2,"Vista2");
    }
}
