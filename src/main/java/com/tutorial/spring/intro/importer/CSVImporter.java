package com.tutorial.spring.intro.importer;

public class CSVImporter implements BaseImporter {

    public void importFile(){
        System.out.println("Importing Csv File");
    }
    public void getHeaders(){
        System.out.println("Providing List Of Headers in CSv");
    }
}
