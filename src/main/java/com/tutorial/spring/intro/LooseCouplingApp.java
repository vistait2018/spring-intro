package com.tutorial.spring.intro;

import com.tutorial.spring.intro.importer.CSVImporter;
import com.tutorial.spring.intro.importer.ImporterService;
import com.tutorial.spring.intro.importer.JsonImporter;

public class LooseCouplingApp {
    public static void main(String[] args) {
        JsonImporter jsonImporter = new JsonImporter();
        ImporterService importerService = new ImporterService(jsonImporter);
          importerService.importAll();


        CSVImporter csvImporter = new CSVImporter();
        ImporterService importerService1 = new ImporterService(csvImporter);
        importerService1.importAll();
    }



}