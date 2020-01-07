package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex03_MemberDTOmain {

	public static void main(String[] args) {
		
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("회원 수를 입력하세요.");
		int count = sc.nextInt();
		MemberDTO dto;
		
		// 키보드로 회원 수 만큼의 회원 정보를 입력받아서 List에 저장
		for(int i = 0; i < count; i++) {
			
			dto = new MemberDTO();
			System.out.print((i+1) + "번째 아이디 입력 >>> ");
			dto.setId(sc.next());
			System.out.print("패스워드 입력 >>> ");
			dto.setPwd(sc.next());
			System.out.print("이름 입력 >>> ");
			dto.setName(sc.next());
			System.out.print("나이 입력 >>> ");
			dto.setAge(sc.nextInt());
			System.out.print("주소 입력 >>> ");
			dto.setAddress(sc.next());
			
			list.add(dto);
			System.out.println("::::::::::::::::::::::::::::");
			
		}
		System.out.println();
		
		System.out.println("아이디\t비밀번호\t이름\t나이\t주소");
		
		//list에 있는 데이터를 화면에 출력
		for(int i = 0; i < list.size(); i++) {
			dto = new MemberDTO();
			dto = list.get(i);
			System.out.println(
					dto.getId() + "\t" + dto.getPwd() + "\t" +
					dto.getName() + "\t" + dto.getAge() +"\t" +
							dto.getAddress());
			
		}
		
		sc.close();
		
	}//main

}//class
