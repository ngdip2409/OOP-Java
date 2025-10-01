/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 * @author Ngoc Diep
 */
public abstract class XeOto {

    String tenXe, hangSX;
    int namSX;
    double giaGoc;

    public XeOto() {
    }

    public XeOto(String tenXe, String hangSX, int namSX, double giaGoc) {
        this.tenXe = tenXe;
        this.hangSX = hangSX;
        this.namSX = namSX;
        this.giaGoc = giaGoc;
    }

    abstract double TinhThue();

    public void InThongTin() {
        System.out.println("Ten xe: " + tenXe);
        System.out.println("Hang san xuat: " + hangSX);
        System.out.println("Nam san xuat: " + namSX);
        System.out.println("Gia goc (USD): " + giaGoc);
    }
}
