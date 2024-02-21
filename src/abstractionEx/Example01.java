package abstractionEx;

public abstract class Example01 {

	abstract void method01();
	
	abstract void method02();
	
	static int abc = 15;
	
	public static void method03() {
		System.out.println("This is Method03");
	} 
		
	Example01() {	
		System.out.println("This is Constructor");
	}

}

