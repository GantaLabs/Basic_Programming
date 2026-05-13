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

public class LuasPersegi {
    public static void main(String[] args) {
        int PANJANG;
        int LEBAR;
        int LUAS;
        
        Scanner input= new Scanner(System.in);
        System.out.print("PANJANG = ");
        PANJANG = input.nextInt();
        
        System.out.print("LEBAR = ");
        LEBAR = input.nextInt();
        
        LUAS = PANJANG*LEBAR;
        System.out.println("Luas Persegi Panjang adalah " + LUAS + " Satuan Luas");
        
        input.close();
    }
    
}
