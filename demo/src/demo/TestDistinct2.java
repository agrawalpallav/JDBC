package demo;

import java.util.ArrayList;

import lambdaImp.Person;

public class TestDistinct2 {
	public static void main(String[] args) {
		ArrayList<Person1> list = new ArrayList<Person1>();
		list.add(new Person1(1,"legain", "lee@gmail"));
		list.add(new Person1(1,"legain", "lee@gmail"));
		list.add(new Person1(1,"legain", "lee@gmail"));
		list.add(new Person1(2,"Nirnai", "lee@gmail"));
		list.add(new Person1(3,"Lily", "lee@gmail"));
		list.add(new Person1(4,"Wel", "lee@gmail"));
		list.add(new Person1(4,"Wel", "lee@gmail"));
		list.add(new Person1(4,"Wel", "lee@gmail"));
		list.add(new Person1(5,"Ram", "lee@gmail"));
		list.add(new Person1(6,"Karma", "lee@gmail"));
		list.add(new Person1(6,"Karma", "lee@gmail"));
		list.add(new Person1(6,"Karma", "lee@gmail"));
		list.add(new Person1(7,"Ritik", "lee@gmail"));
		
		List<Person> list2 = list.stream
		
	}

}
