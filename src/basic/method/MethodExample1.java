package basic.method;

public class MethodExample1 {

	/*
		# 메서드 (method)

		- 메서드는 반복되는 코드 블록에 이름을 붙여놓은 것
		- 메서드는 반복되는 코드를 줄여주고 구조화 시켜서 우리가 코드를 알아보기 쉽게 한다. (코드의 모듈화)
		- 메서드는 선언하는 과정과 호출하는 과정으로 나뉘어지는데
		- 메서드의 선언은 메서드 내부에서는 불가능하고
		새로운 메서드의 선언은 반드시 메서드 블록 외부와 클래스 블록 내부에서만 가능
		- 메서드의 호출은 메서드나 생성자 내부에서만 가능
		- 메서드의 호출은 곧 메서드를 사용하는 것을 의미

		1. 메서드가 필요로 하는 데이터(매개값)를 호출부에서 전달
		2. 그 값을 받아서 메서드 내부로 전달하고, 로직이 실행
		3. 실행 결과값을 메서드를 호출한 곳으로 다시 반환
		4. 반환된 값은 변수에 담아서 저장하거나, 출력하는 등 다양하게 활용
	*/

	// 메서드 선언
	static int calcTotal(int end) {
		int total = 0;
		for (int i = 1; i <= end; i++) {
			total += i;
		}
		return total;
	}

	public static void main(String[] args) {

		int result = calcTotal(10);
		System.out.println("result = " + result);

		System.out.println("1~100까지의 누적합 : " + calcTotal(100));
		System.out.println("1~200까지의 누적합 : " + calcTotal(200));
		System.out.println("1~300까지의 누적합 : " + calcTotal(300));

	}
}
