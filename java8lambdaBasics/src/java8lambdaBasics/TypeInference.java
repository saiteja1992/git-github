package java8lambdaBasics;

public class TypeInference {
	public static void print(Stringlength l)
	{
		System.out.println(l.getLength("sai"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringlength mylambda=s->s.length();
		mylambda.getLength("hello");
		print(s->s.length());

	}

}
interface Stringlength{
	int getLength(String s);
}
