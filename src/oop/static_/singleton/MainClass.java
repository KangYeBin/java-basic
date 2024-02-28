package oop.static_.singleton;

public class MainClass {

	public static void main(String[] args) {

		Singleton s = Singleton.getInstance();
//		Singleton s = new Singleton();
		s.method1();
		s.method2();
	}
}
