package edu.asu.ser515.team33.syllabusgenerator.syllabus;

public class Section {
    private String id;
    private int order;
    private String title;
    private String content;

    public Section(String id, int order, String title, String content) {
        this.id = id;
        this.order = order;
        this.title = title;
        this.content = content;
    }

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

    @Override
    public String toString() {
        return "Section{" +
                "id='" + id + '\'' +
                ", order=" + order +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
