import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {

	public static void main(String[] args) {
		File file = new File("num.txt");
		
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println("File not Found :" + file.toString());
		}
		

	}

}
