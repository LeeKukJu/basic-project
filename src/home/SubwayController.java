package home;

public class SubwayController {
	SubwayService service = SubwayService.getInstance();
	
	public int insertMember(MemberVO vo) throws Exception {
		return service.insertMember(vo);
	}
}
