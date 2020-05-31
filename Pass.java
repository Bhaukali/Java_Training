
public class Pass {

	public static void main(String[] args) {
		Pass pass = new Pass();
		int value = 6;
		System.out.println("1. value is " + value);
		
		pass.show(value);
		
		System.out.println("4. value is " + value);

	}
	
	public void show(int value) {
		System.out.println("2. value is " + value);
		
		value = 8;
		
		System.out.println("3. value is " + value);
	}

}
