package Collection;

import java.util.ArrayList;

/*
 * 컬렉션 프레임워크
 * 	- 컬렉션의 사전적 의미 : 수집해서 모으다, 저장한다는 의미
 * 	1. 자바에서의 컬렉션은 데이터의 추가, 수정, 삭제, 검색 등을 
 *     효과적으로 제공해주는 자료구조 관련 클래스.
 *  2. 컬렉션 프레임워크
 *     1) 컬렉션 클래스를 표준화하여 설계해놓은 인터페이스.
 *     2) List 계열, Set 계열, Map 계열 
 */

/*
 * 1. List 계열
 * 	- 자료의 순서가 보장(index) : 정렬 기능 제공.
 * 	- 중복 데이터가 허용.
 * 	- List 인터페이스의 자식클래스로 구현.
 * 	   => ArrayList(O), LinkedList(X), Vector(X)
 * 	- 특히 DB에 저장된 데이터를 레코드 단위로
 *    저장하거나 가져올 경우 많이 사용이 됨.
 */

public class Ex01_ArrayList {

	public static void main(String[] args) {
		
		// ArrayList 객체 생성
		ArrayList<String> list = new ArrayList<String>();
		
		// 1. 데이터를 추가하는 방법 : add("값")
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");	// 중복데이터
		list.add("김유신");
		list.add("김연아");
		list.add("유관순");	// 중복데이터
		
		// 2. 데이터의 크기 반환 : size()
		System.out.println("list의 크기 >>> " + list.size());
		System.out.println();
		
		// 3. list의 데이터를 출력하는 방법 : get(index)
		System.out.println("세번째 index 데이터 >>> " + list.get(3));
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("list [" + i +"] >> " + list.get(i));
		}
		System.out.println();
		
		// 4. 모든 요소 제거 : clear()
		list.clear();
		System.out.println("list의 크기 >>> " + list.size());
		System.out.println();
		
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");	// 중복데이터
		list.add("김유신");
		list.add("김연아");
		list.add("유관순");	// 중복데이터
		System.out.println("list의 크기 >>> " + list.size());
		System.out.println();
		
		// 5. list의 특정 요소 제거 : remove(index)
		//    다음 index부터 index 값이 앞으로 한 칸씩 당겨진다.
		list.remove(2);		//"유관순" 제거
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("list [" + i + "] >>> " + list.get(i));
		}
		System.out.println();
		
		// 6. list에 특정 요소 추가 : add(index element)
		//    해당 index로 추가가 되고, 기존의 index 안의 값은 뒤로 한 칸씩 밀린다.
		list.add(3, "강감찬");
		for(int i = 0; i < list.size(); i++) {
			System.out.println("list [" + i + "] >>> " + list.get(i));
		}
		System.out.println();
		
		
	}

}
