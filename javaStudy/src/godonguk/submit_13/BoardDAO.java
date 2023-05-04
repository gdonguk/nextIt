package godonguk.submit_13;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ch14_jdbc_jsp.vo.StudentVO;
import ch14_jdbc_jsp.vo.WordGameVO;

public class BoardDAO {

	private BoardDAO() {
	}

	private static BoardDAO instance = new BoardDAO();

	public static BoardDAO getInstance() {
		return instance;
	}

	// 글 조회
	
	public ArrayList<BoardVO> getBoardList(Connection conn) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("SELECT 						");
		query.append("		  board_num				");
		query.append("		, board_title			");
		query.append("		, board_content			");
		query.append("FROM	 						");
		query.append("		board 					");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		ArrayList<BoardVO> result = new ArrayList<>();
		
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			BoardVO temp = new BoardVO();
			int boardNum = rs.getInt("board_num");
			String boardTitle = rs.getString("board_title");
			String boardContent = rs.getString("board_content");
			
			BoardVO board = new BoardVO(boardNum, boardTitle, boardContent);
			result.add(board);
		}
		ps.close();
		rs.close();
		
		return result;
	}
	
	
	//-----------
	
	// 글 쓰기
	public int boardWrite(Connection conn, String title, String content) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO board (			");
		query.append("		      board_num			");
		query.append("		    , board_title		");
		query.append("   		, board_content	");
		query.append("	) VALUES (					");		
		query.append("  (SELECT COUNT(*)+1 FROM board)		");
		query.append("		    , ?					");
		query.append("		    , ?					");
		query.append("	)							");

		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		int idx = 1;
		ps.setString(idx++, title);
		ps.setString(idx++, content);

		int cnt = ps.executeUpdate();

		ps.close();

		return cnt;
	}
	

	
	
	
}
