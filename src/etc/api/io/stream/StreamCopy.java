package etc.api.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StreamCopy {

	public static void main(String[] args) {

		try (
				FileInputStream fis = new FileInputStream("C:/MyWorkspace/cat.jpg");
				FileOutputStream fos = new FileOutputStream("C:/MyWorkspace/copy.jpg")
		) {
			int data = 0;

			while (data != -1) {
				// 1바이트 단위로 데이터를 읽어들임과 동시에 데이터를 작성
				data = fis.read();
				fos.write(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
