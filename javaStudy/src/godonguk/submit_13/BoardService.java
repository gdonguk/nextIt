package godonguk.submit_13;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import ch14_jdbc_jsp.context.ConnectionPool;
import ch14_jdbc_jsp.dao.StudentDAO;
import ch14_jdbc_jsp.vo.StudentVO;

public class BoardService {
	
	private BoardService() {}
	
	private static BoardService instance = new BoardService();
	
	public static BoardService getInstance () {
		return instance;
	}
	
	private BoardDAO dao = BoardDAO.getInstance();
	private ConnectionPool cp = ConnectionPool.getInstance();
	
	
	// 글조회
	public ArrayList<BoardVO> getBoardList(){
		Connection conn = cp.getConnection();
		ArrayList<BoardVO> result = new ArrayList<>();
		try {
			result = dao.getBoardList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			cp.releaseConnection(conn);
		}
		return result;
		
	}
	
	
	// 글 쓰기
	
	public void boardWrite(int num, String title, String content) {
		Connection conn = cp.getConnection();
		try {
			dao.boardWrite(conn,num, title, content);
			System.out.println(num +title + content);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			cp.releaseConnection(conn);
		}
		
		
	}



	
	

}
