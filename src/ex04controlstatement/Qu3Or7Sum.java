package ex04controlstatement;

public class Qu3Or7Sum {

	public static void main(String[] args) {

		// 1~100까지중 3또는 7의 배수인거 합구하기 근데 while문으로..
		int i= 1;
		int sum = 0;
		while(i<=100) {
			 
			
			if(i%3==0 || i%7==0) {
				sum += i;
				
				System.out.println(sum);
				
			}
			i++;
		}
		
	}

}
