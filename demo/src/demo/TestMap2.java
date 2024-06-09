package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//import lambdaImp.Person;

public class TestMap2 {
	public static void main(String[] args) {
		ArrayList<Person2> list = new ArrayList<Person2>();
		list.add(new Person2("lee@gmail","legain", 1));
		list.add(new Person2("lee@gmail","Nirnai", 2));
		list.add(new Person2("lee@gmail","Lily", 3));
		list.add(new Person2("lee@gmail","Wel", 4));
		list.add(new Person2("lee@gmail","Ram", 5));
		list.add(new Person2("lee@gmail","Karma", 6));
		list.add(new Person2("lee@gmail","Ritik", 7));
		
		
		//List<Person> list2 = list.stream().filter(e-> e.getFirstName().length()>0).collect(Collectors.toList());
//		List<Person> list2 = list.stream().map(e->
//		{e.setFirstName(e.getFirstName().toUpperCase());
//		return e;
//		}).collect(Collectors.toList());
//		}
		
		
	List<Person2> list2 = list.stream().sorted((e1,e2)->{
		return e1.getFirstName().compareToIgnoreCase(e2.getFirstName());
	}).collect(Collectors.toList());
	list2.forEach(e-> System.out.println(e));
		
		System.out.println(list);
	}
	
	
}
