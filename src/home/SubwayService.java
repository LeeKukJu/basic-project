package home;

public class SubwayService {
	MemberDAO dao = MemberDAO.getInstance();
	
	//싱글톤으로 변경
	private static SubwayService instance = new SubwayService();
	private SubwayService() {
	}
	public static SubwayService getInstance() {
		return instance;
	}
	
	public int insertMember(MemberVO vo) throws Exception {
		return dao.insertMember(vo);
	}
	
}
