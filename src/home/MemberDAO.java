package home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

public class MemberDAO {
	public String url = "jdbc:oracle:thin:@192.168.34.16:1521:xe";
	public String user = "project_team1";
	public String pass = "sand";
	
	//싱글톤
	private static MemberDAO instance = new MemberDAO();
	private MemberDAO() {
	}
	public static MemberDAO getInstance() {
		return instance;
	}
	
	//회원가입한 회원 정보 DB에 전달
	public int insertMember(MemberVO vo) throws Exception {
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection(url, user, pass);
		Statement statement = connection.createStatement();

		StringBuilder builder = new StringBuilder();
		builder.append(" INSERT INTO member (");
		builder.append("     mem_id,");
		builder.append("     mem_password,");
		builder.append("     mem_name,");
		builder.append("     mem_phone");
		builder.append(" ) VALUES (");
		builder.append("     '" + vo.getId() + "',");
		builder.append("     '" + vo.getPassword() + "',");
		builder.append("     '" + vo.getName() + "',");
		builder.append("     '" + vo.getPhone() + "'");
		builder.append(" )");
		String sql = builder.toString();
		int update = statement.executeUpdate(sql);
		statement.close();
		connection.close();
		return update;
	}
}
