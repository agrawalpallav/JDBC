package demo;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;
import java.util.stream.Collectors;

public class TestMap {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(25);
		list.add(12);
		list.add(5);
		list.add(50);
		list.add(20);
		list.add(3);
		list.add(4);
		
		List<Integer> list2= list.stream().sorted().collect(Collectors.toList());
		System.out.println(list2);
		
		//List<Integer> list2 = list.stream().map(e->e*e).collect(Collectors.toList());
}	
}
