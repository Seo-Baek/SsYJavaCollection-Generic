package Generic;

public class StringType {

	String[] str;
	String var;
	
	public void setArr(String[] str) {
		this.str = str;
	}
	public void setVar(String var) {
		this.var = var;
	}
	public void prn() {
		for(String s : str) {
			System.out.println("str 요소 ==> " + s);
		}
		
		System.out.println("var ==> " + var);
	}
	
}
