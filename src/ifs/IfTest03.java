package ifs;

public class IfTest03 {

	public static void main(String[] args) {
		
		
		int num=-10;
		
		if(num==0) {
			System.out.println("0입니다.");
		}else {//0보다 큰경우, 0보다 작은경우
			if(num>0) {
				System.out.println("양수입니다.");
			}else {
				System.out.println("음수입니다.");
			}
		}

	}

}
