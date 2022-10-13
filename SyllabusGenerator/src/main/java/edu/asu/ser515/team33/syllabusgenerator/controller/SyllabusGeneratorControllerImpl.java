package edu.asu.ser515.team33.syllabusgenerator.controller;

import edu.asu.ser515.team33.syllabusgenerator.exporter.SyllabusExporterService;
import edu.asu.ser515.team33.syllabusgenerator.generator.SyllabusGeneratorService;
import edu.asu.ser515.team33.syllabusgenerator.importer.SyllabusImporterService;

public class SyllabusGeneratorControllerImpl {
    private SyllabusGeneratorService generatorService;
    private SyllabusExporterService exporterService;
    private SyllabusImporterService importerService;

    public void initiateSyllabusGenerationWorkflow(String courseId) {
        // TODO Syllabus Generation workflow
        System.out.println("Initiated syllabus generation workflow in Syllabus Generator");
    }
}
