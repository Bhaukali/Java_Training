
public class Enum {

	public static void main(String[] args) {
		Animal animal = Animal.DOG;

		switch (animal) {
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MONKEY:
			break;
		default:
			break;

		}

	}

}
