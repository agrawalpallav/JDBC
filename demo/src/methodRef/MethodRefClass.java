package methodRef;

import demo.Person1;

public class MethodRefClass {
	public static String operation(Person1 p){
		return p.getName().toUpperCase();
		
	}
	
	public static int operation(int i){
		return i*i;
	}
}
