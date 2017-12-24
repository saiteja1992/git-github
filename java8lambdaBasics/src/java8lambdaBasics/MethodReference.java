package java8lambdaBasics;

public class MethodReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t= new Thread(MethodReference::print);
		//()->print()
		t.start();

	}
	public static void print() {
		System.out.println("saiteja is a good boy");
	}

}
