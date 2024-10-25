package com.tutorial.spring.intro.importer;

import org.springframework.stereotype.Component;
public interface BaseImporter {

   void importFile();

   void getHeaders();
}
