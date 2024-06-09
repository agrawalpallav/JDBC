package demo;
import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class FirstClass {
	
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("legain", "lee@gmail",97875887));
		list.add(new Person("legain", "lee@gmail",97875887));
		list.add(new Person("legain", "lee@gmail",97875887));
		list.add(new Person("legain", "lee@gmail",97875887));
		list.add(new Person("legain", "lee@gmail",97875887));
		list.add(new Person("legain", "lee@gmail",97875887));
		list.add(new Person("legain", "lee@gmail",97875887));
		
		//List<Person> list2 = list.stream().filter(e-> e.getFirstName().length()>0).collect(Collectors.toList());
		//System.out.println(list2);
			
		List<Person> list2 = list.stream().sorted((e1,e2)->{
			return e1.getFirstName().compareToIgnoreCase(e2.getFirstName());
		}).collect(Collectors.toList());
		list2.forEach(e-> System.out.println(e));
			
			System.out.println(list);
		}
	}


}
