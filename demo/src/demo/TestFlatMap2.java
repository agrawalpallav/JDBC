package demo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFlatMap2 {
	public static void main(String[] args) {
		List<Integer> a1 = List.of(1,2,3,4);
		List<Integer> a2 = List.of(5,6,7,8);
		List<Integer> a3 = List.of(9,10,11,12);
		//this list here is immutable list
		//a1.add(25);//it gives an error of immutable string
		List<List<Integer>> list  = List.of(a1,a2,a3);
		
		System.out.println(list);
		//Stream<List<Integer>> stream = list.stream();
		List<Integer> list2 =list.stream().flatMap(e-> e.stream()).collect(Collectors.toList());
		System.out.println(list2);
	}

}
//create a list of person and convert the person name to the upper case then convert email to the upper case 