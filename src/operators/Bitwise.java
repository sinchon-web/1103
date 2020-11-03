package operators;

public class Bitwise {

	public static void main(String[] args) {
		
		byte a=60;// 0011 1100
		byte b=13;// 0000 1101
		
		System.out.println( a&b );
		System.out.println( a|b );
		
		//비트단위로 비교시
		//서로 다르면(1,0)(0,1) true, 같으면(0,0)(1,1) false
		System.out.println( a^b );
		
		
		//0->1, 1->0바꾼다...//1의보수를 구한다.
		System.out.println( ~a );
		
		//우쉬프트시 빈칸은 부호비트로 채운다.
		System.out.println( a>>2 );
		System.out.println( (byte)(a<<2) );
		
		System.out.println( a>>>2 );
		
		//우쉬프트시 빈칸은 부호비트로 채운다.
		a=-60;
		//System.out.println( a>>2 );
		//System.out.println( a>>>2 );//1073741809

	}

}
