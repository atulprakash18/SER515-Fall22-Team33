package edu.asu.ser515.team33.syllabusgenerator.syllabus;

import java.time.LocalDateTime;
import java.util.List;
public class Syllabus {
    private String courseId;
    private String courseTitle;
    private String school;
    private String version;
    private LocalDateTime createdAt;
    private List<Section> sections;

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void addSections(Section section) {
        this.sections.add(section);
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
