package methodRef;	
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
	public static void main(String[] args) {
		List<Integer> list = List.of(4,5,6,7,8);
		//write an implementation to get the square of each element of list
		
		List<Integer> list2 = list.stream().map(MethodRefClass::operation).collect(Collectors.toList());
		list2.forEach(System.out::println);
	}
}

//UI
//core java
//Gi DSA
//abstraction
//oops concepts
//J8 features
//Lambda EXP
//Stream API
//Method reference

//coding    java8
//lang      java, SQL
//ApI       stream
//framwork  collection


