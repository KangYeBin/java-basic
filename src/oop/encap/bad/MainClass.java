package oop.encap.bad;

public class MainClass {

	public static void main(String[] args) {

		MyBirth my = new MyBirth();
		my.year = 1992;
		my.month = 10;
		my.day = 13;
		// 이상한 값이 들어가는 것을 막을 수 없다

		my.birthInfo();
	}
}
