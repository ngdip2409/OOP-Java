/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Bai2;

/**
* @author Ngoc Diep
 */
public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.getData();
        
        Tape tape = new Tape();
        tape.getData();
        
        System.out.println("\n--- Thong tin san pham ---");
        book.putData();
        tape.putData();
    }
}
