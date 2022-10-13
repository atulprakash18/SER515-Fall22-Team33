package edu.asu.ser515.team33.syllabusgenerator.generator.builder;

import edu.asu.ser515.team33.syllabusgenerator.syllabus.Person;
import edu.asu.ser515.team33.syllabusgenerator.syllabus.Section;
import edu.asu.ser515.team33.syllabusgenerator.syllabus.Syllabus;

import java.time.LocalDateTime;
import java.util.List;

public class SyllabusBuilder {
    private Syllabus syllabus;

    public SyllabusBuilder() {
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
        Section section = new Section();
        syllabus.addSections(section);
    }

    public void buildSchool() {
        syllabus.setSchool("");
    }

    public Syllabus getSyllabus() {
        return this.syllabus;
    }
}
