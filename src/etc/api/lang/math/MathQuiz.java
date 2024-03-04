package etc.api.lang.math;

public class MathQuiz {

	/*
		1 ~ 10이 전달되면 1이 반환되고,
		11 ~ 20이 전달되면 2가 반환되고,
		21 ~ 30이 전달되면 3이 반환되고.......
		이러한 로직을 수행하는 static 메서드 page를 선언해 보세요.
	*/

	public static void main(String[] args) {

		int num = 31;
		int result = page(num);
		System.out.println("result = " + result);
	}

	private static int page(int num) {
		num = (int) Math.ceil((double) num / 10);
		return num;
	}
}
