/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 * @author Ngoc Diep
 */
public class Main {

    public static void main(String[] args) {
        XeKhach xk = new XeKhach("Thaco Bus", "Thaco", 2020, 70000, 30);
        XeTai xt = new XeTai("Hyundai HD700", "Hyundai", 2019, 45000, 4.5);
        XeCon xc = new XeCon("Mercedes S500", "Mercedes-Benz", 2021, 160000);

        System.out.println("===== Xe khach =====");
        xk.InThongTin();

        System.out.println("\n===== Xe tai =====");
        xt.InThongTin();

        System.out.println("\n===== Xe con =====");
        xc.InThongTin();
    }
}
