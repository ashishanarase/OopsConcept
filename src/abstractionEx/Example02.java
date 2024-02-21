package abstractionEx;

public class Example02 extends Example01 { //Concrete class = Example02

	@Override
	void method01() {
		System.out.println("This is Method01");
		
	}

	@Override
	void method02() {
		System.out.println("This is Method02");
		
	}
	
	public static void main(String[] args) {
		Example02 obj = new Example02();
		obj.method01();
		obj.method02();
		Example02.method03();
	}
}
//euuuuuuuuuuu
	
