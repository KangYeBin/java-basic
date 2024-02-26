package oop.this_super;

	/*
		# 부모 클래스, 상위 클래스 (Parent, super class)

		- 데이터를 다른 클래스에게 상속하는 클래스를 부모 클래스라고 부릅니다.
		- 상속을 사용하면 데이터를 물려받는 클래스에게 부모 클래스의
		멤버변수(필드)와 메서드가 상속됩니다. 단, 생성자는 상속되지 않습니다.
	*/

public class Player {

	String name;
	int level;
	int atk;
	int hp;

	Player() {
		System.out.println("Player의 기본 생성자 호출");
		level = 1;
		atk = 3;
		hp = 50;
	}

	public Player(String name) {
		this();
		System.out.println("Player의 2번 생성자 호출");
		System.out.println("생성자에서 this의 주소값 : " + this);
		//		level = 1;
		//		atk = 3;
		//		hp = 50;
		this.name = name;
	}

	Player(String name, int hp) {
		this(name);    // 다른 생성자의 호출은 생성자 내에서 최상단에 위치해야한다.
		System.out.println("Player의 3번째 생성자 호출");
		this.hp = hp;
	}

	void attack(Player target) {
		System.out.println("this = " + this);
		System.out.println("target = " + target);

		if (this == target) {
			System.out.println("스스로는 때릴 수 없습니다.");
			return;
		}

		// 출력 메시지 : x가 y를 공격합니다
		System.out.printf("%s가 %s를 공격합니다.\n", this.name, target.name);
		// 맞는 사람의 hp를 10 낮추고, 나의 체력을 5 회복
		target.hp -= 10;
		this.hp += 5;
		System.out.printf("나의 체력 : %d, 상대의 체력 : %d", this.hp, target.hp);
	}

	void characterInfo() {
		System.out.println("*** 캐릭터 정보 ***");
		System.out.println("# 아이디 : " + name);
		System.out.println("# 레벨 : " + level);
		System.out.println("# 공격력 : " + atk);
		System.out.println("# 체력 : " + hp);
	}

}
