package etc.api.lang.obj;

public class MainClass {

	public static void main(String[] args) {
		Person kim = new Person("김춘식", 30);
		Person hong = new Person("홍길동", 25);

		// 객체 타입의 변수를 출력하거나 값을 얻을 때는
		// 뒤에 자동으로 .toString()이 붙어서 진행 (Object가 물려주는 메서드)
		System.out.println(kim);
		System.out.println(hong);

		if (kim.equals(hong)) {
			System.out.println("이름과 나이가 같네요");
		} else {
			System.out.println("이름이 다를수도,나이가 다를수도, 둘 다 다를수도..");
		}

		// finalize는 gc를 호출하는 순서가 보장되지 않기 떄문에 권장X (deprecated)
		// kim = null;
		// hong = null;
		// System.gc();    // 가비지 컬렉터 호출 (부른다고 바로 오지 않음)

		Person park = new Person("박복제인간", 100);
		try {
			Person clonePerson = (Person) park.clone();
			System.out.println("복사된 객체 정보 : " + clonePerson);
			park.setName("박영희");
			System.out.println("park의 주소 : " + park.hashCode());
			System.out.println("복제된 객체 주소 : " + clonePerson.hashCode());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
