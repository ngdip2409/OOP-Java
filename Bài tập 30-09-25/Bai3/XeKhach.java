/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 * @author Ngoc Diep
 */
public class XeKhach extends XeOto {

    int soCho;

    public XeKhach() {
    }

    public XeKhach(String tenXe, String hangSX, int namSX, double giaGoc, int soCho) {
        super(tenXe, hangSX, namSX, giaGoc);
        this.soCho = soCho;
    }

    @Override
    double TinhThue() {
        if (soCho <= 24) {
            return 0.6 * giaGoc;
        } else {
            return 0.8 * giaGoc;
        }
    }

    @Override
    public void InThongTin() {
        super.InThongTin();
        System.out.println("So cho ngoi: " + soCho);
        System.out.println("Thue nhap khau: " + TinhThue() + " USD");
    }
}
