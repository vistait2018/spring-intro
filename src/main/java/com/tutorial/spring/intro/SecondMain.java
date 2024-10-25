package com.tutorial.spring.intro;

import com.tutorial.spring.intro.importer.ImporterService;
import com.tutorial.spring.intro.importer.SpringBeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SecondMain {
    public static void main(String[] args) {
        var applicationContext =
                new AnnotationConfigApplicationContext(SpringBeanConfig.class);

//        ImporterService importerService =
//                (ImporterService) applicationContext.getBean("json");
//
////        ImporterService importerCsvService =
//                (ImporterService) applicationContext.getBean("csv");
//        importerService.importAll();

//        importerCsvService.importAll();






    }
}
