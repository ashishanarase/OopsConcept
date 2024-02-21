package abstractionEx;

public class Interface02 implements Interface01 {

	@Override
	public void inMethod1() {
		System.out.println("This is inMethod1");
	}

	@Override
	public void inMethod2() {
		System.out.println("This is inMethod2");
		
	}
	
	public static void main(String[] args) {
		Interface02 obj = new Interface02();
		obj.inMethod1();
		obj.inMethod2();
		
	}
	

}
