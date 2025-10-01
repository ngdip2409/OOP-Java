/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Bai1;

/**
* @author Ngoc Diep
 */
public class Main {
    public static void main(String[] args) {
        Shape tg = new Triangle (3, 4, 5, "Tam giác");
        Shape hcn = new Rectangle (4, 9, "Hình chữ nhật");
        Shape ht = new Circle (5, "Hình tròn");
        
        tg.InThongTin();
        hcn.InThongTin();
        ht.InThongTin();
    }
}
