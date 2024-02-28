package oop.inter.animal;

public class Livings implements Animal {

	/*
		- 인터페이스만으로는 아무 것도 할 수 없다.
		인터페이스를 구현하는 클래스를 통해 명세된 내용을 구현
		- 인터페이스의 구현 키워드는 implements
		상속과 같이 클래스 이름 뒤에 구현하고자 하는 인터페이스의 이름
		- 인터페이스에 선언된 추상 메서드는 반드시 구현 클래스에서 오버라이딩 진행
		or abstract를 선언해서 자식에게 구현하도록 해야한다.
		- 인터페이스는 하나의 클래스에서 여러 개의 인터페이스를 동시에 다중 구현 가능
		인터페이스들끼리 다중 상속도 가능
	*/
	
	String name;
	int age;

	@Override
	public void feed(String foodName) {

	}

	@Override
	public boolean sleep() {
		return false;
	}
}
