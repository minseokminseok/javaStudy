package ex06array;

import java.util.Scanner;

/*
 문제5-2) 파일명 : QuCircleCalculator.java (난이도:중)
원의 반지름을 인수(파라메타)로 전달하면 원의넓이와 둘레를 계산하여 반환하는 메소드를 각각 정의하자. 이를 호출하는 main 메소드를 정의하라.
 메소드명 : circleArea() > 원의넓이, circleRound() > 원의둘레
-넓이공식 : 3.14 * 반지름 * 반지름
-둘레공식 : 2 * 3.14 * 반지름

 */
public class QuCircleCalculator {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("반지름을 입력하세요");
		double r1 = sca.nextDouble();
		
		circleArea(r1);
		System.out.println("두번째 반지름 입력하세요");
		double r2 = sca.nextDouble();
		circleRound(r2);
	}
	
	
	//반환값이 없는 경우(void로)
	/*
	 static void aFunc(){
	 	//return을 보통 쓰지않는다.
	 	 void 에서 return을 쓰면 종료의 의미로 사용한다.
	 	 값을 반환하는 용도는 아닌다.
	 	 if() return;
	 }
	 static int bFunc() {
	 	return이 반드시 있어야 된다.
	 }
	 반환값이 있는경우에는 반드시 (must) 값을 반환해야한다.
	 return
	 연산에 대한결과로 어떤 값을 반환하기
	 * */
	static void circleArea(double r1) {
		//원의 넓이
		System.out.println("반지름"+r1+ " 원의넓이="+(r1*r1)*3.14  );
	}
	static void circleRound(double r2) {
		//원의 넓이
		System.out.println("반지름"+r2+ " 원의둘레="+r2*2*3.14  );
	}

}
