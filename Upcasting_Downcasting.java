class Equipment {
	public void start() {
		System.out.println("Machine Started");
	}
}

class Camera extends Equipment {
	public void start() {
		System.out.println("Camera started");
	}

	public void snap() {
		System.out.println("Photo taken");
	}
}

public class Upcasting_Downcasting {

	public static void main(String[] args) {

		Equipment equip1 = new Equipment();
		Camera cam1 = new Camera();

		equip1.start();
		cam1.start();
		cam1.snap();

		Equipment equip2 = cam1;
		equip2.start();

		Equipment equip3 = new Camera();
		Camera cam2 = (Camera) equip3;
		cam2.start();
		cam2.snap();

	}

}
