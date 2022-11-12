package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import common.OracleConnect;
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
	
	//회원가입한 회원 정보 -> DB에 전달
	public int join(MemberVO vo) throws Exception {
		OracleConnect.jdbcDriver();
//		DriverManager.registerDriver(new OracleDriver());
//		Connection connection = DriverManager.getConnection(url, user, pass);
//		Statement statement = connection.createStatement();

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
		int update = OracleConnect.statement.executeUpdate(sql);
		OracleConnect.statement.close();
		OracleConnect.connection.close();
		return update;
	}
	
	// DB -> 회원 정보 하나 전달
	public MemberVO getMember(String id, String password) throws Exception {
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection(url, user, pass);
		Statement statement = connection.createStatement();
		//쿼리 작성 : 아이디와 회
		return null;
	}
	
}
