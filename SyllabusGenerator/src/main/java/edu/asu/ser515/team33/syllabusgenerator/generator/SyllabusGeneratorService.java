package edu.asu.ser515.team33.syllabusgenerator.generator;

import edu.asu.ser515.team33.syllabusgenerator.generator.builder.Builder;
import edu.asu.ser515.team33.syllabusgenerator.generator.builder.SyllabusBuilder;
import edu.asu.ser515.team33.syllabusgenerator.syllabus.Section;
import edu.asu.ser515.team33.syllabusgenerator.syllabus.Syllabus;

public class SyllabusGeneratorService {
    public Syllabus buildSyllabus() {
        SyllabusBuilder syllabusBuilder = new SyllabusBuilder();
        Builder builder = new Builder(syllabusBuilder);

        builder.constructSyllabus();

        Syllabus syllabus = builder.getSyllabus();

        return null;
    }
}
