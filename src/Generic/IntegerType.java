package Generic;

public class IntegerType {

	Integer[] str;
	Integer var;
	
	public void setArr(Integer[] str) {
		this.str = str;
	}
	public void setVar(Integer var) {
		this.var = var;
	}
	public void prn() {
		for(Integer s : str) {
			System.out.println("str 요소 ==> " + s);
		}
		
		System.out.println("var ==> " + var);
	}
	
}