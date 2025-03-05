package com.springmvc.beans;

public class BAV_NhanVien {
	private int id;
    private String bav_name;
    private String bav_hinhanh;
    private int bav_tuoi;
    private String bav_diachi;
    private String bav_email;
    private int bav_soluong;
    
	/**
	 * @param id
	 * @param bav_name
	 * @param bav_hinhanh
	 * @param bav_tuoi
	 * @param bav_diachi
	 * @param bav_email
	 * @param bav_soluong
	 */
	public BAV_NhanVien(int id, String bav_name, String bav_hinhanh, int bav_tuoi, String bav_diachi, String bav_email,
			int bav_soluong) {
		super();
		this.id = id;
		this.bav_name = bav_name;
		this.bav_hinhanh = bav_hinhanh;
		this.bav_tuoi = bav_tuoi;
		this.bav_diachi = bav_diachi;
		this.bav_email = bav_email;
		this.bav_soluong = bav_soluong;
	}
	
	/**
	 * 
	 */
	public BAV_NhanVien() {
		super();
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the bav_name
	 */
	public String getBav_name() {
		return bav_name;
	}
	/**
	 * @param bav_name the bav_name to set
	 */
	public void setBav_name(String bav_name) {
		this.bav_name = bav_name;
	}
	/**
	 * @return the bav_hinhanh
	 */
	public String getBav_hinhanh() {
		return bav_hinhanh;
	}
	/**
	 * @param bav_hinhanh the bav_hinhanh to set
	 */
	public void setBav_hinhanh(String bav_hinhanh) {
		this.bav_hinhanh = bav_hinhanh;
	}
	/**
	 * @return the bav_tuoi
	 */
	public int getBav_tuoi() {
		return bav_tuoi;
	}
	/**
	 * @param bav_tuoi the bav_tuoi to set
	 */
	public void setBav_tuoi(int bav_tuoi) {
		this.bav_tuoi = bav_tuoi;
	}
	/**
	 * @return the bav_diachi
	 */
	public String getBav_diachi() {
		return bav_diachi;
	}
	/**
	 * @param bav_diachi the bav_diachi to set
	 */
	public void setBav_diachi(String bav_diachi) {
		this.bav_diachi = bav_diachi;
	}
	/**
	 * @return the bav_email
	 */
	public String getBav_email() {
		return bav_email;
	}
	/**
	 * @param bav_email the bav_email to set
	 */
	public void setBav_email(String bav_email) {
		this.bav_email = bav_email;
	}
	/**
	 * @return the bav_soluong
	 */
	public int getBav_soluong() {
		return bav_soluong;
	}
	/**
	 * @param bav_soluong the bav_soluong to set
	 */
	public void setBav_soluong(int bav_soluong) {
		this.bav_soluong = bav_soluong;
	}
    
}
