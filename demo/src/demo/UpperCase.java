package demo;
import lambdaImp.Person1;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UpperCase {
	public static void main(String[] args) {
		List<Person1> list = new ArrayList<>();
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
		
		
		Function<Person1,Stream<Person1>> fun = new Function<Person1, Stream<Person1>>(){
			public Stream<Person1> apply(Person1 e){
				Person1 p1 = new Person1
						(e.getId(), e.getName().toUpperCase(), e.getEmail());
				Person1 p2 = new Person1
						(e.getId(), e.getName() ,e.getEmail().toUpperCase());
				p1.setName(p1.getName().toUpperCase());
				p2.setEmail(p2.getEmail().toUpperCase());
				return Stream.of(p1,p2);
				
			}
		};
	
		List<Person1> list2 = list.stream().
				flatMap(fun).collect(Collectors.toList());
		
		
		list2.forEach(e-> System.out.println(e));
	}

}

//we can perform multiple operation in flatMap method