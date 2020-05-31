class Toy {
	public void start() {
		System.out.println("Strting Toy...");
	}
}

interface Plant {
	public void grow();
}

public class Anonymous_Class {

	public static void main(String[] args) {
		Toy toy = new Toy() {
			@Override
			public void start() {
				System.out.println("Camera Staring....");
			}
		};
		toy.start();

		Plant plant = new Plant() {
			public void grow() {
				System.out.println("Plant growing...");
			}
		};
		plant.grow();
	}
}
