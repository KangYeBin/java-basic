package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModify {

	public static void main(String[] args) {

		String[] foods = {"삼겹살", "족발", "피자", "햄버거"};
		System.out.println(Arrays.toString(foods));

		foods[0] = "치킨";
		foods[2] = "탕수육";

		System.out.println(Arrays.toString(foods));

		System.out.println("=================================");

		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 음식을 입력하세요 : ");
		String name = sc.next();

		for (int idx = 0; idx < foods.length; idx++) {
			if (name.equals(foods[idx])) {
				System.out.println("탐색 완료! 인덱스 : " + idx);
				break;
			} else if (idx == foods.length - 1) {
				System.out.println("존재하지 않는 음식입니다");
			}
		}

	}

}
