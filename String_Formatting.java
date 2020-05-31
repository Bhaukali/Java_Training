
public class String_Formatting {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("");
		sb.append("My name is Jhoni.")
		.append(" ")
		.append("I am an Engineer.");

		System.out.println(sb.toString());

		System.out.printf("Total cost is %d; quantity is %d\n", 5, 130);
		
		for(int i=1;i<15;i++) {
			System.out.printf("%-2d: some text here\n",i);
		}
		
		System.out.printf("total value: %.3f\n", 5.62474);
	}

}
