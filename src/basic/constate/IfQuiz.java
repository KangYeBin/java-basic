package basic.constate;

import java.util.Scanner;

public class IfQuiz {

	public static void main(String[] args) {

		/*
			- 정수 3개를 입력 받습니다.
			- 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.

			# max, mid, min이라는 변수를 미리 선언하셔서
			 판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
			 마지막에 한번에 출력하시면 되겠습니다.
		*/

		Scanner sc = new Scanner(System.in);

		System.out.println("정수 3개를 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}

		if (num1 > num3) {
			int temp = num1;
			num1 = num3;
			num3 = temp;
		}

		if (num2 > num3) {
			int temp = num2;
			num2 = num3;
			num3 = temp;
		}

		int min = num1;
		int mid = num2;
		int max = num3;

		System.out.println("max : " + max);
		System.out.println("mid : " + mid);
		System.out.println("min : " + min);

		sc.close();
	}
}
