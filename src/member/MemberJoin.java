package member;

import java.util.Scanner;

public class MemberJoin {
	Scanner scanner = new Scanner(System.in);
	MemberController controller = MemberController.getInstance();
	
	public void joinView() throws Exception{
		System.out.println("사용하실 아이디를 입력해주세요.");
		System.out.print("ID: ");
		String id = scanner.nextLine();
		
		System.out.println("사용하실 비밀번호를 입력해주세요.");
		System.out.print("PASSWROD: ");
		String password = scanner.nextLine();
		
		System.out.println("이름을 입력해주세요.");
		System.out.print("NAME: ");
		String name = scanner.nextLine();
		
		System.out.println("전화번호를 입력해주세요.");
		System.out.print("PHONE NUMBER: ");
		String phone = scanner.nextLine();
		int insertMember = controller.insertMember(new MemberVO(id,password,name,phone));
	    
		if (insertMember > 0) {
			System.out.println("회원가입 완료!");
		} else{
			System.out.println("회원가입 실패!");
		}
	}
}
