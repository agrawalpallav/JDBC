package methodRef;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import demo.Person1;

public class Test {
	public static void main(String[] args) {
		ArrayList<Person1> list = new ArrayList<Person1>();
		list.add(new Person1(1,"legain", "lee@gmail"));
		list.add(new Person1(2,"Nirnai", "lee@gmail"));
		list.add(new Person1(3,"Lily", "lee@gmail"));
		list.add(new Person1(4,"Wel", "lee@gmail"));
		list.add(new Person1(5,"Ram", "lee@gmail"));
		list.add(new Person1(6,"Karma", "lee@gmail"));
		list.add(new Person1(7,"Ritik", "lee@gmail"));
		
		List<String> list2 = list.stream().map(MethodRefClass::operation).collect(Collectors.toList());
		list2.forEach(System.out::println);
		
	}

}
