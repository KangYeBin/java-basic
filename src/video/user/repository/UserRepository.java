package video.user.repository;

import video.user.domain.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {

	private static final Map<Integer, User> userDatabase = new HashMap<>();

	// 회원 추가 기능
	public void addUser(User user) {
		userDatabase.put(user.getUserNumber(), user);
	}

	// 이름을 통해 회원 검색 -> 동명이인이 있다면 모두 리턴하기 위해 List 리턴 타입
 	public List<User> findUserByName(String userName) {
		List<User> userList = new ArrayList<>();

		// Map을 반복  처리하기 위해 Key들을 Set으로 반환
		for (int key : userDatabase.keySet()) {
			User user = userDatabase.get(key);
			if (userName.equals(user.getUserName())) {
				userList.add(user);
			}
		}
		return userList;
	}

	public User deleteUser(int deleteUserNum) {
		User user = userDatabase.get(deleteUserNum);
		userDatabase.remove(deleteUserNum);
		return user;
	}

	public User findUserByNumber(int userNumber) {
		return userDatabase.get(userNumber);
	}
}
