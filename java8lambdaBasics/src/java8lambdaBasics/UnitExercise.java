package java8lambdaBasics;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class UnitExercise {
	public static void main(String[] args) {
		List<Person> people=Arrays.asList(
                          new Person("sai", "Gudi", 2),
                          new Person("sai", "ludi", 2),
                          new Person("sai", "sudi", 2),
                          new Person("sai", "budi", 2),
                          new Person("sai", "kudi", 2));
		Collections.sort(people,(p1,p2)->p1.getLastname().compareTo(p2.getFirstname()));
		/*Collections.sort(people,new Comparator<Person>() {

			@Override
			//sort list by lastname
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getLastname().compareTo(o2.getLastname());
				
			}
			//create a method that prints all element in the list
		
			
			
		});*/
		
		//printAll(people); 
		//printLastname(people);
		System.out.println("printing all numbers");
		printConditionally(people, p ->true);
		printConditionally(people, p->p.getLastname().startsWith("G"));
		
		
	}
	//private static void printLastname(List<Person> people) {
		//for(Person p: people) {
			//if(p.getLastname().startsWith("G")) {
				//System.out.println(p);
				
			//}
			
		//}
	//}
	
		
	
	private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
		for(Person p:people) {
			if(predicate.test(p))
			System.out.println(p);
		}
		

}
	
}