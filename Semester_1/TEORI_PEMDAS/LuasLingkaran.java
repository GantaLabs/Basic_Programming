/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semester_1.Basic_Programming.Semester_1.TEORI_PEMDAS;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        
        int Radius;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jari - Jari Lingkaran : ");
        Radius = input.nextInt();
        
        if (Radius <= 0) {
            System.out.println("Error! ");
        }
        else {
            if (Radius % 7 == 0) {
                System.out.println("Luas Lingkaran adalah : " + (Radius*Radius*22/7));
            }
            else{
                System.out.println("Luas Lingkarang adalah : " + (Double) (Radius*Radius*3.14));
                }
        }

        input.close();
    }
    
}
