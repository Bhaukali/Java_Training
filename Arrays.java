
public class Arrays {

	public static void main(String[] args) {
		int [] value;
		value = new int[3];
		
		System.out.println(value[0]);
		
		value[0]= 10;
		value[1]= 20;
		value[2]= 30;
		
		System.out.println(value[0]);
		System.out.println(value[1]);
		System.out.println(value[2]);
		
		for(int i=0;i<value.length;i++)
		{
			System.out.println(value[i]);
		}
		
		int [] digit = {1,2,3};
		
		for(int j=0;j<digit.length;j++)
		{
			System.out.println(value[j]);
		}
	}

}
