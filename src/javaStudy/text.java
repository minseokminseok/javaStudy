package javaStudy;

public class text {

	public static void main(String[] args) {
		
		
		int maxNum = 5; //최대별 갯수
		int repeatNum = 2 * maxNum-1 ;
		int desc = -1; // 이거 안중요함 나중에 바꿀거라서
		
		//전체 반복
		for(int i=1; i<=repeatNum; i++) {
			
			//여기가 증가부분
			if(i<=maxNum) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			//감소부분
			else {
				desc = 2*maxNum -i;
				for(int j=1; j<=desc; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}

	}
}
