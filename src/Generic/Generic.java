package Generic;

/*
 * 제네릭(Generic) - 포괄적인, 총괄적인
 * 	1. 특정 클래스에 원하는 객체 타입을 지정하여
 * 	     지정된 객체만 저장하게 하는 자바 문법.
 * 	     다양한 타입의 객체들을 다루는 메소드나
 * 	     컬렉션에서 컴파일할 때 타입을 확인해 주는 기능 
 * 		=> 즉, 다루어질 객체의 타입을 미리 명시함으로써
 * 		     번거로운 형변환을 줄여준다는 장점이 있음.
 * 	2. Java SE 5.0에서부터 추가된 기능.
 * 	3. 데이터의 명확성과 안정성을 보장해줌.
 * 		=> 다른 데이터 타입이 들어올 경우
 * 		     컴파일 시점에서 error 발생.
 */

public class Generic<T> {

	
	T[] str;
	T var;
	
	public void setArr(T[] str) {
		this.str = str;
	}
	public void setVar(T var) {
		this.var = var;
	}
	public void prn() {
		for(T s : str) {
			System.out.println("str 요소 ==> " + s);
		}
		
		System.out.println("var ==> " + var);
	}
	
	
	
}