package oop.obj_arr;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {

		//	Person kim = new Person("김춘식", 32, "남자");
		//	Person lee = new Person("이영희", 25, "여자");
		//	Person park = new Person("박뽀삐", 50, "남자");

		//	kim.personInfo();
		//	lee.personInfo();
		//	park.personInfo();

		//	Person[] people = new Person[3];
		//	people[0] = new Person("김춘식", 32, "남자");

		Person[] people = {
				new Person("김춘식", 32, "남자"),
				new Person("이영희", 25, "여자"),
				new Person("박뽀삐", 50, "남자")
		};

//		for (int i = 0; i < people.length; i++) {
//			people[i].personInfo();
//		}

		for (Person person : people) {
			person.personInfo();
		}
	}
}
