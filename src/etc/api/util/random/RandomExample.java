package etc.api.util.random;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {

		Random r = new Random();

		// nextDouble() : 실수 난수 0.0 <= ~ < 1.0
		double d = r.nextDouble();
		System.out.println("d = " + d);

		// nextInt() : 정수 난수
		int i = r.nextInt();    // 기본 범위 : int의 전 범위 (약 -21억 ~ 약 21억)
		System.out.println("i = " + i);

		// 0 ~ 5까지의 정수 난수 생성 (끝값이 미만으로 인식)
		int j = r.nextInt(6);
		System.out.println("j = " + j);

		// 10 ~ 100까지의 정수 난수 생성
		int k = r.nextInt(91) + 10;
		System.out.println("k = " + k);

		// nextBoolean() : 논리값 난수
		boolean b = r.nextBoolean();
		System.out.println("b = " + b);
	}
}
