/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 * @author Ngoc Diep
 */
public class XeCon extends XeOto {

    public XeCon(String tenXe, String hangSX, int namSX, double giaGoc) {
        super(tenXe, hangSX, namSX, giaGoc);
    }

    @Override
    double TinhThue() {
        if (giaGoc <= 50000) {
            return 0.6 * giaGoc;
        } else if (giaGoc >= 150000) {
            return 1 * giaGoc;
        } else {
            return 0.8 * giaGoc;
        }
    }

    @Override
    public void InThongTin() {
        super.InThongTin();
        System.out.println("Thue nhap khau: " + TinhThue() + " USD");
    }

}
