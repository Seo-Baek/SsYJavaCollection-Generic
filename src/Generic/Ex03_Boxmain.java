package Generic;

public class Ex03_Boxmain {

	public static void main(String[] args) {
		
		Box box = new Box();
		box.setObj("제네릭");
		String str = (String)box.getObj();	//형변환 필요
		System.out.println(str);
		System.out.println();
		
		Box box1 = new Box();
		box1.setObj(135);
		int num = (int)box1.getObj();	//형변환 필요
		System.out.println(num);
		System.out.println();
		
		// 형변환이 자주 일어나게 되면 프로그램 성능이 저하 됨.
		Box1<String> box2 = new Box1<String>();
		box2.setT("제네릭");
		String str2 = box2.getT();	//형변환이 필요가 없음.
		System.out.println(str2);
		System.out.println();
		
		Box1<Integer> box3 = new Box1<Integer>();
		box3.setT(135);
		int num2 = box3.getT();
		System.out.println(num2);
	}

}
