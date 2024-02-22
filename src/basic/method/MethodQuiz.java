package basic.method;

import java.util.Arrays;

public class MethodQuiz {

	static String[] foods = {"떡볶이", "치킨", "파스타"};

	//1. 배열의 맨 마지막 위치에 데이터를 추가하는 함수 (push -> void)
	//기존 배열보다 크기가 하나 큰 배열을 선언해서 값 고대로 내리기
	//매개값으로 전달된 값을 마지막 위치에 채우기
	static void push(String newFood) {
		String[] tmp = new String[foods.length + 1];
		for (int i = 0; i < foods.length; i++) {
			tmp[i] = foods[i];
		}
		tmp[tmp.length - 1] = newFood;
		foods = tmp;
		tmp = null;
	}

	//2. 배열 내부 데이터 단순 출력 함수
	static void printFood() {
		System.out.println(Arrays.toString(foods));
	}

	//3. 배열 내의 특정 음식의 위치를 찾아주는 함수 (indexOf -> int)
	// 매개값을 전달하면 해당 매개값이 배열 내의 몇 번 인덱스인지를 리턴하는 함수
	// 존재하지 않는 값이라면 -1을 리턴.
	static int indexOf(String targetName) {
		for (int i = 0; i < foods.length; i++) {
			if (targetName.equals(foods[i])) {
				return i;
			}
		}
		return -1;
	}

	//4. 특정 음식의 배열 포함 여부 (include -> boolean)
	//매개값으로 전달된 음식이 배열에 포함되어있는지의 여부를 판단.
	//힌트 -> indexOf 메서드를 활용하면 쉽게 끝남.
	static boolean include(String targetName) {
		if (indexOf(targetName) == -1) return false;
		else return true;
//		return indexOf(targetName) != -1;
	}

	//5. 특정 음식 제거 함수 (remove -> void)
	//전달된 음식을 배열에서 삭제하고 배열의 길이를 줄이면 된다.
	static void remove(String targetName) {
		int index = indexOf(targetName);
		if (index == -1) {
			System.out.println(targetName + "은(는) 존재하지 않는 음식입니다");
			return;
		}

		for (int i = index; i < foods.length - 1; i++) {
			foods[i] = foods[i + 1];
		}
		String[] tmp = new String[foods.length - 1];
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = foods[i];
		}

		foods = tmp;
		tmp = null;
		System.out.println(targetName + "을(를) 삭제했습니다");
	}

	//6. 특정 음식 수정 메서드 (modify -> void)
	//매개값으로 전달한 인덱스의 값을 전달한 값으로 수정해 주는 메서드
	static void modify(int targetIdx, String newFood) {
		foods[targetIdx] = newFood;
	}



	public static void main(String[] args) {

		//배열 내부를 한번 출력 후, '라면', '김치찌개' 추가한 뒤 배열 출력하기
		printFood();
		push("라면");
		push("김치찌개");
		printFood();

		//파스타의 인덱스 알아내기
		int idx1 = indexOf("파스타");
		System.out.println("파스타의 인덱스 : " + idx1);

		//김치찌개의 인덱스 알아내기
		int idx2 = indexOf("김치찌개");
		System.out.println("김치찌개의 인덱스 : " + idx2);

		//짜장면의 인덱스 알아내기(존재하지 않는 값)
		int idx3 = indexOf("짜장면");
		System.out.println("짜장면의 인덱스 : " + idx3);

		//김치찌개, 망고 지우기 (망고는 존재하지 않는 값)
		remove("김치찌개");
		remove("망고");
		printFood();

		//라면의 존재 여부 출력
		if (include("라면")) System.out.println("존재합니다");
		else System.out.println("존재하지 않습니다");

		//양념치킨의 존재 여부 출력
		if (include("양념치킨")) System.out.println("존재합니다");
		else System.out.println("존재하지 않습니다");

		//2번 인덱스 데이터를 닭갈비로 수정
		modify(2, "닭갈비");
		printFood();
	}
}