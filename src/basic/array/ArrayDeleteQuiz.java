package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] kakao = {"무지", "네오", "어피치", "라이언", "춘식이"};
		System.out.println("현재 저장된 친구들 : " + Arrays.toString(kakao));

		/*
		1. 삭제할 친구를 입력받아서 삭제를 진행해 주세요.
		2. 입력받은 이름이 없다면 없다고 얘기해 주세요.

		- 추가
		배열의 길이가 0이 될 때까지 삭제를 반복해 보세요.
		더 이상 지울 친구가 없다면 프로그램 종료.
		*/

		while (kakao.length > 0) {
			System.out.print("삭제할 이름을 입력해주세요 : ");
			String targetName = sc.next();

			int modIdx = -1;

			for (int i = 0; i < kakao.length; i++) {
				if (targetName.equals(kakao[i])) {
					modIdx = i;
					break;
				}
			}

			if (modIdx != -1) {
				for (int i = modIdx; i < kakao.length - 1; i++) {
					kakao[i] = kakao[i + 1];
				}
				String[] temp = new String[kakao.length - 1];

				for (int j = 0; j < temp.length; j++) {
					temp[j] = kakao[j];
				}
				kakao = temp;
				temp = null;
				System.out.println("현재 저장된 친구들 : " + Arrays.toString(kakao));
			} else {
				System.out.println("없는 이름입니다. 다시 입력해주세요");
			}
		}

		System.out.println("모두 삭제 완료");
		sc.close();
	}
}
