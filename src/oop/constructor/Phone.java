package oop.constructor;

public class Phone {

	String model;
	String color;
	int price;
	
	/*
		# 생성자 (Constructor)
		
		1. 생성자는 객체를 생성하는 역할, 그러므로 클래스 내부에 반드시 하나 이상 존재.
		2. 만약 생성자가 하나도 존재하지 않는다면 JVM이 자동으로 매개변수가 하나도 존재하지 않는
		가장 기본 형태의 생성자를(default constructor)를 하나 만들어준다.
		3. 생성자는 반드시 클래스 이름과 대/소문자까지 동일하게 작성하여 선언하고, 리턴 타입이 존재하지 않는다.
		4. 생성자 내부에는 객체가 생성되자마자 해야 할 로직들을(초기화) 기술할 수 있습니다.
	*/
	
	
	// 생성자 선언
	Phone() {
		// 객체가 생성되자마자 해야 할 일을 작성 (초기화)

		model = "폴더폰";
		color = "회색";
		price = 200000;
	}

	/*
		#생성자 오버로딩 (중복 선언)

		1. 생성자는 중복해서 여러 개 선언 가능
		2. 단, 생성자의 매개 변수 타입, 개수, 순서 중  하나가다 달라야 중복 인정
	*/

	Phone(String pModel) {
		model = pModel;
		color = "화이트";
		price = 1000000;
	}

	Phone(String pModel, String pColor) {
		model = pModel;
		color = pColor;
		price = 1200000;
	}
	
	void showSpec() {
		System.out.println("*** 핸드폰 정보 ***");
		System.out.println("모델명 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("가격 : " + price + "원");
	}
}
