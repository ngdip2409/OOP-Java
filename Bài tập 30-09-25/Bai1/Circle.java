/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import javax.swing.JOptionPane;

/**
 * @author Ngoc Diep
 */
public class Circle {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter the radius of the circle");

        double radius = Double.parseDouble(input);
        double area = Math.PI * Math.pow(radius, 2);

        JOptionPane.showMessageDialog(null, "The radius of the circle is " + area);
    }
}
