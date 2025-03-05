package com.springmvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.beans.BAV_NhanVien;
import com.springmvc.dao.Bav_NhanVienDao;

@Controller
@RequestMapping("/nhanvien")
public class Bav_NhanVienController {

    @Autowired
    private Bav_NhanVienDao nhanVienDao;

    // Hiển thị danh sách nhân viên
    @GetMapping("/list")
    public String viewNhanVien(Model model, 
                               @RequestParam(value = "success", required = false) String success, 
                               @RequestParam(value = "error", required = false) String error) {
        List<BAV_NhanVien> list = nhanVienDao.getAllNhanVien();
        model.addAttribute("list", list);
        model.addAttribute("success", success);
        model.addAttribute("error", error);
        return "nhanvien/list";
    }

    // Hiển thị form thêm nhân viên
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("command", new BAV_NhanVien());
        return "nhanvien/add";
    }

    // Lưu nhân viên mới
    @PostMapping("/save")
    public String save(@ModelAttribute("command") BAV_NhanVien nhanVien) {
        try {
            nhanVienDao.save(nhanVien);
            return "redirect:/nhanvien/list?success=added";
        } catch (Exception e) {
            return "redirect:/nhanvien/list?error=add_failed";
        }
    }

    // Hiển thị form chỉnh sửa
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        BAV_NhanVien nhanVien = nhanVienDao.getNhanVienById(id);
        if (nhanVien == null) {
            return "redirect:/nhanvien/list?error=notfound";
        }
        model.addAttribute("command", nhanVien);
        return "nhanvien/edit";
    }

    // Cập nhật nhân viên
    @PostMapping("/update")
    public String update(@ModelAttribute("command") BAV_NhanVien nhanVien) {
        try {
            nhanVienDao.update(nhanVien);
            return "redirect:/nhanvien/list?success=updated";
        } catch (Exception e) {
            return "redirect:/nhanvien/list?error=update_failed";
        }
    }

    // Xóa nhân viên
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        BAV_NhanVien nhanVien = nhanVienDao.getNhanVienById(id);
        if (nhanVien == null) {
            return "redirect:/nhanvien/list?error=notfound";
        }
        try {
            nhanVienDao.delete(id);
            return "redirect:/nhanvien/list?success=deleted";
        } catch (Exception e) {
            return "redirect:/nhanvien/list?error=delete_failed";
        }
    }
}
