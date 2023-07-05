package ex04controlstatement;

public class QuPyramid02 {

	public static void main(String[] args) {

		int a = 1;
		
		do {
			int b = 1;
			do {
				 
				System.out.print("*");
				
				if(a+b==6)break;
				b++;
			}while(b<=5);
			System.out.println();
			a++;
		}while(a<=5);
	}

}
