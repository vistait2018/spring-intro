package com.tutorial.spring.intro;

import com.tutorial.spring.intro.importer.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FirstApplicationContent {
    public static void main(String[] args) {
        var applicationContext =
                new  AnnotationConfigApplicationContext(SpringConfig.class);
//        System.out.println(applicationContext.getBean("firstName"));
//        System.out.println(applicationContext.getBean("employeeNo"));
//
       // System.out.println(applicationContext.getBean("employee"));
        //System.out.println(applicationContext.getBean("oganisation1"));

       // System.out.println(applicationContext.getBean(Employee.class));
      //  System.out.println(applicationContext.getBean(Oganisation.class));


        System.out.println(applicationContext.getBean("jide"));

    }
}
