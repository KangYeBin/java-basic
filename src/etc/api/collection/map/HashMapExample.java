package etc.api.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		/*
			# Map
			- Key / Value가 한 세트를 이루는 자료구조
			- Key값을 통해 Value를 참조하는 방식.
			- Key는 중복 저장을 허용하지 않는다.
		*/

		// Map은 Key, Value 쌍을 이루기 때문에 멀티 제네릭을 설정
		Map<String, String> map = new HashMap<>();

		// put(key, value) : Map에 데이터를 추가하는 메서드
		map.put("멍멍이", "김철수");
		map.put("야옹이", "홍길동");
		map.put("짹짹이", "박영희");
		System.out.println(map);

		// Map은 Key의 중복 저장을 허용하지 않음
		// 만약 중복 Key를 사용하여 put을 호출하면 value만 수정됨
		map.put("멍멍이", "김뽀삐"); // key 중복
		map.put("어흥이", "홍길동"); // value 중복
		System.out.println(map);

		// containsKey(key) : Map 내부에 Key의 존재 유무 확인 메서드
		System.out.println(map.containsKey("멍멍이"));

		// get(key) : Map 내부의 값을 참조하는 메서드
		String nick = "메롱이";
		if (map.containsKey(nick)) {
			System.out.println(nick + " 별명을 가진 학생은 " + map.get(nick));
		} else {
			System.out.println("그런 별명을 가진 학생은 없습니다");
		}

		// size() : Map의 크기를 확인하는 메서드
		System.out.println("map의 크기 : " + map.size());

		// ketSet() : Map에서 Key들만 추출하는 메서드
		// 모든 key들을 Set에 담아서 반환 -> 반복문 처리 가능

		for (String string : map.keySet()) {
			System.out.println("key : " + string + ", value : " + map.get(string));
		}

		// remove(key) : Map의 객체를 삭제
		// key를 주면 value도 함께 제거
		map.remove("야옹이");

		// clear() : Map의 모든 객체 재거
		map.clear();
		System.out.println(map);

	}

}
