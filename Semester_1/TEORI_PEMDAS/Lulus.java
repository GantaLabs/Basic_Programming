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

public class Lulus {
    public static void main(String[] args) {
      
        int Nilai;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai Anda = ");
        Nilai = input.nextInt();
        
        if (Nilai > 60) System.out.println("Selamat! Anda Lulus");
        else  {
               System.out.println("Anda Tidak Lulus!");}
               System.out.println("SIlahkan coba lagi");
               input.close();
    }
}