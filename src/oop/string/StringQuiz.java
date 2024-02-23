package oop.string;

import java.util.Scanner;

public class StringQuiz {

	public static void main(String[] args) {
		/*
		1. 주민등록번호 13자리를 입력받습니다.
		2. 주민등록번호는 -을 포함해서 받을 예정입니다.
		3. 13자리가 아니라면 다시 입력받습니다.
		4. ex)
		921013-1234567 -> 1992년 10월 13일 32세 남자
		031125-3456789 -> 2003년 11월 25일 21세 남자
		제대로 출력이 될 때까지 다시 입력
		*/

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("주민들록번호 13자리를 입력하세요 (- 포함)");
			System.out.print(">> ");
			String idNumber = sc.next();
			if (idNumber.length() == 14 && idNumber.charAt(6) == '-') {
				int year = Integer.parseInt(idNumber.substring(0, 2));
				int month = Integer.parseInt(idNumber.substring(2, 4));
				int day = Integer.parseInt(idNumber.substring(4, 6));
				int age = year > 24 ? 124 - year : 24 - year;

				int idGender = Integer.parseInt(idNumber.substring(7, 8));

				if (idGender == 1 || idGender == 2) {
					year += 1900;
				} else {
					year += 2000;
				}

				String gender;
				if (idGender == 1 || idGender == 3) gender = "남자";
				else gender = "여자";

				System.out.printf("%d년 %d월 %d일 %d세 %s",
						year, month, day, age, gender);


				break;
			}
		}
	}
}
