/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Bai2;
import java.util.Scanner;

/**
* @author Ngoc Diep
 */
public class Publication {
    String ten;
    float gia;

    public Publication() {
    }

    public Publication(String ten, float gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }
    
    public void getData() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ten: ");
        ten = sc.nextLine();
        
        System.out.print("Nhap gia: ");
        gia = sc.nextFloat();
        sc.nextLine();
    }
    
    public void putData() {
        System.out.printf("%-20s%-15.2f", getTen(), getGia());
    }
}
