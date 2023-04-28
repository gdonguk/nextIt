package godonguk.submit_13;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import ch14_jdbc_jsp.context.ConnectionPool;
import ch14_jdbc_jsp.vo.StudentVO;

public class HomePageService {
	
	private HomePageService() {}
	
	private static HomePageService instance = new HomePageService();
	
	public static HomePageService getInstance() {
		return instance;
	}
	private HomePageDAO dao = HomePageDAO.getInstance();
	private ConnectionPool cp = ConnectionPool.getInstance();

	// 조회
	public ArrayList<HomePageVO> getEmList(){
		Connection conn = cp.getConnection();
		ArrayList<HomePageVO> result = new ArrayList<>();
		try {
			result = dao.getEmList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			cp.releaseConnection(conn);
		}
		return result;
	}
	
	// 회원가입
	
	public void registEmployees (String id, String pw) {
		Connection conn = cp.getConnection();
		try {
			dao.registEmployees(conn, id, pw);
			System.out.println("회원가입에 성공하셨습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cp.releaseConnection(conn);
		}
		
	}
	// 로그인
	public HomePageVO login(HomePageVO employees) {
		Connection conn = cp.getConnection();
		HomePageVO result = new HomePageVO();
		try {
			result = dao.login(conn, employees);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			cp.releaseConnection(conn);
		}
		return result;
	}
	
	
	
	
	
	
	
	
}
