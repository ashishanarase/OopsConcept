package castingorconversion;

public class DownCasting_Child extends DownCasting_Parent {
	
	public void casting3 () {
		System.out.println("This is Child class's method for Down casting");
	}
	
	public static void main(String[] args) {
		DownCasting_Child object = (DownCasting_Child) new DownCasting_Parent();
		object.casting2();
		object.casting3();
	}
}