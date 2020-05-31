import java.util.Scanner;

public class User_Input {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Input");

		String name = input.nextLine();
				
		System.out.println("My name is :" + name);

	}
}
