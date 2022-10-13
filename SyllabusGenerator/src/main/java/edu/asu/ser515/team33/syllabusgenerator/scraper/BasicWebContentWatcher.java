package edu.asu.ser515.team33.syllabusgenerator.scraper;

public class BasicWebContentWatcher extends WebContentWatcher {
    public BasicWebContentWatcher(WebContent resource) {
        super(resource);
    }

    @Override
    public void checkContentForUpdates() {
        System.out.println("Watching web content for changes: " + this.getResource());
    }
}
