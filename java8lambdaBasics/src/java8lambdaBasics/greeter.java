package java8lambdaBasics;

public class greeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		mylambda lambda=()->System.out.println("Hello World");
        myadd add=(int a,int b)->a+b;
        mylambda inner=new mylambda() {
			
			@Override
			public void foo() {
				// TODO Auto-generated method stub
				System.out.println("sai");
				
			}
		};
		inner.foo();
		lambda.foo();//create lamdacompared to innerclass
	}

}
interface mylambda{
	void foo();// tells compler,we are implmntng foo
}
interface myadd{
	int foo(int a, int b);// tells compler,we are implmntng foo
}

