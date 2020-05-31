package exception;

import java.io.IOException;
import java.text.ParseException;

public class Test {
	public void run() throws IOException, ParseException {

		throw new ParseException("Error in command line.", 2);
	}
	
}
