package edu.asu.ser515.team33.syllabusgenerator.syllabus;

public class Section {
    private String id;
    private int order;
    private String title;
    private String content;
    private boolean isRequired;

    public void setId(String id) {
        this.id = id;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setRequired(boolean required) {
        isRequired = required;
    }
}
