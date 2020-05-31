class Frg{
	private int id;
	private String name;
		
	public Frg(int id, String name) {
		this.id= id;
		this.name=name;
	}
	
	public String tostring() {
		return String.format("%-4d: %s", id,name);
	}
}
public class Tostring {

	public static void main(String[] args) {
		Frg frg1 = new Frg(7, "Jhoni");
		Frg frg2 = new Frg(5, "Jame");
		
		System.out.println(frg1);
		System.out.println(frg2);

	}

}
