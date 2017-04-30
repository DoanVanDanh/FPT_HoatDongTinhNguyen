package model.bean;

public class HoatDong {
	private String maHD;
	private String tenHD;
	private String moTaHD;
	private String ngayGioBD;
	private String ngayGioKT;
	private int soLuongToiThieuYC;
	private int soLuongToiDaYC;
	private String thoiHanDK;
	private String trangThai;
	private String maTV;
	private String lyDoHuyHD;
	
	public HoatDong() {
	}

	public HoatDong(String maHD, String tenHD,String moTaHD, String ngayGioBD, String ngayGioKT, int soLuongToiThieuYC,
			int soLuongToiDaYC, String thoiHanDK, String trangThai, String maTV, String lyDoHuyHD) {
		this.maHD = maHD;
		this.tenHD = tenHD;
		this.moTaHD = moTaHD;
		this.ngayGioBD = ngayGioBD;
		this.ngayGioKT = ngayGioKT;
		this.soLuongToiThieuYC = soLuongToiThieuYC;
		this.soLuongToiDaYC = soLuongToiDaYC;
		this.thoiHanDK = thoiHanDK;
		this.trangThai = trangThai;
		this.maTV = maTV;
		this.lyDoHuyHD = lyDoHuyHD;
	}

	public String getMaHD() {
		return maHD;
	}

	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}

	public String getTenHD() {
		return tenHD;
	}

	public void setTenHD(String tenHD) {
		this.tenHD = tenHD;
	}
	
	
	public String getMoTaHD() {
		return moTaHD;
	}

	public void setMoTaHD(String moTaHD) {
		this.moTaHD = moTaHD;
	}

	public String getNgayGioBD() {
		return ngayGioBD;
	}

	public void setNgayGioBD(String ngayGioBD) {
		this.ngayGioBD = ngayGioBD;
	}

	public String getNgayGioKT() {
		return ngayGioKT;
	}

	public void setNgayGioKT(String ngayGioKT) {
		this.ngayGioKT = ngayGioKT;
	}

	public int getSoLuongToiThieuYC() {
		return soLuongToiThieuYC;
	}

	public void setSoLuongToiThieuYC(int soLuongToiThieuYC) {
		this.soLuongToiThieuYC = soLuongToiThieuYC;
	}

	public int getSoLuongToiDaYC() {
		return soLuongToiDaYC;
	}

	public void setSoLuongToiDaYC(int soLuongToiDaYC) {
		this.soLuongToiDaYC = soLuongToiDaYC;
	}

	public String getThoiHanDK() {
		return thoiHanDK;
	}

	public void setThoiHanDK(String thoiHanDK) {
		this.thoiHanDK = thoiHanDK;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	public String getMaTV() {
		return maTV;
	}

	public void setMaTV(String maTV) {
		this.maTV = maTV;
	}

	public String getLyDoHuyHD() {
		return lyDoHuyHD;
	}

	public void setLyDoHuyHD(String lyDoHuyHD) {
		this.lyDoHuyHD = lyDoHuyHD;
	}
	
	
	
	
}
