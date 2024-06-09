package Java8;

import java.util.LinkedHashMap;
import java.util.Map;

public class Javamaptest {
	
	public static void main(String[] args) {
		Map<String,Integer>m=new LinkedHashMap<>();
		m.put("Pallav", 23);
		m.put("Rahul", 24);
		
		
		m.forEach((keys,values)->System.out.println(keys+" ,"+values));
	}

}
