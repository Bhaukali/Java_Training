class Human {
	String name;
	int age;

	int calculateYearsToRetirement() {
		int yearsleft = 65 - age;
		return yearsleft;
	}

	int getAge() {
		return age;
	}
}

public class Getters {

	public static void main(String[] args) {
		Human person1 = new Human();

		person1.name = "Jhoni Nath";
		person1.age = 27;

		int years = person1.calculateYearsToRetirement();

		System.out.println("Years till retirement is " + years);

		int age = person1.getAge();

		System.out.println("My age is " + age);

	}

}
