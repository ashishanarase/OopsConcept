package castingorconversion;

public class UpCasting_Child extends UpCasting_Parent{
	
	public void casting1() {

		System.out.println("This is a Child class's method for Upcasting");
	}

	public static void main(String[] args) {
		
		UpCasting_Parent obj = new UpCasting_Child();
		obj.casting1();

	}
}
