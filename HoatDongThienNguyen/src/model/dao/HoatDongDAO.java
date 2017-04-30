package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.HoatDong;

public class HoatDongDAO {
	private static String jdbcURL = "jdbc:sqlserver://localhost:1433;databaseName=HoatDongThienNguyen";
	private static String jdbcUsername="sa";
	private static String jdbcPassword="1111";
	
	private static Connection connection;
	
	
	public HoatDongDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
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
	
	public static boolean insertHoatDong(HoatDong hoatDong){
		boolean isSucess=false;
		try {
			String sql = "insert into HoatDong(MaHD,TenHD,MoTaHD,NgayGioBD,NgayGioKT,SLToiThieuYC,SLToiDaYC,ThoiHanDK,TrangThai,MaTV,LyDoHuyHD) "+
							"values (?,?,?,?,?,?,?,?,?,?,'')";
			connect();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, hoatDong.getMaHD());
			ps.setString(2, hoatDong.getTenHD());
			ps.setString(3, hoatDong.getMoTaHD());
			ps.setString(4, hoatDong.getNgayGioBD());
			ps.setString(5, hoatDong.getNgayGioKT());
			ps.setInt(6, hoatDong.getSoLuongToiThieuYC());
			ps.setInt(7, hoatDong.getSoLuongToiDaYC());
			ps.setString(8, hoatDong.getThoiHanDK());
			ps.setString(9, hoatDong.getTrangThai());
			ps.setString(10, hoatDong.getMaTV());
			
			isSucess = ps.executeUpdate() > 0;
			disConnect();
			ps.close();
		} catch (Exception e) {
			System.out.println("lỗi insert Hoat Dong"+e.getMessage());
			return false;
		}
		return isSucess;
	}
	
	public static ArrayList<HoatDong> getListHoatDong(){
		ArrayList<HoatDong> list =new ArrayList<>();
		try {
			connect();
			String sql ="select MaHD,TenHD,MoTaHD,NgayGioBD,NgayGioKT,SLToiThieuYC,SLToiDaYC,ThoiHanDK,TrangThai,MaTV,LyDoHuyHD "+
						"from HOATDONG";
			
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				//coi so sánh câu select~~
				String a = rs.getString(1);
				String b = rs.getString(2);
				String c = rs.getString(3);
				String d = rs.getString(4);
				String e = rs.getString(5);
				int f = rs.getInt(6);
				int g = rs.getInt(7);
				String h = rs.getString(8);
				String i = rs.getString(9);
				String j = rs.getString(10);
				String k = rs.getString(11);
				
				HoatDong hd = new HoatDong(a, b, c, d, e, f, g, h, i, j,k);
				list.add(hd);
				
			}
			disConnect();
			ps.close();			
		} catch (Exception e) {
			System.out.println("loi lay danh sach hoat dong"+e.getMessage());
		}
		
		return list;
	}
	
	public static HoatDong getHoatDong(String maHD){
		HoatDong hd = null;
		try {
			connect();
			String sql ="select MaHD,TenHD,MoTaHD,NgayGioBD,NgayGioKT,SLToiThieuYC,SLToiDaYC,ThoiHanDK,TrangThai,MaTV,LyDoHuyHD "+
						"from HOATDONG "+
						"where maHD =? ";
						
			
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, maHD);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				//coi so sánh câu select~~
				String a = rs.getString(1);
				String b = rs.getString(2);
				String c = rs.getString(3);
				String d = rs.getString(4);
				String e = rs.getString(5);
				int f = rs.getInt(6);
				int g = rs.getInt(7);
				String h = rs.getString(8);
				String i = rs.getString(9);
				String j = rs.getString(10);
				String k = rs.getString(11);
				
				hd = new HoatDong(a, b, c, d, e, f, g, h, i, j,k);
			}
			disConnect();
			ps.close();			
		} catch (Exception e) {
			System.out.println("loi lay  hoat dong"+e.getMessage());
		}
		
		return hd;
	}
	
	
	public static boolean updateHoatDong(HoatDong hd){
		boolean isSucess = false;
		try {
			String sql = "update HOATDONG "+
						"set TenHD=?,MoTaHD=?,NgayGioBD=?,NgayGioKT=?,SLToiThieuYC=?,SLToiDaYC=?,ThoiHanDK=?,TrangThai=?,MaTV=?,LyDoHuyHD=? "+
						"where MaHD=?";
			connect();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, hd.getTenHD());
			ps.setString(2, hd.getMaHD());
			ps.setString(3, hd.getNgayGioBD());
			ps.setString(4, hd.getNgayGioKT());
			ps.setInt(5, hd.getSoLuongToiThieuYC());
			ps.setInt(6, hd.getSoLuongToiDaYC());
			ps.setString(7, hd.getThoiHanDK());
			ps.setString(8, hd.getTrangThai());
			ps.setString(9, hd.getMaTV());
			ps.setString(10, hd.getLyDoHuyHD());
			ps.setString(11, hd.getMaHD());
			
			
			isSucess = ps.executeUpdate() > 0;
			disConnect();
			ps.close();
		} catch (Exception e) {
			System.out.println("lỗi k cập nhật được"+e.getMessage());
			return false;
		}
		return isSucess;
	}
	
	public static boolean deleteHoatDong(String maHD){
		boolean isSucess = false;
		try {
			String sql="Delete from HoatDong where maHD = ?";
			
			connect();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, maHD);
			
			isSucess = ps.executeUpdate() > 0;
			
			disConnect();
			ps.close();
		} catch (Exception e) {
			System.out.println("lỗi không thể xóa được"+e.getMessage());
		}
		
		return isSucess;
	}
	
	public static void main(String[] args) {
		if(insertHoatDong(new HoatDong("5", "nghi duong", "choi boi", "1-1-2012", "1-2-2012", 1, 2, "1-2-2011", "Đang mời đăng ký", "1","")))
			System.out.println("da them thanh cong");
		else
			System.out.println("chua them duoc");
		
		if(updateHoatDong(new HoatDong("1", "nghi duong", "choi boi", "1-1-2012", "1-3-2012", 1, 2, "1-2-2011", "Đang mời đăng ký", "2","")))
			System.out.println("da cap nhat thanh cong");
		else
			System.out.println("chưa cập nhật được");
		
		
		if(deleteHoatDong("5"))
			System.out.println("da xoa");
		else
			System.out.println("chua xoa");
		
		
		System.out.println(getListHoatDong().get(1).getMaHD());
		System.out.println(getHoatDong("3").getMaTV());
		
	}
}
