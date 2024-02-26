package oop.modi.member.pac2;

import oop.modi.member.pac1.A;

public class C {

	public C() {
		A a = new A();
		a.x = 1;
//		a.y = 2;	default
//		a.z = 3;	private

		a.method1();
//		a.method2();	default
//		a.method3();	private
	}
}
