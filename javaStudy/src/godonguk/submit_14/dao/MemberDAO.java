package godonguk.submit_14.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import godonguk.submit_13.HomePageVO;
import godonguk.submit_14.vo.MemberVO;

public class MemberDAO {

	private MemberDAO() {
	}

	private static MemberDAO instance = new MemberDAO();

	public static MemberDAO getInstance() {
		return instance;
	}

	public ArrayList<MemberVO> getMemberList(Connection conn) throws SQLException {
		// 조회
		StringBuffer query = new StringBuffer();
		query.append("SELECT					");
		query.append("		  member_nickname	");
		query.append("		, member_id			");
		query.append("		, member_password	");
		query.append("FROM						");
		query.append("		  member 			");

		PreparedStatement ps = conn.prepareStatement(query.toString());

		ResultSet rs = ps.executeQuery();

		ArrayList<MemberVO> result = new ArrayList<>();
		while (rs.next()) {
			String memberNickname = rs.getString("member_nickname");
			String memberId = rs.getString("member_id");
			String memberPassword = rs.getString("member_password");

			MemberVO member = new MemberVO(memberNickname, memberId, memberPassword);

			result.add(member);
		}
		ps.close();
		rs.close();

		return result;

	}

	// 회원가입

	// 회원가입
	public int registMember(Connection conn,String nickName, String id, String pw) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO member (		");
		query.append("		      member_nickname			");
		query.append("		    , member_id		");
		query.append("		    , member_password		");
		query.append("	) VALUES (					");
		query.append("		      ?					");
		query.append("		    , ?					");
		query.append("		    , ?					");
		query.append("	)							");

		PreparedStatement ps = conn.prepareStatement(query.toString());

		int idx = 1;
		ps.setString(idx++, nickName);
		ps.setString(idx++, id);
		ps.setString(idx++, pw);

		int cnt = ps.executeUpdate();

		ps.close();

		return cnt;
	}

	// 로그인
	public MemberVO login(Connection conn, MemberVO member) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("SELECT					");
		query.append("		member_id				");
		query.append("	  , member_password		");
		query.append("FROM						");
		query.append("	    member			");
		query.append("WHERE 1=1					");
		query.append("	AND member_id = ?			");
		query.append("	AND member_password = ?	");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());

		int idx = 1;
		ps.setString(idx++, member.getId());
		ps.setString(idx++, member.getPassword());
		
		ResultSet rs = ps.executeQuery();
		
		MemberVO result = new MemberVO();
		
		while (rs.next()) {
			result.setId(rs.getString("member_id"));
			result.setPassword(rs.getString("member_password"));
		}
			
		rs.close();
		ps.close();
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
