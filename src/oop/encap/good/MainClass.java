package oop.encap.good;

public class MainClass {

	public static void main(String[] args) {

		MyBirth my = new MyBirth();

		my.setYear(2002);
		my.setMonth(11);
		my.setDay(30);

		my.birthInfo();

		/*
			# 캡슐화(encapsulation) : 데이터와 데이터를 다루는 여러가지 메서드들을 하나로 묶는 이러한 행위들
			데이터와 그 데이터를 다루는 로직을 하나로 묶어 쉽게 관리하고 유지 보수하기 위해 사용
		*/
	}
}
