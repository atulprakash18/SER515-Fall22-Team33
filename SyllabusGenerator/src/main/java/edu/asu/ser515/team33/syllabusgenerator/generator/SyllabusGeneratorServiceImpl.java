package edu.asu.ser515.team33.syllabusgenerator.generator;

import edu.asu.ser515.team33.syllabusgenerator.builder.BasicSyllabusBuilder;
import edu.asu.ser515.team33.syllabusgenerator.builder.SyllabusBuilder;
import edu.asu.ser515.team33.syllabusgenerator.builder.SyllabusDirector;
import edu.asu.ser515.team33.syllabusgenerator.syllabus.Syllabus;

public class SyllabusGeneratorServiceImpl implements SyllabusGeneratorService {
    @Override
    public Syllabus generateSyllabus(String courseId) {
        SyllabusDirector director = new SyllabusDirector(courseId);
        SyllabusBuilder syllabusBuilder = new BasicSyllabusBuilder();
        director.constructSyllabus(syllabusBuilder);

        return syllabusBuilder.getSyllabus();
    }
}
