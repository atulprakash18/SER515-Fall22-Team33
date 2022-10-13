package edu.asu.ser515.team33.syllabusgenerator.builder;

import edu.asu.ser515.team33.syllabusgenerator.syllabus.Section;
import edu.asu.ser515.team33.syllabusgenerator.syllabus.Syllabus;

import java.time.LocalDateTime;

public class BasicSyllabusBuilder implements SyllabusBuilder {
    private Syllabus syllabus;

    public BasicSyllabusBuilder() {
        this.syllabus = new Syllabus();
    }

    public void buildCourseId() {
        syllabus.setCourseId("");
    }

    public void buildCourseTitle() {
        syllabus.setCourseTitle("");
    }

    public void buildVersion() {
        syllabus.setVersion("");
    }

    public void buildCreatedAt() {
        syllabus.setCreatedAt(LocalDateTime.now());
    }

    public void buildSections() {
        Section section = new Section("id", 1, "title", "content");
        syllabus.addSection(section);
    }

    public Syllabus getSyllabus() {
        return this.syllabus;
    }
}
