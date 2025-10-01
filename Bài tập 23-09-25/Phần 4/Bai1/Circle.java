/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Bai1;

/**
* @author Ngoc Diep
 */
public class Circle extends Shape {
    float r;
    
    public Circle() {
        
    }

    public Circle(float r, String ten) {
        super(ten);
        this.r = r;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    @Override
    public float tinhDienTich() {
        return (float) (Math.PI * r * r);
    }
    
}
