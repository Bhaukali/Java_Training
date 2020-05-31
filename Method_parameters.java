class Robot{
	void speak(String text) {
		System.out.println(text);
	}
	
	void jump(int height) {
		System.out.println("Jumping " + height);
	}
}
public class Method_parameters {

	public static void main(String[] args) {
		
		Robot sam = new Robot();
		sam.speak("Hi, I'am Sam");
		
		sam.jump(10);

	}

}
