package edu.asu.ser515.team33.syllabusgenerator.scraper;

import java.net.URL;
import java.time.LocalDateTime;

public class WebContent {
    private URL url;
    private String domSelector;
    private LocalDateTime lastCheckTimestamp;
    private String lastContentHash;
    private String content;
}
