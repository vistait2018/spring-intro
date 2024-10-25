package com.tutorial.spring.intro.importer;

import com.tutorial.spring.intro.importer.BaseImporter;
import com.tutorial.spring.intro.importer.CSVImporter;
import com.tutorial.spring.intro.importer.ImporterService;
import com.tutorial.spring.intro.importer.JsonImporter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class SpringBeanConfig {

//    @Bean
//    public BaseImporter csvImporter(){
//        return new CSVImporter();
//    }
//
//    @Bean
//    public BaseImporter jsonImporter(){
//        return new JsonImporter();
//    }
//
//    @Bean(name="json")
//    public ImporterService importerJsonService(){
//        return new ImporterService(jsonImporter());
//    }
//
//    @Bean("csv")
//    public ImporterService importerCsvService(){
//        return new ImporterService(csvImporter());
//    }
}
