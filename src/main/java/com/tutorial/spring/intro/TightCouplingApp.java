package com.tutorial.spring.intro;

import com.tutorial.spring.intro.importer.CSVImporter;
import com.tutorial.spring.intro.importer.ImporterService;

public class TightCouplingApp {
    public static void main(String[] args) {
        CSVImporter csi = new CSVImporter();
        ImporterService is = new ImporterService(csi);
        is.importAll();

    }
}
