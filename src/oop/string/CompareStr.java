package oop.string;

import java.util.Scanner;

public class CompareStr {

	/*
		- String은 객체 타입
		여러 개의 단일 문자를 변수 하나에 넣을 수 없기 때문에
		String 객체가 생성되어서 여러 문자들을 한번에 보관하고
		문자열을 다룰 수 있는 여러 기능들을 제공

		- 그렇기 때문에 String 변수에는 문자열이 아니라 문자열 객체의 주소값이 들어있다.
		평소에 String 변수를 사용해도 문자열이 제대로 나오는 것은 자바에서 편하게 쓰라고 기능을 제공하는 것,
		실제로는 주소값으로 접근해서 사용하는 것

		- 그렇기 때문에 '==' 연산자로 변수의 값 자체를 비교하는 것은 주소값을 비교하겠다는 의미
		문자열의 내용 값 그 자체를 비교할 때는 equals() 메서드를 사용
	*/

	public static void main(String[] args) {

		String name = "김춘식";
		String name2 = "김춘식"; // name == name2 -> 주소값 비교 true
		name2 = new String("김춘식");	// name == name2 -> false
		System.out.println(name == name2);

		Scanner sc = new Scanner(System.in);

		User kim = new User();
		kim.id="abc1234";
		kim.pw="aaa1111";

		System.out.print("비밀번호를 입력하세요 : ");
		String password = sc.next();

		System.out.println("kim.pw = " + kim.pw);
		System.out.println("password= " + password);

		System.out.println("== 연산자의 결과 : " + (password == kim.pw));
		System.out.println("equals의 결과 : "+ password.equals(kim.pw));

	}
}
