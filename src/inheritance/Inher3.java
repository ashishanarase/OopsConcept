package inheritance;

public class Inher3 extends Inher2 {
	
	public void methodns2 () {
		System.out.println("THIS IS MY SON CLASS 2 OF INHERITENCE");
	}

	public static void main(String[] args) {
		Inher3 obj1 = new Inher3();
		obj1.methodns();
		obj1.methodns1();
		obj1.methodns2();
	}
}
