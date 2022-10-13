import java.io.InputStream;
package edu.asu.ser515.team33.syllabusgenerator.importer;
import edu.asu.ser515.team33.syllabusgenerator.syllabus;
import edu.asu.ser515.team33.syllabusgenerator.controller;

public class Controller  {
    public static void main (String[] args)
    {
        InputStream file = null;

        Importer import = new Importer();
        Syllabus syllabus = new Syllabus();

        syllabus = import.parseFile(file);  // Importing syllabus
        import.printFunction();

        Section section = new Section();
        SyllabusGenerator sg = new SyllabusGenerator();

        section = sg.populateSection();  // Generating Syllabus
        sg.printFunction();

        Exporter export = new Exporter();
        
        syllabus = export.exportSyllabus();  // Exporting Syllabus
        export.printFunction();
        
    }

};
