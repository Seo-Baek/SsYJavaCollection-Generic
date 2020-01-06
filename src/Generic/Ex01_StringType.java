package Generic;

public class Ex01_StringType {

	public static void main(String[] args) {
		
		// StringType 클래스 객체 생성
		StringType st = new StringType();
		String[] str1 = { "홍길동", "이순신", "유관순"};
		String var1 = "김유신";
		
		st.setArr(str1);
		st.setVar(var1);
		
		st.prn();
		System.out.println();
		
		// IntegerType 클래스 객체 생성
		IntegerType it = new IntegerType();
		Integer[] iarr = { 100, 200, 300 };
		Integer ivar = 247;
		
		it.setArr(iarr);
		it.setVar(ivar);
		
		it.prn();
		System.out.println();
		
		
	}

}
