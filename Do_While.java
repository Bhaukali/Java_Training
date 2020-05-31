import java.util.Scanner;

public class Do_While {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int value = 0;

		do {
			System.out.println("Enter the numnber");

			value = input.nextInt();

		} while (value != 5);

		System.out.println("Got the number" + " " + value);

	}

}
