class Factory {
	public static final int ID = 7;
	private String name;

	public String getData() {
		String data = "some stuff" + calculateGrowthForecast();
		return data;
	}
	private int calculateGrowthForecast() {
		return 10;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
