/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLHocVien;

/**
 * @author Ngoc Diep
 */
public class Person {

    String hoTen, queQuan;

    public Person() {
    }

    public Person(String hoTen, String queQuan) {
        this.hoTen = hoTen;
        this.queQuan = queQuan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void InThongTin() {
        System.out.printf("%-20s%-20s", hoTen, queQuan);
    }
}
