package Model;

import java.sql.*;
import java.util.ArrayList;

import DBUtil.DBUtil;
import Entity.*;

public class InformationDAO {
	public ArrayList<InformationEntity> getAllInformation() {
		
		ArrayList<InformationEntity> list = new ArrayList<InformationEntity>();
		
		String sql = "select info_id, info_title, " +
					 " info_contents, info_date, hairshop_id," +
					 " mb.member_name from information info, " +
					 " members mb where info.member_id = mb.member_id " +
				     " and info.hairshop_id= ?";

		InformationEntity Information = null;
		MemberEntity member= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		Connection con = DBUtil.getConnection();

		try {
			pstmt = con.prepareStatement(sql);
			rs= pstmt.executeQuery();
			while(rs.next()){
				Information = new InformationEntity();
				Information.setInfo_id(rs.getInt("info_id"));
				Information.setInfo_title(rs.getString("info_title"));
				Information.setInfo_contents(rs.getString("info_contents"));
				Information.setInfo_date(rs.getString("info_date"));	
				
				member.setMember_id(rs.getString("member_id"));	
				Information.setMember_id(member);

				list.add(Information);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(con,pstmt,rs);
		}
		return list;
	}	
}
