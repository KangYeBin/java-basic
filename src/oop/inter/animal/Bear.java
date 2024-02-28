package oop.inter.animal;

public class Bear extends Livings implements BadAnimal {
	@Override
	public void feed(String foodName) {
		super.feed(foodName);
	}

	@Override
	public boolean sleep() {
		return super.sleep();
	}

	@Override
	public void hunt(Animal animal) {

	}

	@Override
	public void angry() {

	}

	@Override
	public void fight() {

	}
}
