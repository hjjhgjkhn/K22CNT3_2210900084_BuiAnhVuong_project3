package com.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springmvc.beans.BAV_NhanVien;

@Repository

public class Bav_NhanVienDao {
    @Autowired
    private JdbcTemplate template;


    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    // Thêm nhân viên
    public int save(BAV_NhanVien nv) {
        String sql = "INSERT INTO bav_nhanvien (bav_name, bav_hinhanh, bav_tuoi, bav_diachi, bav_email, bav_soluong) VALUES (?, ?, ?, ?, ?, ?)";
        return template.update(sql, nv.getBav_name(), nv.getBav_hinhanh(), nv.getBav_tuoi(), nv.getBav_diachi(), nv.getBav_email(), nv.getBav_soluong());
    }

    // Cập nhật nhân viên
    public int update(BAV_NhanVien nv) {
        String sql = "UPDATE bav_nhanvien SET bav_name = ?, bav_hinhanh = ?, bav_tuoi = ?, bav_diachi = ?, bav_email = ?, bav_soluong = ? WHERE id = ?";
        return template.update(sql, nv.getBav_name(), nv.getBav_hinhanh(), nv.getBav_tuoi(), nv.getBav_diachi(), nv.getBav_email(), nv.getBav_soluong(), nv.getId());
    }

    // Xóa nhân viên theo ID
    public int delete(int id) {
        String sql = "DELETE FROM bav_nhanvien WHERE id = ?";
        return template.update(sql, id);
    }

    // Lấy một nhân viên theo ID
    public BAV_NhanVien getNhanVienById(int id) {
        String sql = "SELECT * FROM bav_nhanvien WHERE id = ?";
        return template.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<BAV_NhanVien>(BAV_NhanVien.class));
    }

    // Lấy danh sách tất cả nhân viên
    public List<BAV_NhanVien> getAllNhanVien() {
        String sql = "SELECT * FROM bav_nhanvien";
        return template.query(sql, new RowMapper<BAV_NhanVien>() {
            public BAV_NhanVien mapRow(ResultSet rs, int row) throws SQLException {
                BAV_NhanVien nv = new BAV_NhanVien();
                nv.setId(rs.getInt("id"));
                nv.setBav_name(rs.getString("bav_name"));
                nv.setBav_hinhanh(rs.getString("bav_hinhanh"));
                nv.setBav_tuoi(rs.getInt("bav_tuoi"));
                nv.setBav_diachi(rs.getString("bav_diachi"));
                nv.setBav_email(rs.getString("bav_email"));
                nv.setBav_soluong(rs.getInt("bav_soluong"));
                return nv;
            }
        });
    }
}