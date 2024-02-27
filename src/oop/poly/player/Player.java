package oop.poly.player;

public class Player {

	String name;
	int level;
	int atk;
	int hp;

	Player() {
		level = 1;
		atk = 3;
		hp = 50;
	}

	public Player(String name) {
		this();
		this.name = name;
	}

	Player(String name, int hp) {
		this(name);
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
