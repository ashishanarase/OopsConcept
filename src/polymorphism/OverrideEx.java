package polymorphism;

public class OverrideEx extends OverloadEx {

	public static void myMethod1(String a) {

		System.out.println("This is 2nd class Static Method");
	}
	public static void myMethod1(int b) {

		System.out.println("This is 2nd overloaded Static Method");

	}
	public void myMethod2(double c) {

		System.out.println("This is 2nd Non-Static Method");
	}
	public void myMethod2(char d) {

		System.out.println("This is 2nd overloaded Non-Static Method");
	}

	public static void main(String[] args) {

		//OverloadEx obj = new OverloadEx();
		//obj.myMethod1("Enjoy");
		//obj.myMethod1(20);
		//obj.myMethod2(52.25);
		//obj.myMethod2('@');

		OverrideEx obj1 = new OverrideEx();
		obj1.myMethod1("Enjoy");
		obj1.myMethod1(20);
		obj1.myMethod2(52.25);
		obj1.myMethod2('@');

	}
}

