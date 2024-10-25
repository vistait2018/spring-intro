package com.tutorial.spring.intro.importer;

import org.springframework.stereotype.Component;

@Component()
public class JsonImporter implements BaseImporter {
    public void importFile(){
        System.out.println("Importing Json File");
    }
    public void getHeaders(){
        System.out.println("Providiing List Of Headers in Json");
    }
}
