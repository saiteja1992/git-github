package java8lambdaBasics;

import java.util.function.BiConsumer;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] somenumbers= {1,2,3,4};
		int key=0;
		process(somenumbers, key, (v,k)->{
			try {
			System.out.println(v/k);
			}
			catch(ArithmeticException e) {
				System.out.println("dsddfdg");
			}
			
		});
	}
	private static void process(int[] somenumbers, int key, BiConsumer<Integer,Integer> consumer) {
		for(int i:somenumbers) {
			consumer.accept(i, key);
		}
	}

}
