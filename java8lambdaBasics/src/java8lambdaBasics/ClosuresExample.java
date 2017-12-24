package java8lambdaBasics;

public class ClosuresExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=30;//effectively final or closure of the value, don't have to put final
		/*doProcess(a,new Process(){

			@Override
			public void process(int i) {
				// TODO Auto-generated method stub
		
				System.out.println(i+b);
				
			}
			
			
		});*/
		doProcess(a,i->System.out.println(i+b));
		

	}
	public static void doProcess(int i, Process p) {
		p.process(i);
	}

}
interface Process{
	void process(int i);
	
}
