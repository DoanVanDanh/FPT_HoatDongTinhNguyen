package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.HoatDong;
import model.bean.ThanhVien;

public class ThanhVienDAO {
	
	private static String jdbcURL = "jdbc:sqlserver://localhost:1433;databaseName=HoatDongThienNguyen";
	private static String jdbcUsername="sa";
	private static String jdbcPassword="1111";
	
	private static Connection connection = null;
	
	
	public ThanhVienDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
		this.jdbcURL = jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
		
	}


	private static void connect() throws SQLException {
		if (connection == null || connection.isClosed()) {
			try {
				
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				connection =DriverManager.getConnection(jdbcURL+";user="+jdbcUsername+";password="+jdbcPassword);		
			} catch (ClassNotFoundException e) {
				System.out.println("loi ket noi"+e.getMessage());
			}
		}
	}
	
	private static void disConnect() throws SQLException{
		if (connection != null && !connection.isClosed()) {
			connection.close();
		}
	}
	
	public static ArrayList<ThanhVien> getDanhGiaTruongDoan(){
		ArrayList<ThanhVien> list =new ArrayList<>();
		try {
			connect();
			String sql ="select hd.MaTV,tv.MaTV,tv.HoTen,avg(tg.DiemTruongDoan) "+
						"from HOATDONG hd join THAMGIA tg "+
						"on hd.MaHD = tg.MaHD "+
						"join THANHVIEN tv on tv.MaTV = tg.MaTV "+
						"group by hd.matv,tv.HoTen,tv.MaTV";
			
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				//coi so sánh câu select~~
				String a = rs.getString(1);
				String b = rs.getString(3);
				float c = (float)rs.getInt(4);
				ThanhVien thanhVien = new ThanhVien(a, b, c);
				
				list.add(thanhVien);
			}
			disConnect();
			ps.close();			
		} catch (Exception e) {
			System.out.println("loi lay danh sach danh gia truong doan"+e.getMessage());
		}
		
		return list;
	}
	public static void main(String[] args) {
		System.out.println(getDanhGiaTruongDoan().get(0).getHoTen());
	}
}
