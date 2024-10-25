package com.tutorial.spring.intro.importer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component()
@Primary
public class CSVImporter implements BaseImporter {


    public CSVImporter(){
        System.out.println("Working with Csv");
    }
    public void importFile(){
        System.out.println("Importing Csv File");
    }
    public void getHeaders(){
        System.out.println("Providing List Of Headers in CSv");
    }
}
