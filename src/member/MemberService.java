package member;

public class MemberService {
	MemberDAO dao = MemberDAO.getInstance();

	// 싱글톤으로 변경
	private static MemberService instance = new MemberService();

	private MemberService() {
	}

	public static MemberService getInstance() {
		return instance;
	}

	// 회원가입
	public int join(MemberVO vo) throws Exception {
		return dao.join(vo);
	}
}
