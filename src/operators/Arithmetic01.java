package operators;

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
		
		b=20;
		System.out.println("b : "+ b);
		b--;
		System.out.println("b : "+ b);
		--b;
		System.out.println("b : "+ b);
		
		b=20;
		System.out.println("b : "+ b--);
		System.out.println("b : "+ --b);
		
		a=10;
		b=20;
		
		System.out.println("a / b = "+ (double)a/b);
		System.out.println("a / b = "+ a/(double)b);
		
		System.out.println("a / b = "+ (int)3.99/10);
		
		//int ccc=3.14;
		double ddd=3.14f;
		float eee=(float)3.14;

	}

}
