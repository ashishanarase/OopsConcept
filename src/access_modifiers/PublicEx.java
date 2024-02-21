package access_modifiers;

public class PublicEx {	

	public void m1() {
		System.out.println("This is Public-Euuuu");
	}	

	private void m2() {
		System.out.println("This is private");
	}

	void m3() {
		System.out.println("This is default");
	}

	protected void m4() {
		System.out.println("This is protected");
	}
	
	public PublicEx(){
		System.out.println("This is my public constructor");
	}


	public static void main(String[] args) {
		PublicEx obj1 = new PublicEx();
		obj1.m2();		

	}
}
