package johnabbott.exercises.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ExceptionThrow {
	
	public void testFile() throws IOException {
		File f = new File("d:\\test");

		InputStream stream;
		try {
			stream = new FileInputStream(f);
			stream.read();
		} catch (FileNotFoundException e) {

			e.getStackTrace();
		}
		
	}
	
}
