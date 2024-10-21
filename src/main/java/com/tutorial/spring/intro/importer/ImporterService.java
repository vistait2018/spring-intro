package com.tutorial.spring.intro.importer;

public class ImporterService {

    private final BaseImporter baseImporter;

    public ImporterService(BaseImporter baseImporter) {
        this.baseImporter = baseImporter;
    }


    public void importAll(){
        System.out.println("importing file from Csv "+this.baseImporter);
        System.out.println("--------------------------------");
        this.baseImporter.importFile();
       this.baseImporter.getHeaders();
    }
}
