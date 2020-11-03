package arithmetic;

public class Arithmetic01 {

	public static void main(String[] args) {
		
		int a=10, b=20;
		
		System.out.println("a + b = "+(a+b));
		System.out.println("a - b = "+(a-b));
		System.out.println("a * b = "+(a*b));
		
		//정수/정수 == 몫
		System.out.println("a / b = "+(a/b));
		System.out.println("a % b = "+(a%b));
		
		System.out.println("10 / 20.0 = "+(10/20.0));
		
		
		
		a=10;
		System.out.println("a : "+ a);
		a++;
		System.out.println("a : "+ a);
		++a;
		System.out.println("a : "+ a);
		
		System.out.println("------------");
		a=10;
		System.out.println("a : "+ a);
		System.out.println("a : "+ (a++));
		
		System.out.println("a : "+ a);//11
		
		System.out.println("a : "+ (++a));
		
		System.out.println("a : "+ a);

	}

}
