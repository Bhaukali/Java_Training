class Machine{
	
	private String name;
	private int code;
	
	public Machine() {
		this("Ash",107);
		System.out.println("I am running 1st time");
	}
	
	public Machine(String name) {
		this("Ram",0);
		System.out.println("I am running 2nd time");
		this.name=name;
	}
	
	public Machine(String name, int code) {
		System.out.println("I am running 3rd time");
		this.name= name;
		this.code=code;
	}
}
public class Constructors {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Machine machine2 = new Machine("Jhoni");
		Machine machine3 = new Machine("Sanjay",7);

	}

}
