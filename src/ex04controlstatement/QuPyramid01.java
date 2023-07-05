package ex04controlstatement;

public class QuPyramid01 {

	public static void main(String[] args) {

		int i = 1;
		while(i<=5) {
			int j=1;
			while(j<=5) {
				
				System.out.print("*");
				j++;
				if(i<j) break;
			}
			i++;
			System.out.println();
			
		}
	}

}
