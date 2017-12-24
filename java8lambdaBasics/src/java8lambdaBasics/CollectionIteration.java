package java8lambdaBasics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people=Arrays.asList(
                new Person("sai", "Gudi", 2),
                new Person("sai", "ludi", 2),
                new Person("sai", "sudi", 2),
                new Person("sai", "budi", 2),
                new Person("sai", "kudi", 2));
		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
			
		}
		for (Person p : people) {
			System.out.println(p);
			
		}
		people.forEach(p -> System.out.println(p));
		//or
		people.forEach(System.out::println);//method reference
		

	}

}
