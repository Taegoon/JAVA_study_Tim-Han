package Model;

import java.sql.*;
import java.util.ArrayList;

import DBUtil.DBUtil;
import Entity.*;

public class HairStyleDAO {

	public HairStyleEntity getHairStyle(String hs_code){
		String sql = "select  hs_code, hs_name, reserve_time, " +
		" hs_price from hairstyle where hs_code = ?";

		HairStyleEntity HairStyle = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		Connection con = DBUtil.getConnection();

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, hs_code);
			rs= pstmt.executeQuery();
			if(rs.next()){
				HairStyle = new HairStyleEntity();
				HairStyle.setHs_code(rs.getString("hs_code"));
				HairStyle.setHs_name(rs.getString("hs_name"));
				HairStyle.setHs_price(rs.getString("hs_price"));
				HairStyle.setReserve_time(rs.getInt("reserve_time"));	

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(con,pstmt,rs);
		}
		return HairStyle;
	}



	public ArrayList<HairStyleEntity> getAllHairStyle() {
		ArrayList<HairStyleEntity> list = new ArrayList<HairStyleEntity>();
		String sql = "select  hs_code, hs_name, reserve_time, " +
		" hs_price from hairstyle where hs_code = ?";

		HairStyleEntity HairStyle = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		Connection con = DBUtil.getConnection();

		try {
			pstmt = con.prepareStatement(sql);
			rs= pstmt.executeQuery();
			while(rs.next()){
				HairStyle = new HairStyleEntity();
				HairStyle.setHs_code(rs.getString("hs_code"));
				HairStyle.setHs_name(rs.getString("hs_name"));
				HairStyle.setHs_price(rs.getString("hs_price"));
				HairStyle.setReserve_time(rs.getInt("reserve_time"));	

				list.add(HairStyle);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(con,pstmt,rs);
		}
		return list;
	}


	public int insertHairStyle(HairStyleEntity HairStyle) {

		int affected = 0;
		String sql = "insert into hairstyle(hs_code, hs_name, " +
				" reserve_time ,hs_price) " +
				" values(?,?,?,?)";

		PreparedStatement pstmt = null;
		Connection con = DBUtil.getConnection();

		try {

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, HairStyle.getHs_code());
			pstmt.setString(2, HairStyle.getHs_name());
			pstmt.setInt(3, HairStyle.getReserve_time());
			pstmt.setString(4, HairStyle.getHs_price());

			affected = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(con,pstmt);
		}
		return affected;
	}
	
	public int updateEmp(HairStyleEntity HairStyle) {
		int affected = 0;
		String sql = "update hairstyle set hs_name = ?, reserve_time = ?, hs_price = ? " + 
		" where hs_code = ?" ;
		
		PreparedStatement pstmt = null;
		Connection con = DBUtil.getConnection();

		try {
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, HairStyle.getHs_name());
			pstmt.setInt(2, HairStyle.getReserve_time());
			pstmt.setString(3, HairStyle.getHs_price());
			
			affected = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(con,pstmt);
		}
		return affected;
	}

}
