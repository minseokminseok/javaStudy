package ex06array;

import java.util.Scanner;

/*
 문제5-3) 파일명 : QuTemperature.java  (난이도:중)
섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 
리턴하는 함수와 화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라.
공식]
화씨 = 1.8 * 섭씨 + 32
섭씨 = (화씨 - 32) / 1.8

 * */
public class QuTemperature {

	public static void main(String[] args) {

		Scanner sca = new Scanner(System.in);
		System.out.println("화씨 입력하세요");
		double num1 = sca.nextDouble();
		
		Temperature(num1);
	}

		static void Temperature(double num1) {
			System.out.println("화씨:"+num1 +"섭씨="+(num1 - 32) / 1.8);
		}
}
