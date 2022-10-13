package edu.asu.ser515.team33.syllabusgenerator.generator.builder;

import edu.asu.ser515.team33.syllabusgenerator.syllabus.Person;
import edu.asu.ser515.team33.syllabusgenerator.syllabus.Section;
import edu.asu.ser515.team33.syllabusgenerator.syllabus.Syllabus;

import java.time.LocalDateTime;
import java.util.List;

public interface SyllabusBuilder {
    public void buildCourseId();
    public void buildCourseTitle();
    public void buildVersion();
    public void buildCreatedAt();
    public void buildSchool();
    public void buildSections();
    public Syllabus getSyllabus();
}

