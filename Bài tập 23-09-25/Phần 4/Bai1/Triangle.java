/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Bai1;

/**
* @author Ngoc Diep
 */
public class Triangle extends Shape {
    float a, b, c;
    
    public Triangle() {
        
    }

    public Triangle(float a, float b, float c, String ten) {
        super(ten);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    @Override
    public float tinhDienTich() {
        float p = (a +b + c) / 2;
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }  
}
