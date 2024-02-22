package basic.array;

import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {

		int[] arr = {1, 3, 5, 7, 9, 11, 13};

		// 삭제되는 값을 기준으로 뒤에 있는 값을 앞으로 한 칸씩
		// 추후에 생성될 새 배열에 값을 그대로 대입하기 편하게 하기 위해

		for (int i = 3; i <= 5; i++) {
			arr[i] = arr[i + 1];
		}

		// [1, 3, 5, 9, 11, 13, 13]
		System.out.println(Arrays.toString(arr));

		// 기존 배열보다 크기가 하나 작은 새 배열 생성
		int[] temp = new int[arr.length - 1];

		// 원본 배열의 값을 새 배열에 그대로 대입
		for (int j = 0; j < temp.length; j++) {
			temp[j] = arr[j];
		}

		// [1, 3, 5, 9, 11, 13]
		System.out.println(Arrays.toString(temp));

		System.out.println(arr);
		System.out.println(temp);
		arr = temp;    // temp 배열의 주소값을 arr에게
		temp = null;    // temp 주소값을 지워서 메모리에서 temp 자동 소멸

		System.out.println(Arrays.toString(arr));
	}
}
