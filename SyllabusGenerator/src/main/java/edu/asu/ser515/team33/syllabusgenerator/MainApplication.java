package edu.asu.ser515.team33.syllabusgenerator;

import edu.asu.ser515.team33.syllabusgenerator.scraper.BasicWebContentWatcher;
import edu.asu.ser515.team33.syllabusgenerator.scraper.WebContent;
import edu.asu.ser515.team33.syllabusgenerator.util.ConfigUtil;

import java.util.Set;
import java.util.Timer;

public class MainApplication {
    public static void main(String[] args) {
        ConfigUtil configUtil = ConfigUtil.getInstance();

        Set<WebContent> webContentWatchers = configUtil.getScrapedWebContent();
        System.out.println("Scheduling web content watchers to monitor every 30s");
        for (WebContent webContent : webContentWatchers) {
            new Timer().scheduleAtFixedRate(new BasicWebContentWatcher(webContent), 0, 30000);
        }
    }
}
