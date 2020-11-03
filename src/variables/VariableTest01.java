package variables;

public class VariableTest01 {
	static int aaa;//전역변수, 클래스멤버변수
	//main 메서드
	public static void main(String[] args) {
		
		//정수
		byte a;//지역변수
		short b;
		int c=100;//선언과 동시 초기화
		long d;
		
		int c1, c2, c3;
		
		float f;
		double df;
		a = 10;
		// 왼쪽  =   : 메모리공간
		// = 오른쪽  : value
		
		//a = a + 10;
		
		System.out.println(a);
		
		boolean bool=false;
		System.out.println(bool);
		
		System.out.println(aaa);
		
		int num=10;
		
		num = num + 10;
		
		System.out.println("num : "+num);
		
	}
	
	public void disp(){
		int a;
	}

}
