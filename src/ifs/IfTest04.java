package ifs;

public class IfTest04 {

	public static void main(String[] args) {
		//점수입력(정수)(0~100)
		//90이상이면 A
		//80이상이면 B
		//70이상이면 C
		//60이상이면 D
		//60미만이면 F
		int num=50;
		//판단문 작성
		
		if(num>=90) {
			System.out.println("A");
		}else {
			if(num>=80) {
				System.out.println("B");
			}else {
				if(num>=70) {
					System.out.println("C");
				}else {
					if(num>=60) {
						System.out.println("D");
					}else {
						System.out.println("F");
					}
				}
			}
		}
		
		

	}

}
