package oop.constructor;

public class Bread {

	String breadName;
	int price;
	String ingredient;


	/*
		기본 생성자를 자동으로 만들어주는 것은 생성자가 하나도 선언되어있지 않을 때만 자동 생성
		매개값을 아무 것도 받지 않는 기본 생성자는 클래스 내에 존재하는 편이 좋다.
		매개값을 받는 생성자를 이용할 수도 있지만, 기본 형태로 생성되어야 할 일도 있기 때문에
	*/


	Bread() {

	}

	Bread(String breadName, int price, String ingredient) {
		this.breadName = breadName;
		this.price = price;
		this.ingredient = ingredient;
	}

	void breadInfo() {
		System.out.println("이름: " + breadName);
		System.out.println("가격: " + price + "원");
		System.out.println("주재료: " + ingredient);
	}
}
