package johnabbott.exercises.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestExceptions {
	
	
	
	public static void main(String...args) throws IOException {
		ExceptionThrow t = new ExceptionThrow();
		t.testFile();
	}
}
