package etc.api.lang.math;

public class MathExample {

	public static void main(String[] args) {

		// ceil : 올림
		int ceil = (int) Math.ceil(1.1);
		System.out.println("ceil = " + ceil);

		// floor : 내림
		int floor = (int) Math.floor(1.5);
		System.out.println("floor = " + floor);

		// round : 반올림
		double round = Math.round(3.141592 * 100) * 0.01;
		System.out.println("round = " + round);

		// pow : 제곱
		double pow = Math.pow(3.0, 4.0);
		System.out.println("pow = " + pow);

		// max : 최댓값
		int max = Math.max(2, 10);
		System.out.println("max = " + max);

		// min : 최솟값
		int min = Math.min(24, 34);
		System.out.println("min = " + min);

		// abs : 절댓값
		int abs = Math.abs(-77);
		System.out.println("abs = " + abs);
	}
}
