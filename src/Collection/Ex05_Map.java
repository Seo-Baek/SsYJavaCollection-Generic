package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 *  3. Map 계열의 컬렉션 프레임워크 특징
 *  	- key와 value를 한 쌍으로 데이터를 저장하고,
 *        검색하는 기능을 제공.
 *      - key는 중복 불가, value는 중복 가능.
 *      - Map 인터페이스의 자식 클래스로 구현
 *        => HashMap(O), HashTable(O), TreeMap(X), Properties(가끔 사용)
 */

public class Ex05_Map {

	public static void main(String[] args) {
		
		// Map 인터페이스의 자식클래스로 객체 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		
		// 1. 데이터 저장 : put(key, value)
		// 이름을 키로 저장, 점수를 값(value)로 저장
		map.put("홍길동", 95); 
		map.put("강감찬", 84);
		map.put("세종대왕", 100);
		map.put("김유신", 88);
		map.put("유관순", 90);
		
		// 2. 키를 이용하여 데이터 검색 - get(key)
		System.out.println("유관순 점수 >>> " + map.get("유관순"));
		System.out.println("세종대왕 점수 >>> " + map.get("세종대왕"));
		System.out.println();
		
		System.out.print("검색할 이름 입력 : " );
		String name = sc.next();
		
		if(map.containsKey(name)) {
			System.out.println(name + "님의 점수 >>> " + map.get(name) + "점");
		} else {
			System.out.println("검색한 이름이 없습니다.");
		}
		System.out.println();
		
		// 3. map의 전체 내용 출력 : ketSet()
		for(String key : map.keySet()) {
			//Integer value = map.get(key);
			System.out.println(key + "의 value >>> " + map.get(key));
		}
		
		sc.close();
		
		
	}

}
