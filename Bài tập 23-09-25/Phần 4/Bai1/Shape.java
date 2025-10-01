/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Bai1;

/**
* @author Ngoc Diep
 */
public abstract class Shape {
    String ten;

    public Shape() {
        
    }
    
    public Shape(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    
    public float tinhDienTich() {
        return 0;
    }
    public void InThongTin() {
        System.out.printf("%-15s%-15.2f\n", getTen(), tinhDienTich());
    }
}
