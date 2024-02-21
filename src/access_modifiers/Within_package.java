package access_modifiers;

public class Within_package extends PublicEx {


	public static void main(String[] args) {
		PublicEx obj = new Within_package();
		obj.m1(); //public
		obj.m3(); //default
		obj.m4();  //protected
		

	}

} 