/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLHocVien;

/**
 * @author Ngoc Diep
 */
public class Student extends Person {

    String maHV;
    float diemThi;

    public Student() {
    }

    public Student(String maHV, String hoTen, String queQuan, float diemThi) {
        super(hoTen, queQuan);
        this.maHV = maHV;
        this.diemThi = diemThi;
    }

    public String getMaHV() {
        return maHV;
    }

    public void setMaHV(String maHV) {
        this.maHV = maHV;
    }

    public float getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(float diemThi) {
        this.diemThi = diemThi;
    }

    @Override
    public void InThongTin() {
        super.InThongTin();
        System.out.printf("%-10s%-10.2f\n", maHV, diemThi);
    }

}
