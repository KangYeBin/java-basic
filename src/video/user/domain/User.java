package video.user.domain;

import video.order.domain.Order;

import java.util.HashMap;
import java.util.Map;

public class User {

	private static int sequence; // 회원 누적 순차번호

	private int userNumber; // 회원번호
	private String userName;
	private String phoneNumber;
	private Grade grade;
	private int totalPaying;
	private Map<Integer, Order> orderList;    // 회원마다 가지는 대여 목록

	public User(String userName, String phoneNumber, Grade grade) {
		this.userNumber = ++sequence;    // 회원이 생성될 때 회원 고유 번호를 하나 올려서 대입
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.grade = grade;
		this.orderList = new HashMap<>();
	}

	public static int getSequence() {
		return sequence;
	}

	public static void setSequence(int sequence) {
		User.sequence = sequence;
	}

	public Map<Integer, Order> getOrderList() {
		return orderList;
	}

	public void addOrder(Order order) {
		this.orderList.put(order.getMovie().getSerialNumber(), order);
	}

	public int getTotalPaying() {
		return totalPaying;
	}

	public void setTotalPaying(int totalPaying) {
		this.totalPaying += totalPaying;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "## 회원번호: " + userNumber +
				", 회원명: " + userName +
				", 전화번호: " + phoneNumber +
				//				", 총 결제금액: " + totalPaying + "원" +
				", 등급: " + grade;
	}
}
