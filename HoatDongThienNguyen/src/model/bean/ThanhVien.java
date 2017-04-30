package model.bean;

import java.io.Serializable;


//thanh vien cung la truong doan
public class ThanhVien implements Serializable{
	public String maTV;
	public String hoTen;
	public float diemDanhGiaTrungBinh;
	
	public ThanhVien() {
	}

	public ThanhVien(String maTV, String hoTen, float diemDanhGiaTrungBinh) {
		super();
		this.maTV = maTV;
		this.hoTen = hoTen;
		this.diemDanhGiaTrungBinh = diemDanhGiaTrungBinh;
	}

	public String getMaTV() {
		return maTV;
	}

	public void setMaTV(String maTV) {
		this.maTV = maTV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public float getDiemDanhGiaTrungBinh() {
		return diemDanhGiaTrungBinh;
	}

	public void setDiemDanhGiaTrungBinh(float diemDanhGiaTrungBinh) {
		this.diemDanhGiaTrungBinh = diemDanhGiaTrungBinh;
	}
	
	
	

}
