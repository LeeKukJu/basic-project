package member;

public class MemberController {
	MemberService service = MemberService.getInstance();

	// 싱글톤으로 변경
	private static MemberController instance = new MemberController();

	private MemberController() {
	}

	public static MemberController getInstance() {
		return instance;
	}

	public int insertMember(MemberVO vo) throws Exception {
		return service.insertMember(vo);
	}
	
	
}
