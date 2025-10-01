/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Bai3;

/**
* @author Ngoc Diep
 */
public class SVNganhCo extends SinhVien {
    String chuyenNganh;

    public SVNganhCo() {
    }

    public SVNganhCo(String chuyenNganh, String hoTen, String ngaySinh, String queQuan) {
        super(hoTen, ngaySinh, queQuan);
        this.chuyenNganh = chuyenNganh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public void InThongTin() {
        super.InThongTin(); 
        System.out.printf("%-15s\n", getChuyenNganh());
    }
    
    
}
