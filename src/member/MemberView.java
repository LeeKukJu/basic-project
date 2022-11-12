package member;

import java.util.Scanner;

import common.ScanUtil;
import common.View;

public class MemberView {
	// 싱글톤
	private static MemberView instance = new MemberView();
	private MemberView() {	}
	public static MemberView getInstance() {
		return instance;
	}
	
	public static MemberVO memberVO = MemberVO.getInstance();

	// 스캐너
	private Scanner scanner = ScanUtil.scanner();
	
	// 회원가입
	public int join(MemberController controller) {
		int number;
		scanner.nextLine();
		System.out.println("회원가입을 진행합니다.");
		System.out.print("아이디 (대문자,특수문자,한글 불가능 | 4~8글자까지가능) : ");
		String id = scanner.nextLine();
		System.out.print("비밀번호 (대문자,특수문자 불가능 | 4~8글자까지가능) : ");
		String password = scanner.nextLine();
		System.out.print("이름 (특수문자,숫자 불가능 | 2~12글자까지가능) : ");
		String name = scanner.nextLine();
		System.out.print("전화번호 (하이픈 포함 하여 입력) : ");
		String phone = scanner.nextLine();
		
		number = controller.join(new MemberVO(id, password, name, phone));
		if (number > 0) {
			System.out.println("회원가입이 완료되었습니다. 로그인해주세요.");
			return View.HOME;
		} else {
			System.out.println("회원 가입 실패! 다시 회원가입 하시겠습니까? \n y/n을 입력해주세요 : ");
			String inputFlag = scanner.nextLine();
			if (inputFlag.equalsIgnoreCase("y")) {
				number = View.MEMBERHOME;
			} else {
				number = View.HOME;
			}
		}

		return number;
	}
}
