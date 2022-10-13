package edu.asu.ser515.team33.syllabusgenerator.builder;

public class SyllabusDirector {
    private final String courseId;

    public SyllabusDirector(String courseId) {
        this.courseId = courseId;
    }

    public void constructSyllabus(SyllabusBuilder syllabusBuilder) {
        syllabusBuilder.buildCourseId();
        syllabusBuilder.buildCourseTitle();
        syllabusBuilder.buildCreatedAt();
        syllabusBuilder.buildVersion();
        syllabusBuilder.buildSections();
    }
}
