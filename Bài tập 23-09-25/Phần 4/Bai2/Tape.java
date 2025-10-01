/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Bai2;
import java.util.Scanner;

/**
* @author Ngoc Diep
 */
public class Tape extends Publication {
    float playingTime;

    public Tape() {
    }

    public Tape(float playingTime, String ten, float gia) {
        super(ten, gia);
        this.playingTime = playingTime;
    }

    public float getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(float playingTime) {
        this.playingTime = playingTime;
    }

    @Override
    public void putData() {
        super.putData(); 
        System.out.printf("%-15.2f phut\n", getPlayingTime());
    }

    @Override
    public void getData() {
        super.getData(); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thoi gian phat (phut): ");
        playingTime = sc.nextFloat();
        sc.nextLine();
    }
    
    
}
