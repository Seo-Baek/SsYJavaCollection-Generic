package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * LinkedList
 * 	- List 인터페이스 자식클래스의 한 종류
 * 	- 특징
 * 	  1) 인접 참조를 링크해서 체인처럼 관리함.
 *    2) 특정 인덱스에서 객체를 제거하거나 추가하게 되면
 *       앞 뒤의 링크만 연결하면 됨.
 *    3) 빈번한 객체의 삽입과 삭제가 일어나는 곳에서는
 *       ArrayList보다 더 좋은 성능을 발휘함.
 *       (단, 중간의 데이터 삽입과 삭제가 일어나는 경우에만 해당)
 */


public class Ex02_WorkingTimeBetweenArrayLinked {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		
		long start;
		long end;
		
		// ArrayList의 작업시간 확인
		// currntTimeMillis() : 현재의 시간을 계산할 수 있는 메소드
		start = System.currentTimeMillis();
		// 작업에 걸린 시간을 확인할 수도 있다!
		
		for(int i = 0; i < 10000;  i++) {
			list1.add(0, i);
		}
		
		end = System.currentTimeMillis();
		
		System.out.println("ArrayList가 추가하는데 걸린 시간 >>> " + (end - start) + "ms");
		System.out.println();
		
		// LikedList 작업시간 확인
		start = System.currentTimeMillis();
		
		for(int i = 0; i < 10000;  i++) {
			list2.add(0, i);
		}
		
		end = System.currentTimeMillis();
		
		System.out.println("LikedList가 추가하는데 걸린 시간 >>> " + (end - start) + "ms");
		
	
	}

}
