package inheritance;

public class Inher2 extends Inher {

	public void methodns1 () {
		System.out.println("THIS IS MY SON CLASS OF INHERITENCE");
	}
	
	//USE NON STATIC METHOD FOR INHERITENCE
	
	public static void main(String[] args) {
		
		Inher2 obj = new Inher2();
		obj.methodns();
		obj.methodns1();
		//SON CLASS
		

		

	}

}
