package floats;

public class Test01 {

	public static void main(String[] args) {
		
		//실수 4byte
		float sum=0;
		
		for(int i=0; i<100; i++) {
			sum = sum + 0.1f;
		}
		
		System.out.printf("sum : %.6f\n",sum);
		
		//실수 8byte
		double tot=0;
		
		for(int i=0; i<100; i++) {
			tot = tot + 0.1;
		}
		
		System.out.printf("tot : %.6f\n",tot);

	}

}
