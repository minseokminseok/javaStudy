package ex06array;

import java.util.Scanner;

/*
 문제5-4) 파일명 : QuFindPrimeNumber.java  (난이도:상)
전달된 값이 소수인지 아닌지를 판단하여 소수인 경우 true를 아니면
 false를 반환하는 메소드를 정의하고, 이를 이용해서 1부터 100사이의
 소수를 전부 출력하는 main메소드를 정의하자.
메소드명 : isPrimeNumber()
소수란 : 특정 정수를 나눌수 있는것이 1과 자기자신밖에 없는 수.
 **/
public class QuFindPrimeNumber {

	public static void main(String[] args) {

		System.out.println("소수를 입력하세요");
		Scanner sca = new Scanner(System.in);
		
		int num1 = sca.nextInt();
		
		isPrimeNumber(num1);
		
		System.out.println("1~100까지의 소수");
		isPrimeNumber100();
	}

	static void isPrimeNumber(int num1) {
		int count = 0;
		for(int i=1; i<=num1; i++) {
			if(num1%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("소수입니다.");
		}
		else {
			System.out.println("소수가 아닙니다.");
		}
		
	}
	
	static void isPrimeNumber100() {
		for(int i = 1; i <= 100; i++) {
            int count = 0;
            
            for(int j = 1; j <= i; j++) {
                if(i%j == 0) {
                    count++;
                }
            }
            
            if(count == 2) {
                System.out.println(i);
            }
		
			}
	}
	
}
