/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Bai2;
import java.util.Scanner;

/**
* @author Ngoc Diep
 */
public class Book extends Publication {
    int soTrang;

    public Book() {
    }

    public Book(int soTrang, String ten, float gia) {
        super(ten, gia);
        this.soTrang = soTrang;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public void getData() {
        super.getData();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so trang: ");
        soTrang = sc.nextInt();
        sc.nextLine();
    }
    
    @Override
    public void putData() {
         super.putData();
        System.out.printf("%-15d\n", getSoTrang());
    }
}
