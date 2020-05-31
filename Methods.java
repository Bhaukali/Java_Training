class People {
	String name;
	int age;
	
	void speak() {
		System.out.println("Hello");
	}
}

public class Methods {

	public static void main(String[] args) {
		People person1 = new People();

		person1.name = "Jhoni Nath";
		person1.age = 27;
		person1.speak();

		System.out.println(person1.name);
		System.out.println(person1.age);

	}

}
