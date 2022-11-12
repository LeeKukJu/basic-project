
import java.sql.SQLException;

import cafe.JdbcTemplate;
import cafe.OracleDataSource;
import home.HomeView;

public class SubwayApplication { // 실행 클래스??
	public static void main(String[] args) throws Exception {
		HomeView homeView = new HomeView();
		homeView.init();

	}

	// 템플릿
	public static JdbcTemplate getTemplate() {
		try {
			OracleDataSource dataSource;
			dataSource = new OracleDataSource();
			dataSource.setURL("jdbc:oracle:thin:@localhost:1521:xe");
			dataSource.setUser("test");
			dataSource.setPassword("java");
			template.setDataSource(dataSource);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return template;
	}
}
