package oop.inter;


	// 인터페이스 : 객체의 규격(기능)을 표준화해서 명세하는 역할
public interface Inter {

	// 인터페이스에서 변수를 선언하면 상수(static final)로 인식
	int NUM = 5;

	// Inter() {
	// 인터페이스응 생성자를 가질 수 없다. (객체화 될 수 없는 개념)
	// }
	
	public static void staticMethod() {
		System.out.println("가능");
	}

	// 인터페이스에서 메서드를 선언하면 추상 메서드로 지정
	void method1();

}
