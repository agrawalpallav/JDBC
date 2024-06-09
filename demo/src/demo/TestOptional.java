package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
// findFirst and findAny method used to collect first data from the stream object
public class TestOptional {
	public static Person1 getDataByid(List<Person1> persons, int id) {
		return persons.stream().filter(e->e.getId()==id).findFirst().orElse(new Person1(id, null, null));
		
	}
		
		public static void main(String[] args) {
			ArrayList<Person1> list = new ArrayList<Person1>();
			list.add(new Person1(1,"legain", "lee@gmail"));
			list.add(new Person1(2,"Nirnai", "lee@gmail"));
			list.add(new Person1(3,"Lily", "lee@gmail"));
			list.add(new Person1(4,"Wel", "lee@gmail"));
			list.add(new Person1(5,"Ram", "lee@gmail"));
			list.add(new Person1(6,"Karma", "lee@gmail"));
			list.add(new Person1(7,"Ritik", "lee@gmail"));
			
			// Filter the list of person whose name has more than 5 alphabets.
			List<Person1> list2 = list.stream().filter(e->e.getName().length()>5).collect(Collectors.toList());
			Consumer<Person1> con = System.out::println;
			
			//list2.forEach(e->System.out.println(e));
			list2.forEach(con);
			//System.out.println(getDataByid(list,20));
		}
	

}
