public class Robo{

	private int id;
	
	class Brain{
		public void think() {
			System.out.println("Robot" + id + "is thinking");
		}
	}

	public Robo(int id) {
		this.id = id;
	}
	
	public void start() {
		System.out.println("Starting robot " + id);
		Brain brain = new Brain();
		brain.think();
	}
	

}
