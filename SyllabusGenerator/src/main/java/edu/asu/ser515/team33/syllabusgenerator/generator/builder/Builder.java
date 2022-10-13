package edu.asu.ser515.team33.syllabusgenerator.generator.builder;

import edu.asu.ser515.team33.syllabusgenerator.syllabus.Syllabus;

public class Builder {
    private SyllabusBuilder syllabusBuilder;

    public Builder(SyllabusBuilder syllabusBuilder) {
        this.syllabusBuilder = syllabusBuilder;
    }

    public Syllabus getSyllabus() {
        return this.syllabusBuilder.getSyllabus();
    }

    public void constructSyllabus() {
        this.syllabusBuilder.buildCourseId();
        this.syllabusBuilder.buildCourseTitle();
        this.syllabusBuilder.buildCreatedAt();
        this.syllabusBuilder.buildVersion();
        this.syllabusBuilder.buildSections();
        this.syllabusBuilder.buildSchool();
    }
}
