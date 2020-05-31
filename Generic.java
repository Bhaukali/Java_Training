import java.util.ArrayList;

public class Generic {

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("cat");
		strings.add("dog");
		strings.add("monkey");
		
		String animal = strings.get(0);
		System.out.println(animal);

	}

}
