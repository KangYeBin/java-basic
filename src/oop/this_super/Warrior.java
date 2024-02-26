package oop.this_super;

public class Warrior extends Player {

	int rage;

	Warrior(String name) {
		// 모든 생성자에는 super()가 내장
		// 자식 객체가 생성될 때는 부모의 객체도 생성되어야
		// 부모의 속성이과 기능이 실존하게 되고, 물려줄 수 있기 때문
		super(name);
		// this.name = name; // 부모의 생성자가 대신 초기화
		this.rage = 60;
	}

	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 분노 : " + rage);
	}
}
