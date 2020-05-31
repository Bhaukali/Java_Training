
public class Casting {

	public static void main(String[] args) {
		
		byte byteValue = 20;
		short shortValue = 56;
		int intValue = 345;
		long longValue = 2355;
		
		float floatValue = 42423.21f;
		double doubleValue = 32.5;
		
		intValue= (int)doubleValue;
		System.out.println(intValue);
		
		doubleValue = intValue;
		System.out.println(doubleValue);
	}

}
