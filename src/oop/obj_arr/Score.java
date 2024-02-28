package oop.obj_arr;

public class Score {

	/*
		- 이름, 국어, 영어, 수학, 총점, 평균(double)을
		담을 수 있는 객체를 디자인하세요.

		- 학생의 모든 정보를 한 눈에 확인할 수 있게
		scoreInfo() 메서드를 선언해 주세요.
		메서드 내부에는 출력문을 이용해서 모든 정보를 출력해 주세요.

		- 캡슐화를 구현해서 작성해 주세요. (생성자는 맘대로 하세요.)
	*/

	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;

	public Score() {
	}

	public Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = this.total / 3.0;
	}

	public static boolean isValidateScore(int score) {
		if (score < 0 || score > 100) {
			System.out.println("유효하지 않는 점수입니다 (0 ~ 100)");
			return false;
		} else {
			return true;
		}
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getTotal() {
		return total;
	}

	public double getAvg() {
		return avg;
	}

	void scoreInfo() {
		System.out.printf("이름 : %s\n국어 : %d, 수학 : %d, 영어 : %d\n총점 : %d, 평균 : %.2f\n"
				, this.name, this.kor, this.eng, this.math, this.total, this.avg);
	}
}
