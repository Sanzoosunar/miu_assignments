package lesson7.labs.prob3;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;


public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");


		//print each element of the list in upper case format
		System.out.println("------using lambda------");
		list.forEach(l-> System.out.println(l.toUpperCase()));

		//implement a Consumer
		System.out.println("------Pre Java 8, using new forEach method------");
		Consumer<String> consumer = new Consumer<String>() {
			@Override
			public void accept(String str) {
				System.out.println(str.toUpperCase());
			}
		};
		list.forEach(consumer);
		
		
	}
	
	
}