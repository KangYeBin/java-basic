package video.user.service;

import video.common.AppService;
import video.user.repository.UserRepository;
import video.user.domain.Grade;
import video.user.domain.User;

import java.util.ArrayList;
import java.util.List;

import static video.ui.AppUi.*;

public class UserService implements AppService {

	private final UserRepository userRepository = new UserRepository();

	@Override
	public void start() {

		while (true) {
			userManagementScreen();
			int selection = inputInteger(">>> ");

			switch (selection) {
				case 1:
					join();
					break;
				case 2:
					showSearchUsers();
					break;
				case 3:
					deleteUser();
					break;
				case 4:
					return;    // start() 메서드를 강제 종료해서 초기 화면으로 돌아가도록 처리
				default:
			}
		}
	}

	// 회원 추가 비즈니스 로직
	// 비즈니스 로직 : 요청에 따른 데이터의 생성, 조회, 저장, 변경 등의 로직
	private void join() {

		System.out.println("\n===== 회원 가입을 진행합니다 =====");
		String name = inputString("# 회원명 : ");
		String phone = inputString("# 전화번호 : ");

		// 입력받은 값을 토대로 User 객체 생성 (신규 회원은 Bronze 등급으로)
		User newUser = new User(name, phone, Grade.BRONZE);

		userRepository.addUser(newUser);
		System.out.printf("\n### [%s]님의 회원 가입이 완료되었습니다\n", name);

	}

	// 이름을 입력받아 해당 이름이 포함된 객체 리스트 리턴
	private List<User> searchUser() {
		System.out.println("\n===== 조회할 회원의 이름을 입력하세요 =====");
		String name = inputString(">>> ");

		return userRepository.findUserByName(name);
	}

	// 조회된 결과 출력
	private void showSearchUsers() {
		List<User> userList = searchUser();
		if (!userList.isEmpty()) {
			System.out.println("\n========================== 회원 조회 결과 ==========================");
			for (User user : userList) {
				System.out.println(user);
			}
		} else {
			System.out.println("\n### 조회 결과가 없습니다\n");
		}
	}

	// 회원 탈퇴 비즈니스 로직
	private void deleteUser() {
		List<User> userList = searchUser();

		if (!userList.isEmpty()) {
			// 삭제 대상 회원 번호를 저장할 리스트 -> 맞는 번호를 입력했는지 확인용
			List<Integer> userNums = new ArrayList<>();

			for (User user : userList) {
				userNums.add(user.getUserNumber());
				System.out.println(user);
			}
			System.out.println("\n### 탈퇴할 회원의 번호를 입력하세요");
			int delUserNum = inputInteger(">>> ");

			if (userNums.contains(delUserNum)) {
				User delUser = userRepository.deleteUser(delUserNum);
				System.out.printf("\n### %s[%s]님의 회원정보가 정상 삭제되었습니다\n",
						delUser.getUserName(), delUser.getPhoneNumber());
			} else {
				System.out.println("\n### 검색한 회원의 회원번호로만 삭제가 가능합니다");
			}

		} else {
			System.out.println("\n### 조회 결과가 없습니다\n");
		}

	}

}
