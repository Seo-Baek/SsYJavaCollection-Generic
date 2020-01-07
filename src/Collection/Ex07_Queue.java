package Collection;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 	Queue 인터페이스
 * 	 - 인터페이스이므로 자식클래스에서 객체 생성하여 사용함.
 * 	 - 대표적인 자식클래스는 LinkedList임.
 * 	 - 특징 : 선입선출(FIFO : First In First Out) 구조임.
 */

public class Ex07_Queue {

	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<String>();
		
		// 1. 큐에 저장하는 메소드 : offer()
		queue.offer("100번 손님 ");
		queue.offer("101번 손님 ");
		queue.offer("102번 손님 ");
		queue.offer("103번 손님 ");
		queue.offer("104번 손님 ");
		queue.offer("105번 손님 ");
		
		// 2. 큐에 저장된 맨 처음 데이터를 가져오는 메소드 : peek()
		//    큐에서 데이터를 제거하지 않는 메소드
		System.out.println("처음 호출한 번호 >>> " + queue.peek());
		System.out.println();
		
		// 2. 큐에 저장된 맨 처음 데이터를 가져오는 메소드 : poll()
		//    큐에서 데이터를 제거하는 메소드
		while(!queue.isEmpty()) {
			System.out.println("호출할 번호 >>> " + queue.poll());
		}
	}

}
