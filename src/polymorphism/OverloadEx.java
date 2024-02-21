package polymorphism;

public class OverloadEx {

	public static void myMethod1(String a) {

		System.out.println("This is 1st class Static Method");
	}
	public static void myMethod1(int b) {

		System.out.println("This is overloaded Static Method");

	}
	public void myMethod2(double c) {

		System.out.println("This is 1st class Non-Static Method");
	}
	public void myMethod2(char d) {

		System.out.println("This is overloaded Non-Static Method");
	}
	
}
