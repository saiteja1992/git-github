package java8lambdaBasics;

public class RunnableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//using annonymous inner class implementing run()
		Thread t=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
			System.out.println("runnable");
				
			}
		}) ;
		t.run();
		//or use lambda
		Thread mylambda=new Thread(()-> System.out.println("sai"));
		mylambda.run();

	}

}
