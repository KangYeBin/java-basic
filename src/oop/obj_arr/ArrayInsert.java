package oop.obj_arr;

import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {

	/*
		- 스캐너를 이용하여 Person객체를 생성하는 데 필요한
		정보를 입력받으시면 되겠습니다.
		입력받은 정보를 토대로 Person객체를 생성한 후
		여러 개의 Person 객체를 배열에다 담아 둘 생각입니다.

		- 배열의 크기는 3개로 하겠습니다.
		반복문을 이용하여 입력을 반복해서 받아주시면 됩니다.

		- 입력이 끝나면 배열 안에 있는 모든 주소값을 순회하여
		각 객체의 personInfo()를 호출해 보세요.
	*/

		Person[] people = new Person[3];
		Scanner s = new Scanner(System.in);

		for (int i = 0; i < people.length; i++) {
			System.out.print("이름을 입력하세요 : ");
			String name = s.next();
			System.out.print("나이를 입력하세요 : ");
			int age = s.nextInt();
			System.out.print("성별을 입력하세요 : ");
			String gender = s.next();

			people[i] = new Person(name, age, gender);
		}

		for (Person person : people) {
			person.personInfo();
		}
	}
}
