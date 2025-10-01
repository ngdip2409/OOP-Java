/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 * @author Ngoc Diep
 */
public class XeTai extends XeOto {

    double taiTrong;

    public XeTai(String tenXe, String hangSX, int namSX, double giaGoc, double taiTrong) {
        super(tenXe, hangSX, namSX, giaGoc);
        this.taiTrong = taiTrong;
    }

    @Override
    double TinhThue() {
        if (taiTrong < 5) {
            return 0.4 * giaGoc;
        } else {
            return 0.6 * giaGoc;
        }
    }

    @Override
    public void InThongTin() {
        super.InThongTin();
        System.out.println("Tai trong: " + taiTrong + " tan");
        System.out.println("Thue nhap khau: " + TinhThue() + " USD");
    }
}
