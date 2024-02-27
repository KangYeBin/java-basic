package oop.poly.player;

public class Mage extends Player {

	int mana;

	Mage(String name) {
		super(name);
		this.mana = 100;
	}

	public void blizzard(Player[] targets) {
		System.out.println(this.name + "님이 눈보라 시전!");
		this.mana -= 30;
		System.out.println("30의 마나가 소모됩니다. 남은 정신력 : " + this.mana);
		System.out.println("=======================================");

		for (Player player : targets) {
			int damage = (int) (Math.random() * 6 + 10);
			player.hp -= damage;
			System.out.println(player.name + "님이 " + damage + "의 피해를 입었습니다." +
					"(남은 체력 : " + player.hp + ")");
		}

	}

	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 마나 : " + mana);
	}
}
