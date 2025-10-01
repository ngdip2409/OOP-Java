/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Bai1;

/**
* @author Ngoc Diep
 */
public class Rectangle extends Shape {
    float dai, rong;
    
    public Rectangle() {
        
    }

    public Rectangle(float dai, float rong, String ten) {
        super(ten);
        this.dai = dai;
        this.rong = rong;
    }

    public float getDai() {
        return dai;
    }

    public void setDai(float dai) {
        this.dai = dai;
    }

    public float getRong() {
        return rong;
    }

    public void setRong(float rong) {
        this.rong = rong;
    }

    @Override
    public float tinhDienTich() {
        return  dai * rong;
    }
    
}
