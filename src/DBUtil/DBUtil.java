package DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	final static String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	final static String DB_URL = "jdbc:oracle:thin:@192.168.137.2:1521:orcl";
	final private static String DB_USER_ID = "ITA10_TEAM_2";
	final private static String DB_PASSWORD = "1234";

	static{
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(DB_URL,DB_USER_ID,DB_PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	public static void close(Connection conn, Statement stmt){
		try {
			if(conn!=null)conn.close();
			if(stmt!=null)stmt.close();		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	public static void close(Connection conn, Statement stmt,ResultSet rs){
		try {
			if(conn!=null)conn.close();
			if(stmt!=null)stmt.close();		
			if(rs!=null)rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
}
