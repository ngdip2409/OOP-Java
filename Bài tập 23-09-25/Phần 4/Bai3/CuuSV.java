/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Bai3;

/**
* @author Ngoc Diep
 */
public class CuuSV extends SinhVien {
        int namTN;
    String ngheNghiep;


    public CuuSV() {
    }

    public CuuSV(int namTN, String ngheNghiep, String hoTen, String ngaySinh, String queQuan) {
        super(hoTen, ngaySinh, queQuan);
        this.namTN = namTN;
        this.ngheNghiep = ngheNghiep;
    }

    public int getNamTN() {
        return namTN;
    }

    public void setNamTN(int namTN) {
        this.namTN = namTN;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    @Override
    public void InThongTin() {
        super.InThongTin(); 
        System.out.printf("%-15d%-15s\n", getNamTN(), getNgheNghiep());
    }

    
    
    
}
