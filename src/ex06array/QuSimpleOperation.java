package ex06array;

import java.util.Scanner;

public class QuSimpleOperation {

	public static void main(String[] args) {
		
		
		Scanner sca = new Scanner(System.in);
		System.out.println("첫번째숫자입력하세요");
		int fNum = sca.nextInt();
		System.out.println("두번째숫자입력하세요");
		int sNum = sca.nextInt();
		arithmetic(fNum, sNum);
	}
	
	static void arithmetic(int first, int second)	{
		
		System.out.println(first+","+second +"덧셈결과:"+ (first+second) );
		System.out.println(first+","+second +"뺄셈결과:"+ (first-second) );
		System.out.println(first+","+second +"곱셈결과:"+ (first*second) );
		System.out.println(first+","+second +"나눗셈결과(몫):"+ (first/second) );
		System.out.println(first+","+second +"나머지:"+ (first%second) );
	}

}
