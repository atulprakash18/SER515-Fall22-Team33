package edu.asu.ser515.team33.syllabusgenerator;

import edu.asu.ser515.team33.syllabusgenerator.generator.SyllabusGeneratorService;
import edu.asu.ser515.team33.syllabusgenerator.generator.SyllabusGeneratorServiceImpl;
import edu.asu.ser515.team33.syllabusgenerator.scraper.BasicWebContentWatcher;
import edu.asu.ser515.team33.syllabusgenerator.scraper.WebContent;
import edu.asu.ser515.team33.syllabusgenerator.util.ConfigUtil;

import java.util.Set;
import java.util.Timer;

public class MainApplication {
    public static void main(String[] args) {
        ConfigUtil configUtil = ConfigUtil.getInstance();
        Set<WebContent> webContentWatchers = configUtil.getScrapedWebContent();
        for (WebContent webContent : webContentWatchers) {
            new Timer().scheduleAtFixedRate(new BasicWebContentWatcher(webContent), 0, 10000);
        }

        SyllabusGeneratorService service = new SyllabusGeneratorServiceImpl();
        System.out.println(service.generateSyllabus("SER515"));
    }
}
