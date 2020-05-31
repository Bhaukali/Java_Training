import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writing_Files {

	public static void main(String[] args) {
		File file = new File("Test.txt");
		
		try (BufferedWriter br = new BufferedWriter(new FileWriter(file))){
			br.write("My name is Jhoni");
			br.newLine();
			br.write("I am an Engineer");
		} catch (IOException e) {
			System.out.println("Unable to read file:" + file.toString());
		}

	}

}	
