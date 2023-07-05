package ex04controlstatement;

public class text {

	public static void main(String[] args) {

		
		//구구단 for문으로
		
		for(int dan=2; dan<=9; dan++) {
			for(int su=1; su<=9; su++) {
				System.out.print( dan+"X"+su +"="+ (dan*su)  );
				System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println("===================");
		
		//단위행렬 반대로
		for(int a=1; a<=4; a++) {
			for(int b=1; b<=4; b++) {
				if(a+b==5)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
	}

}
