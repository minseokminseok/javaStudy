package e05method;

import java.util.Scanner;

public class E03MethodType02_2 {

	
	//반환타입이 String 이므로 문자열의 결과를 반환한다.
	static String getHakjum() {
		//사용점수로 점수입력받음
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어점수");
		int kor = scanner.nextInt();
		System.out.println("영어점수");
		int eng = scanner.nextInt();
		System.out.println("수학점수");
		int math = scanner.nextInt();
		//평균값을 게산한다. 실수형의 결과를 얻기위해 3.0으로 나눈다.
		double avg =(kor + eng + math) /3.0;
		String hakjum = "";
		int result =(int) avg / 10;
		
		switch(result) {
		case 10: case 9:
			hakjum ="A학점";break;
		case 8: 
			hakjum ="B학점";break;
		case 7: 
			hakjum ="C학점";break;
		case 6: 
			hakjum ="D학점";break;
		default: 
			hakjum ="F학점";break;
		}
		/*결과값을 return하면 해당 메서드는 메모리에서 소멸되고 
		  호출한 지점으로 값을 반환하게 된다.*/
		return hakjum;
		
	}
	public static void main(String[] args) {

		/*시나리오
		 국영수 점수 반환받아 평균 구한후 학점 반환매서드정의*/
		
		//호출 1 : print()문의 일부로 메서드를 호출한다.
		System.out.println("너의학점은"+getHakjum()+"이야");
		
		//호출2 : 단독으로 호출한 후 반환값을 변수에 저장한다.
		String h = getHakjum();
		System.out.printf("당신의 학점은 %s입니다.", h);
	}

}
