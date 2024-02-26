package oop.encap.good;

public class MyBirth {

	/*
		# 정보 은닉 : 데이터 보호의 목적으로 사용하는 oop 기술 중 하나
		- 외부에서 직접 필드에 접근할 수 없도록 필드에 private 제한을 붙임
	*/

	private int year;
	private int month;
	private int day;

	/*
		- 정보 은닉은 데이터에 접근 제한을 걸어서 정보를 보호하는 것이 목적이지만
		private 설정으로 데이터 접근 자체가 불가능

		- 따라서 데이터의 유효성을 검증할 수 있는 제어문이 포함된
		메서드를 사용하여 데이터의 접근을 허용하도록 설계하는데,
		이 때 사용하는 메서드를 getter / setter 메서드라고 부른다.

		# setter method

		1. setter는 숨겨진 변수에 값을 저장하기 위한 메서드
		2. 메서드 내부에 데이터 유효성 검증 로직을 작성하여 적절한 데이터만 멤버변수에 저장시키고,
		접근제한자는 public으로 설정하여 외부에서 누구나 사용할 수 있게 한다.
		3. 메서드 이름은 일반적으로 set + 멤버 변수 이름으로 설정

		# getter method

		1. getter는 숨겨진 변수의 값을 참조할 때 사용하는 메서드
		2. setter와 마찬가지로 public 제한을 통해 외부에 메서드를 공개하고,
		이름은 일반적으로 get + 멤버 변수 이름으로 설정
	*/

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year < 1900 || year > 2024) {
			System.out.println("잘못된 연도입니다");
			return;
		}
		this.year = year;
	}

	/*
		- month와 day의 setter / getter 메서드를 선언하세요.
		- month: 1 ~ 12
		- day: 1 ~ 31
		- getter 메서드는 따로 비밀번호 등 권한 검사 없이
		바로 return 속성값 해 주세요.
	*/

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int month) {
		if (month > 12 || month < 1) {
			System.out.println("잘못된 월입니다");
			return;
		}
		this.month = month;
	}

	public int getDay() {
		return this.day;
	}

	public void setDay(int day) {
		if (day > 31 || day < 1) {
			System.out.println("잘못된 날짜입니다");
			return;
		} else {
			if (this.month == 0) {
				System.out.println("월을 먼저 입력해주세요");
				return;
			}

			if (!isValidateMonth(day)) {
				System.out.println("일자가 올바르지 않습니다");
				return;
			}
		}
		this.day = day;
	}

	// 메서드가 private -> 해당 클래스 안에서만 호출 가능
	private boolean isValidateMonth(int day) {
		switch (this.month) {
			case 2:
				if (day > 28) return false;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if (day > 30) return false;
				break;
			default:
				return true;
		}
		return true;
	}


	// 완성된 생일 정보를 출력해주는 메서드
	// year, month, day 셋 중 하나라도 셋팅되지 않았다면 출력 X
	public void birthInfo() {
		if (this.year == 0 || this.month == 0 || this.day == 0) {
			System.out.println("초기화 되지 않은 데이터가 있습니다");
			return;
		}
		System.out.printf("내 생일은 %d년 %d월 %d일 입니다.\n"
				, this.year, this.month, this.day);

	}
}
