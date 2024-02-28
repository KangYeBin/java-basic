package oop.inter.good;

public class Login implements IUserService{

	public Login() {
		System.out.println("로그인 요청이 들어옴");
	}

	@Override
	public void excute() {
		System.out.println("사용자가 입력한 id, pw를 가져와서 비교..");
	}
}
