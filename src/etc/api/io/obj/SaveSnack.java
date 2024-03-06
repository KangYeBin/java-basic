package etc.api.io.obj;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SaveSnack {

	public static void main(String[] args) {

		List<Snack> snackList = new LinkedList<>();
		Collections.addAll(snackList,
				new Snack("콘칩", 1970, 1500, Snack.Taste.GOOD),
				new Snack("사브레", 1980, 200, Snack.Taste.BAD),
				new Snack("오징어집", 1970, 1500, Snack.Taste.SOSO)
		);

		try (
				FileOutputStream fos = new FileOutputStream("C:/MyWorkSpace/snack.sav")
		) {
			// 객체를 저장할 수 있는 보조스트림
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(snackList);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
