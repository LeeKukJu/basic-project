package home;

import java.util.Scanner;

public class HomeView {
	public void init() throws Exception {
		SubwayController controller = new SubwayController();
		
		
		menu : while (true) { 
			//alt+shift+z
			System.out.println("--------------------------");
			System.out.println("1.로그인|2.회원가입|3.종료");
			System.out.println("--------------------------");
			System.out.print("선택>");
			Scanner scanner = new Scanner(System.in);
			int menu = Integer.parseInt(scanner.nextLine());
			switch (menu) {
			case 1:
				
				break;
			case 2:
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
				break;
			case 3:
				break menu;
			}
		}
	}
}
