package godonguk.submit_13;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ch14_jdbc_jsp.vo.StudentVO;

public class HomePageDAO {
	
	private HomePageDAO () {}
	
	private static HomePageDAO instance = new HomePageDAO();
	
	public static HomePageDAO getInstance() {
		return instance;
	}
	
	public ArrayList<HomePageVO> getEmList(Connection conn) throws SQLException{
		// 조회?
		StringBuffer query = new StringBuffer();
		query.append("SELECT						");
		query.append("		employees_id			");
		query.append("	  , employees_password		");
		query.append("FROM							");
		query.append("	    employees				");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		ResultSet rs = ps.executeQuery();
		
		ArrayList<HomePageVO> result = new ArrayList<>();
		while(rs.next()) {
			String emId = rs.getString("employees_id");
			String emPassword = rs.getString("employees_password");
			
			HomePageVO em = new HomePageVO(emId, emPassword);
			
			result.add(em);
		}
		ps.close();
		rs.close();
		
		return result;
		
	}
	
	
	// 회원가입
	public int registEmployees(Connection conn, String id, String pw) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO employees (		");
		query.append("		      employees_id			");
		query.append("		    , employees_password		");
		query.append("	) VALUES (					");
		query.append("		      ?					");
		query.append("		    , ?					");
		query.append("	)							");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());

		int idx = 1;
		ps.setString(idx++, id);
		ps.setString(idx++, pw);

		int cnt = ps.executeUpdate();

		ps.close();

		return cnt;
	}

	
	// 로그인
	// 로그인(SELECT) 메소드
		// 입력받은 아이디와 비밀번호가 일치하는 하나의 데이터 리턴
	public HomePageVO login(Connection conn, HomePageVO employees) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("SELECT					");
		query.append("		employees_id				");
		query.append("	  , employees_password		");
		query.append("FROM						");
		query.append("	    employees			");
		query.append("WHERE 1=1					");
		query.append("	AND employees_id = ?			");
		query.append("	AND employees_password = ?	");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());

		int idx = 1;
		ps.setString(idx++, employees.getEmId());
		ps.setString(idx++, employees.getEmPassword());
		
		ResultSet rs = ps.executeQuery();
		
		HomePageVO result = new HomePageVO();
		
		while (rs.next()) {
			result.setEmId(rs.getString("employees_id"));
			result.setEmPassword(rs.getString("employees_password"));
		}
			
		rs.close();
		ps.close();
		
		return result;
	}
	
	
	
	
	
}
