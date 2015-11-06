package Model;


import java.sql.*;
import java.util.ArrayList;

import DBUtil.DBUtil;
import Entity.*;

public class DesignerDao {
	public DesignerEntity getDsigner(int DesignerId) {
		DesignerEntity designer = null;
		String sql = "select d.hd_id, d.hd_name,d.hd_nickname, d.hd_jikwi, d.hd_career, d.hd_img, d.hd_count,d.date_month,h.hairshop_id, h.hairshop_name" +
		" from designer d, hairshop h " +
		"where d.hairshop_id = h.hairshop_id "+
		"and hd_id = ? ";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			con = DBUtil.getConnection();
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, DesignerId);
			rs = stmt.executeQuery();
			
			if(rs.next()) {
				designer = new DesignerEntity();
				HairShopEntity hairShop = new HairShopEntity();
				
				designer.setId(rs.getInt("hd_id"));
				designer.setName(rs.getString("hd_name"));
				designer.setJikwi(rs.getString("hd_jikwi"));
				designer.setNickname(rs.getString("hd_nickname"));
				designer.setCareer(rs.getString("hd_career"));
				designer.setImg(rs.getString("hd_img"));
				designer.setCount(rs.getInt("hd_count"));
				designer.setDate(rs.getString("date_month"));
				
				hairShop.setHairShop_id(rs.getString("hairshop_id"));
				hairShop.setName(rs.getString("hairshop_name"));
				
				
				designer.setHairshop(hairShop);
			}
		} catch (SQLException e) {
			System.out.println("[DesignerDAO.getDesigner]" + e.getMessage());
		} finally {
			DBUtil.close(con, stmt, rs);
		}
		
		return designer;
	}
	
	public ArrayList<DesignerEntity> getMemberList(){
		String sql = "select d.hd_id, d.hd_name,d.hd_nickname, d.hd_jikwi, d.hd_career, d.hd_img, d.hd_count, d.date_month,h.hairshop_id, h.hairshop_name" +
		" from designer d, hairshop h " +
		"where d.hairshop_id = h.hairshop_id ";
		
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ArrayList<DesignerEntity> list = new ArrayList<DesignerEntity>();
		
		try {
			con = DBUtil.getConnection();
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				HairShopEntity hairShop = new HairShopEntity();
				hairShop.setHairShop_id(rs.getString("hairshop_id"));
				hairShop.setName(rs.getString("hairshop_name"));
				
				DesignerEntity designer = new DesignerEntity();
				
				designer.setId(rs.getInt("hd_id"));
				designer.setName(rs.getString("hd_name"));
				designer.setJikwi(rs.getString("hd_jikwi"));
				designer.setNickname(rs.getString("hd_nickname"));
				designer.setCareer(rs.getString("hd_career"));
				designer.setImg(rs.getString("hd_img"));
				designer.setCount(rs.getInt("hd_count"));
				designer.setDate(rs.getString("date_month"));
				designer.setHairshop(hairShop);
				
				list.add(designer);
			}
		} catch (SQLException e) {
			System.out.println("[DesignerDAO.getDesigner]" + e.getMessage());
		} finally {
			DBUtil.close(con, stmt, rs);
		}
		
		return list;
		
	}
	
	public int addDesigner(DesignerEntity designer){
		int affectedRow = 0;
		String sql = "insert into designer(hd_id, hd_name, hd_nickname, hd_jikwi, hd_career, hd_img, hd_count, date_month, hairshop_id) " +
		"values(?,?,?,?,?,?,?,?,?)";
		Connection con = null;
		PreparedStatement stmt = null;
		
		try {
			con = DBUtil.getConnection();
			stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, designer.getId());
			stmt.setString(2, designer.getName());
			stmt.setString(3, designer.getNickname());
			stmt.setString(4, designer.getJikwi());
			stmt.setString(5, designer.getCareer());
			stmt.setString(6, designer.getImg());
			stmt.setInt(7, designer.getCount());
			stmt.setString(8, designer.getDate());
			stmt.setString(9, designer.getHairshop().getHairShop_id());//이해하기
			
			affectedRow = stmt.executeUpdate();			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(con, stmt);
		}
		
		return affectedRow;
		
	}
	
	public int updateDesigner(DesignerEntity designer){
		String sql ="update designer set hd_id = ?, hd_name=?, hd_nickname=?, hd_jikwi=?, hd_career=?, hd_img=?, hd_count=?, hairshop_id=? " +
				"where hd_id = ?";
		int affectedRow = 0;
		
		Connection con = null;
		PreparedStatement stmt = null;
		
		try {
			con = DBUtil.getConnection();
			stmt = con.prepareStatement(sql);
			
			stmt.setString(1, designer.getName());
			stmt.setString(2, designer.getNickname());
			stmt.setString(3, designer.getJikwi());
			stmt.setString(4, designer.getCareer());
			stmt.setString(5, designer.getImg());
			stmt.setInt(6, designer.getCount());
			stmt.setString(7, designer.getDate());
			stmt.setString(8, designer.getHairshop().getHairShop_id());
			stmt.setInt(9, designer.getId());
			
			affectedRow = stmt.executeUpdate();			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(con, stmt);
		}
		
		return affectedRow;
		
	}
	public int deleteDesigner(int designerId){
		int affectedRow = 0;		
		PreparedStatement pstmt = null;
		String sql = "delete from designer where hd_id = ?";
		Connection con = DBUtil.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, designerId);
			affectedRow = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(con, pstmt);
		}
		return affectedRow;
		
	}
}
