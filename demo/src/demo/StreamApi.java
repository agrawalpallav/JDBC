package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(25);
		list.add(12);
		list.add(5);
		list.add(50);
		list.add(20);
		list.add(3);
		list.add(4);
		
		Function<Integer, String> fun = new Function<Integer, String>(){
	
			public String apply<Integer t>{
				return t*t+"";
			}
		}
		
		//List<Integer> list2 = list.stream().filter(e-> e%2==0).collect(Collectors.toList());
		//List<String> list2 = list.stream().map(e->e*e+"").collect(Collectors.toList());
		List<Stream<Integer>> list2 = list.stream().map(fun).collect(Collectors.toList());
		//List<Integer> list2= list.stream().filter(e-> e%2==0).collect(Collectors.toList());
		System.out.println(list2);
	}
	
}
