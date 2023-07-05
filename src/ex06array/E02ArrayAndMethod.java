package ex06array;

public class E02ArrayAndMethod {

	public static void main(String[] args) {
		/* 배열을 선언과 동시에 초기화 한다. 초기값의 갯수를
		 통해 크기가 결정된다. 생성된 배열 객체의 주소값을 
		 int형 배열변수인 arr에 할당하게 된다.
		 할당하게 된다.*/
		int[] arr = {1,2,3,4,5};
		//배열변수를 선언하였지만 아직은 참조할 배열 인스턴스가 없는상태이다.
		int[] ref;
		
		System.out.println("초기화 직후 출력");
		//초기값 그대로인 1~5까지 출력된다.
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" "); //1,2,3,4,5 출력
		}
		System.out.println();
		/*배열명을 인수로 전달하는것은 배열의 참조값(주소값)을 
		 전달하는 것으로 배열 자체가 전달되지 않는다. 아래
		 출력문에서는 배열 인스턴스의 참조값(주소값)이 출력된다.*/
		System.out.println("arr변수:" +arr);
		
		/*arr은 참조값이지만, 7은 기본자료형인 int이므로 
		 값 자체가 전달된다. 즉 복사가 일어난다.*/
		ref = addAllArray(arr, 7);
		
		/*main에서 생성했던 배열객체의 참조값을 매개변수로 넘기고,
		 다시 반환받았으므로 결국 동일한 배열을 참조하게 되어 
		 아래 출력문에서는 동일한 결과가 2번 출력된다.*/
		
		System.out.println("메소드 호출후 출력");
		for(int i=0; i<ref.length;i++) {
			System.out.print(ref[i]+" "); //8,9,10,11,12 출력됨;
		}
		System.out.println();
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	/*매개변수로 전달된 배열의 참조값을 ar로 받게 되므로 해당
	 메서드에서도 동일한 배열을 참조할 수 있게된다. 즉 main메서드에서
	 생성한 배열과 동일한 배열을 참조하게 된다.*/
	static int[] addAllArray(int[] ar, int addVal) {
		/*배열의 각 인덱스에 매개변수로 전달된 7을 더해준다.
		 즉 각 원소를 7씩 증가시킨다. */
		for(int i=0; i<ar.length; i++) {
			ar[i] += addVal;
		}
		//배열변수의 참조값을 그대로 반환
		return ar;
	}

}
