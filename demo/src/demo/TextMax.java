package demo;

import java.util.List;
import java.util.Optional;

public class TextMax {
	public static void main(String[] args) {
		List<Integer> list = List.of(9,6,9,3,8,25,26,55,55);
		
		Optional<Integer> optional = list.stream().max((e1,e2)->e1-e2);
		Integer max = optional.get();
		System.out.println(max);
		
	}
}

