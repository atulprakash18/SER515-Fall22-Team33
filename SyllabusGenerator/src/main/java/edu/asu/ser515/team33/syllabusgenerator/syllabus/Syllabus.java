package edu.asu.ser515.team33.syllabusgenerator.syllabus;

import java.time.LocalDateTime;
import java.util.List;
public class Syllabus {
    private String courseId;
    private String courseTitle;
    private String version;
    private LocalDateTime createdAt;
    private Person author;
    private List<Section> sections;
}
