package Model;

import java.sql.*;
import java.util.ArrayList;

import DBUtil.DBUtil;
import Entity.*;

public class HairShopDAO {

	public HairShopEntity getHairShop(int hairShop_id){
		String sql = "select hairshop_id, hairshop_name, " +
		" hairshop_addr, hairshop_phone, hairshop_email, " +
		" hairshop_web, hairshop_count, open, " +
		" close, hairshop_img, hairshop_des, " +
		" hairshop_status, area_id from hairshop where hairshop_id= 1 ";

		HairShopEntity HairShop = null;
		AreaEntity Area= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		Connection con = DBUtil.getConnection();

		try {
			pstmt = con.prepareStatement(sql);
		//	pstmt.setInt(1, hairShop_id);
			rs= pstmt.executeQuery();

			if(rs.next()){
				HairShop = new HairShopEntity();
				HairShop.setHairShop_id(rs.getString("hairShop_id"));
				HairShop.setName(rs.getString("hairshop_name"));
				HairShop.setAddr(rs.getString("hairshop_addr"));
				HairShop.setPhone(rs.getString("hairshop_phone"));
				HairShop.setEmail(rs.getString("hairshop_email"));
				HairShop.setWeb(rs.getString("hairshop_web"));
				HairShop.setCount(rs.getInt("hairshop_count"));
				HairShop.setOpen(rs.getString("open"));
				HairShop.setClose(rs.getString("close"));
				HairShop.setImg(rs.getString("hairshop_img"));
				HairShop.setDes(rs.getString("hairshop_des"));
				HairShop.setStatus(rs.getString("hairshop_status"));

				Area = new AreaEntity();
				Area.setArea_id(rs.getString("area_id"));
				HairShop.setArea_id(Area);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(con,pstmt,rs);
		}
		return HairShop;
	}




	public ArrayList<HairShopEntity> getAllHairShop() {
		ArrayList<HairShopEntity> list = new ArrayList<HairShopEntity>();
		String sql = "select hairshop_id, hairshop_name, " +
		" hairshop_addr, hairshop_phone, hairshop_email, " +
		" hairshop_web, hairshop_count, open, " +
		" close, hairshop_img, hairshop_des, " +
		" hairshop_status, area_id from hairshop ";

		HairShopEntity HairShop = null;
		AreaEntity Area= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		Connection con = DBUtil.getConnection();

		try {
			pstmt = con.prepareStatement(sql);
			rs= pstmt.executeQuery();

			while(rs.next()){
				HairShop = new HairShopEntity();
				HairShop.setHairShop_id(rs.getString("hairShop_id"));
				HairShop.setName(rs.getString("hairshop_name"));
				HairShop.setAddr(rs.getString("hairshop_addr"));
				HairShop.setPhone(rs.getString("hairshop_phone"));
				HairShop.setEmail(rs.getString("hairshop_email"));
				HairShop.setWeb(rs.getString("hairshop_web"));
				HairShop.setCount(rs.getInt("hairshop_count"));
				HairShop.setOpen(rs.getString("open"));
				HairShop.setClose(rs.getString("close"));
				HairShop.setImg(rs.getString("hairshop_img"));
				HairShop.setDes(rs.getString("hairshop_des"));
				HairShop.setStatus(rs.getString("hairshop_status"));

				Area = new AreaEntity();
				Area.setArea_id(rs.getString("area_id"));
				HairShop.setArea_id(Area);
				list.add(HairShop);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(con,pstmt,rs);
		}

		return list;
	}
}
