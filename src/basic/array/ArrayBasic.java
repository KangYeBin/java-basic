package basic.array;

import java.util.Arrays;

public class ArrayBasic {

	public static void main(String[] args) {

		// # 배열(array)
		// 같은 데이터 타입의 값을 집합 형태로 나열하기 위한 자료형

		// 1. 배열 변수 선언
		int[] arr;    // 주로 사용하는 선언 방식
		int arr2[];    // C언어 스타일

		// 2. 배열 객체 생성 - 실제 값들이 저장될 공간 형성
		// 생성할 때 배열의 크기를 지정해야한다
		arr = new int[5];

		// 3. 배열 초기화 - 배열 내부에 실제 값 저장
		// 배열 초기화는 index를 이용
		// index : 배열 내부의 위치를 지정할 수 있는 값
		// 0부터 시작해서 1씩 순차적으로 증가

		arr[0] = 65;
		arr[1] = 88;
		arr[2] = arr[0];
		arr[3] = (int) 3.14;
		// arr[4] = "aaa";
		arr[4] = 100;
		// arr[5] = 200;	// (X) 배열의 범위를 벗어남

		// 4. 배열의 총 크기(길이) 확인 -> 배열변수명.length
		System.out.println("arr 배열의 길이 : " + arr.length);

		// 5. 배열에 저장된 값을 참조(사용)하는 법 -> index 활용
		System.out.println("배열의 1번째 데이터 : " + arr[0]);
		System.out.println("배열의 2번째 데이터 : " + arr[1]);
		System.out.println("배열의 3번째 데이터 : " + arr[2]);
		System.out.println("배열의 4번째 데이터 : " + arr[3]);
		System.out.println("배열의 5번째 데이터 : " + arr[4]);

		System.out.println("=====================================");

		// 6. 배열의 반복문 처리
		// 배열은 인덱스를 제어변수로 활용하여 쉽게 반복문 처리 가능
		for (int idx = 0; idx < arr.length; idx++) {
			System.out.printf("배열의 %d번째 데이터 : %d\n", idx + 1, arr[idx]);
		}

		// 7. 배열 내부의 요소값을 문자열 형태로 한눈에 확인하기
		// 배열 변수에는 값이 아닌 배열의 주소가 들어있다.
		System.out.println("arr = " + arr);

		// 8. 배열은 선언과 생성이 동시에 가능
		double[] dArr = new double[3];
		String[] sArr = new String[4];
		byte[] bArr = new byte[10];

		// 배열은 생성됨과 동시에 각 타입의 기본값으로 자동 초기화
		System.out.println(Arrays.toString(bArr));
		System.out.println(Arrays.toString(sArr));
		System.out.println(Arrays.toString(bArr));

		// 9. 배열의 생성과 동시에 초기화도 하는 법
		char[] letters = new char[] {'A','B','C','D'};
		System.out.println(Arrays.toString(letters));

		// 선언과 동시에 초기화를 할 때 딱 한 번만 가능한 문법
		// 배열은 크기가 고정이기 때문에 늘이거나 줄어들 수 없다
		// 만약 배열의 크기를 조정하고싶다면 기존 배열을 조작하는 것이 아니라 새롭게 생성해야
		String[] names = {"홍길동", "김철수" ,"박영희"};
		names = new String[] {"홍길동", "김철수", "박영희", "김뽀삐"};
	}
}
