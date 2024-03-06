package etc.api.io.rw;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) {

		/*
			- 문자를 써서 저장할 때 사용하는 클래스 FileWriter
			- 기본적으로 2바이트 단위로 처리하기 때문에 문자 쓰기에 적합
		*/

		try (FileWriter fw = new FileWriter("C:/MyWorkspace/merong.txt")) {

			// \r: 캐리지 리턴 -> 커서를 맨 앞으로 이동시키는 동작
			// \n: 줄 개행(줄바꿈)
			// 상황과 환경에 따라서 줄 개행 시 커서를 맨 앞으로 옮기지 않는 경우가 있다
			String text = "오늘은 2024년 3월 5일 화요일입니다\r\nㅠㅠ";

			fw.write(text);
			System.out.println("파일 정상 저장 완료!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
