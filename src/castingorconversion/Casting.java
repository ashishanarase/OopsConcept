package castingorconversion;

public class Casting {
	//Implicit casting
	static int a = 150;
	static double b = a;
	
	//Explicit casting
	static double c = 50.25;
	static int d = (int) c;

	
	public static void main(String[] args) {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
}
