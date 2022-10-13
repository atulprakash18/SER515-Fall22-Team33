import java.io.InputStream;
package edu.asu.ser515.team33.syllabusgenerator.importer;
import edu.asu.ser515.team33.syllabusgenerator.syllabus;
import edu.asu.ser515.team33.syllabusgenerator.controller;

public class Importer {

	private Controller controller;

	public syllabus parseFile(InputStream file) {
		return new syllabus();
	}

	public void printFunction() {

		System.out.println("Syllabus Imported Successfully. . .");


	}

}
