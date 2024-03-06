package etc.api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamEx {

	public static void main(String[] args) {

		/*
			1. 파일을 읽어들이는 데 사용하는 클래스는 FileInputStream
			2. 생성자의 매개값으로 읽어들일 파일의 전체 경로를 적는다
			3. InputStream 객체는 생성자에 throws가 있기 때문에 예외처리를 진행해야 한다
		*/


		// try-with-resources 문법을 사용하여 auto close를 진행 (자바 8버전)
		// close 하려는 객체가 AutoCloseable 인터페이스와 구현 관계이어야 한다
		try (FileInputStream fis = new FileInputStream("C:/MyWorkspace/test.txt")
		) {
			int data = 0;

			while (data != -1) {    // 더 이상 읽어올 값이 없다면 -1 리턴
				data = fis.read();    // 1바이트 단위로 데이터를 읽어들임
				System.out.print((char)data);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
