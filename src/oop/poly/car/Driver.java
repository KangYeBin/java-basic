package oop.poly.car;

public class Driver {
	//	public void drive (Tesla t) {
	//		System.out.println("운전을 시작합니다");
	//		t.run();
	//	}
	//
	//	public void drive (Sonata s) {
	//		System.out.println("운전을 시작합니다");
	//		s.run();
	//	}
	//
	//	public void drive (Porsche p) {
	//		System.out.println("운전을 시작합니다");
	//		p.run();
	//	}

	public void drive(Car car) {
		System.out.println("운전을 시작합니다");
		car.run();
	}

	//	public Sonata buySonata() {
	//		System.out.println("소나타를 구입합니다");
	//		return new Sonata();
	//	}
	//
	//	public Tesla buyTesla() {
	//		System.out.println("테슬라를 구입합니다");
	//		return new Tesla();
	//	}
	//
	//	public Porsche buyPorsche() {
	//		System.out.println("포르쉐를 구입합니다");
	//		return new Porsche();
	//	}

	public Car buyCar(String name) {
		if (name.equals("소나타")) {
			System.out.println("소나타를 구입합니다");
			return new Sonata();
		} else if (name.equals("포르쉐")) {
			System.out.println("포르쉐를 구입합니다");
			return new Porsche();
		} else if (name.equals("테슬라")) {
			System.out.println("테슬라를 구입합니다");
			return new Tesla();
		} else {
			return null;
		}
	}

}
