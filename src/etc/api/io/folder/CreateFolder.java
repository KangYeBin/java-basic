package etc.api.io.folder;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {

		/*
			- 자바에서 외부 경로로 폴더를 생성할 때는 File 클래스를 사용
			- 생성자의 매개값으로 폴더를 생성할 경로 + 폴더명을 지정
		*/

		File file = new File("C:/MyWorkspace/folder_test/test/myTest");

		if (!file.exists()) {    // 해당 디렉토리 경로가 존재하지 않는다면
//			file.mkdir();		// 만들고자 하는 경로의 상위 디렉토리가 존재하지 않는다면 동작 안 함
			file.mkdirs();		// 전부 만들어줌
			System.out.println("폴더 생성 완료!");
		} else {
			System.out.println("이미 존재하는 경로입니다");
		}


		if (file.exists()) {
			file.delete();
			System.out.println("삭제 완료");
		} else {
			System.out.println("삭제 실패 or 경로가 존재하지 않음");
		}

		/*
			- 폴더를 삭제할 때, 해당 폴더에 내부 경로가 더 존재하거나, 파일이 있는 경우에는 폴더를 삭제할 수 없다
			- listFiles()를 통해 파일 내부 경로 또는 파일명을 얻어와서 파일부터 삭제한 후에 폴더를 삭제할 수 있다
			- 지우고자 하는 경로가 여러 개라면 위의 행동을 반복해 주면 된다
		*/

	}
}
