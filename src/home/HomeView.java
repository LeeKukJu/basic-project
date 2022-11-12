package home;

import java.util.Scanner;

import member.MemberController;
import member.MemberVO;

public class HomeView {
	// 싱글톤 객체 생성
	private static HomeView instance = new HomeView(); // instance = 객체

	private HomeView() {
	}

	public static HomeView getInstance() {
		return instance;
	}

	Scanner scanner = new Scanner(System.in);

	public int init() {

//		MemberController membercontroller = MemberController.getInstance();
		System.out.println(
				"▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ 서브웨이에 오신것을 환영합니다. ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println("--------------------------");
		System.out.println("1.로그인|2.회원가입|3.종료");
		System.out.println("--------------------------");
		System.out.print("선택>");
		int menu = scanner.nextInt();
		
		switch (menu) {
		case 1:
			System.out.print("ID: ");
			String loginId = scanner.nextLine();

			System.out.print("PASSWROD: ");
			String loginPassword = scanner.nextLine();

			break;
		case 2:
			System.out.println("사용하실 아이디를 입력해주세요.");
			System.out.print("ID: ");
			String joinId = scanner.nextLine();

			System.out.println("사용하실 비밀번호를 입력해주세요.");
			System.out.print("PASSWROD: ");
			String joinPassword = scanner.nextLine();

			System.out.println("이름을 입력해주세요.");
			System.out.print("NAME: ");
			String joinName = scanner.nextLine();

			System.out.println("전화번호를 입력해주세요.");
			System.out.print("PHONE NUMBER: ");
			String joinPhone = scanner.nextLine();
			int insertMember = membercontroller.insertMember(new MemberVO(joinId, joinPassword, joinName, joinPhone));

			if (insertMember > 0) {
				System.out.println("회원가입 완료!");
			} else {
				System.out.println("회원가입 실패!");
			}

			break;
		case 3:
			break menu;
		}
	}
}
