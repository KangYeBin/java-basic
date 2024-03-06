package etc.api.io.obj;

import java.io.Serializable;

// 객체를 스트림으로 전송하려면 직렬화가 가능해야 한다
// 직렬화 (serialize) : 자바 언어에서 사용되는 Object 또는 Data를
// 다른 환경의 자바에서도 사용할 수 있도록 바이트 형태의 연속적인 데이터로 변환하는 기술
public class Snack implements Serializable {

	private String snackName;
	private int year;
	private int price;
	private Taste taste;

	public Snack(String name, int year, int price, Taste taste) {
		this.snackName = name;
		this.year = year;
		this.price = price;
		this.taste = taste;
	}

	@Override
	public String toString() {
		return "Snack{" +
				"name='" + snackName + '\'' +
				", year=" + year +
				", price=" + price +
				", tase='" + taste + '\'' +
				'}';
	}

	public enum Taste {
		GOOD, BAD, SOSO
	}
}