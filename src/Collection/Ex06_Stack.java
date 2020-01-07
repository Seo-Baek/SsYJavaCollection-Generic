package Collection;

import java.util.Stack;

/*
 * Stack 클래스
 * 	- 후입선출(LIFO : Last In First Out) 구조임. 	
 */

public class Ex06_Stack {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		// 1. 스택에 저장 : push()
		stack.push("강감찬");
		stack.push("세종대왕");
		stack.push("김구");
		stack.push("윤봉길");
		stack.push("김연경");
		
		// 2. 저장된 데이터를 가져오는 메소드 : peek()
		//    peek() : stack의 맨 위에 있는 데이터를 가져오는 메소드
		//		  	     데이터를 stack에서 제거하지 않음.
		System.out.println("Stack peek() >>> " + stack.peek());
		System.out.println("Stack peek() >>> " + stack.peek());
		System.out.println();
		
		// 2. 저장된 데이터를 가져오는 메소드 : pop()
		//    pop() : stack의 맨 위에 있는 데이터를 가져오는 메소드
		//            데이터를 stack에서 제거함.
		while(!stack.isEmpty()) {
			System.out.println("이 름 >>> " + stack.pop());			
		}
		
		
	}

}
