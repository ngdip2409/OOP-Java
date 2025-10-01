/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Bai3;

/**
* @author Ngoc Diep
 */
public class Main {
    public static void main(String[] args) {
        SVNganhDien svDien = new SVNganhDien ("Dien tu", "Bui Gia Thang", "02/12/2006", "Thai Binh");
        SVNganhCo svCo = new SVNganhCo ("Co khi che tao", "Nguyen Duc Tri", "18/01/2005", "Yen Bai");
        CuuSV cuuSV = new CuuSV (2023, "Ky thuat phan mem", "Doan Kim Ngoc Diep", "24/09/2000", "Can Tho");
        
        System.out.println("-----DANH SACH SINH VIEN-----");
        
        System.out.println("---SINH VIEN NGANH DIEN---");
        svDien.InThongTin();
        
        System.out.println("---SINH VIEN NGANH CO---");
        svCo.InThongTin();
        
        System.out.println("---CUU SINH VIEN---");
        cuuSV.InThongTin();
    }
}
