package access_modifier2;

import access_modifiers.*; // use * for importing whole packages

public class ForCalling extends PublicEx {
	
	public static void main(String[] args) {
		//PublicEx obj = new ForCalling();
		
		//PublicEx obj = new PublicEx();
		
		PublicEx obj = new PublicEx();
		obj.m1();
		
		ForCalling obj1 =  new ForCalling();
		obj1.m4();	
		
		Extra obj2 = new Extra();
		obj2.mainS();
		
	}
	
}
