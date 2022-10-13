package main.java.edu.asu.ser515.team33.syllabusgenerator.adapter;

import edu.asu.ser515.team33.syllabusgenerator.exporter.SyllabusExporterService;
import edu.asu.ser515.team33.syllabusgenerator.generator.SyllabusGeneratorService;
import edu.asu.ser515.team33.syllabusgenerator.importer.SyllabusImporterService;

import java.io.InputStream;

public class syllabusGenerationAdapter implements canvas{

    SyllabusGenerationController syllabusGenerationController;

    private SyllabusGeneratorService generatorService;
    private edu.asu.ser515.team33.syllabusgenerator.exporter.SyllabusExporterService exporterService;
    private edu.asu.ser515.team33.syllabusgenerator.importer.SyllabusImporterService importerService;

    public syllabusGenerationAdapter(SyllabusGeneratorService generatorService, SyllabusExporterService exporterService, SyllabusImporterService importerService) {
        // constructor to initialize class variables
        this.generatorService = generatorService;
        this.exporterService = exporterService;
        this.importerService = importerService;
    }

    @Override
    public void generateSyllabusInCanvas(String courseID) {
        System.out.println("Create new syllabus");
        syllabusGenerationController.createSyllabus(File syllabus);
    }
}
