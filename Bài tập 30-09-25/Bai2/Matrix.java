/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 * @author Ngoc Diep
 */
public class Matrix {

    public static void main(String[] args) {
        int start = 57;
        int end = 96;
        int count = 0;

        for (int i = start; i <= end; i++) {
            System.out.printf("%4d", i);
            count++;
            if (count % 8 == 0) {
                System.out.println();
            }
        }
    }
}
