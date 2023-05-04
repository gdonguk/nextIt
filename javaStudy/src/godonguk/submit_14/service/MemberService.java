package godonguk.submit_14.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import ch14_jdbc_jsp.context.ConnectionPool;
import godonguk.submit_13.HomePageVO;
import godonguk.submit_14.dao.MemberDAO;
import godonguk.submit_14.vo.MemberVO;

public class MemberService {

	private MemberService() {}

	private static MemberService instance = new MemberService();

	public static MemberService getInstance() {
		return instance;
	}
	
	private MemberDAO dao = MemberDAO.getInstance();
	private ConnectionPool cp = ConnectionPool.getInstance();
	
	// 조회
	public ArrayList<MemberVO> getMemberList(){
		Connection conn = cp.getConnection();
		ArrayList<MemberVO> result = new ArrayList<>();
		try {
			result = dao.getMemberList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("여기");
		}finally {
			cp.releaseConnection(conn);
		}
		return result;
	}
	
	// 회원가입
	
		public void registMember (String nickName, String id, String pw) {
			Connection conn = cp.getConnection();
			try {
				dao.registMember(conn, nickName, id, pw);
				System.out.println("회원가입에 성공하셨습니다.");
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				cp.releaseConnection(conn);
			}
			
		}
		
		// 로그
		public MemberVO login(MemberVO member) {
			Connection conn = cp.getConnection();
			MemberVO result = new MemberVO();
			try {
				result = dao.login(conn, member);
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				cp.releaseConnection(conn);
			}
			return result;
		}
	
	
	
	
	
	
}
