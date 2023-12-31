package ex07string;
/*
시나리오] 주민등록번호를 이용하여 성별을 판단하는
프로그램을 charAt()을 이용해서 작성하시오.
190419-3000000 => 남자
190419-4000000 => 여자
*/
/*
시나리오] 해당 문자열이 이메일 형식인지 검사하는
프로그램을 contains()를 이용해서 작성하시오.
hong@daum.net => 이메일형식임
not@naver => 이메일형식이아님
*/
/*
시나리오]주민등록번호로 성별을 구분하는 프로그램을 indexOf()를
이용해서 작성하시오.
*/	
/*
시나리오] 다음 파일명에서 확장자를 잘라내는 프로그램을
작성하시오. 
파일명 : my.file.images.jpg
*/

public class E02StringMethod4 {

	public static void main(String[] args) {

		/*
		시나리오] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/
		String str1  = "190419-3000000";
		String str2  = "190419-4000000";
		System.out.println(str1.charAt(7));
		if(str1.charAt(7)=='3') {
			System.out.println("남자입니다.");
		}
		else {
			System.out.println("여자입니다.");
		}
		
		/*
		시나리오] 해당 문자열이 이메일 형식인지 검사하는
		프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일형식임
		not@naver => 이메일형식이아님
		  */
		
		String email1 = "hong@daum.net";
		String email2 = "not@naver";
		
		//System.out.println(email1.contains("@"));
		//System.out.println(email1.contains("."));
		if(email1.contains("@") && email1.contains(".")) {
			System.out.println("email형식입니다.");
		}
		if(email2.contains("@") && email2.contains(".")) {
			System.out.println("email형식입니다.");
		}
		else {
			System.out.println("이메일 형식 아닙니다.");
		}
		
		
		
		/*
		시나리오]주민등록번호로 성별을 구분하는 프로그램을 indexOf()를
		이용해서 작성하시오.
		*/

		System.out.println(str1.indexOf('3'));
		if(str1.indexOf('3')==7) {
			System.out.println("남자입니다.");
		}
		
		/*
		시나리오] 다음 파일명에서 확장자를 잘라내는 프로그램을
		작성하시오. 
		파일명 : my.file.images.jpg
		*/
		String fileName = "my.file.images.jpg";
		System.out.println(fileName.lastIndexOf("."));
		System.out.println(fileName.substring(15));
		
	}

}
