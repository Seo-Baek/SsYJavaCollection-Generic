package practise;

import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ProductSearchData {
	private HashMap<String, String> proTable;
	
	public ProductSearchData() {
		proTable.put("냉장고","지펠 냉장고 최신형");
		proTable.put("세탁기","드럼 세탁기 최신형");
		proTable.put("TV","HDTV 150인치 최신형");
	}

	
	public ProductSearchData(int num, Scanner sc, JOptionPane j) {
		
		for(int i = 0; i < num; i++) {
				
			System.out.print("상품명과 상품 정보를 입력하세요. ");
			setProTable(sc.next(),sc.next());	
				
		}
	}
		
	

	public HashMap<String,String> getProTable() {
		return proTable;
	}
	public void setProTable(String product, String info) {
		proTable = new HashMap<String,String>();
		proTable.put(product,info);
	}
	
	public String search(String goods) {
		String proInfo = null;
		if(proTable.containsKey(goods)) {
			proInfo = proTable.get(goods);
		}
		return proInfo;
		
	}
}
