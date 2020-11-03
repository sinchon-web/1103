package ifs;

public class Etc {

	public static void main(String[] args) {
		
		
		int num=9;
		if(num%2==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		//(조건문)?조건이 참일때:조건이 거짓일때;
		int a=-100;
		int n=(a>0)? a : -a ;
		
		System.out.println(n);
		
		
		String str = (num%2==0)?	"짝수":"홀수";
		
		System.out.println( str );
		
		

	}

}
