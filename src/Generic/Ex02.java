package Generic;

public class Ex02 {

	public static void main(String[] args) {
		
		//String 타입의 클래스 객체 생성
		Generic<String> gs = new Generic<String>();
		String[] str1 = {"홍길동", "이순신", "유관순"};
		String var1 = "김유신";
		
		gs.setArr(str1);
		gs.setVar(var1);
		
		gs.prn();
		System.out.println();
		
		//Integer 타입의 클래스 객체 생성
		Generic<Integer> gi = new Generic<Integer>();
		Integer[] iarr = {100, 200, 300};
		Integer ivar = 247;
		
		gi.setArr(iarr);
		gi.setVar(ivar);
		
		gi.prn();
	}

}
