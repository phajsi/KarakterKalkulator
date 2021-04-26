package calculator.fxui;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.net.URL;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;

public class TextFileSupportTest {
	
	private static TextFileSupport file;
	
	@BeforeAll
	public static void setUp() {
		file = new TextFileSupport();
    }
	
	@Test
	@DisplayName("Function writes to file")
	public void testWriteToFile() {
		file.clear(false);
        file.write("name", "average");
        assertEquals("name: average\n", file.read(), "file should contain 'name: average'");
    }

	@Test
	@DisplayName("File should be cleared")
	public void testClearFile() {
        file.write("name", "average \n");
        assertNotNull("the file has content, file1");
        file.clear(false);
        assertEquals("", file.read(), "file should be empty");
    }
	
	@Test
	@DisplayName("Function reads from file")
	public void testReadFromFile() {
		file.clear(false);
        file.write("someone", "average");
        assertEquals("someone: average\n", file.read(), "file1 should be ''");
    }

}
