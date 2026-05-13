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

public class JamDanMenitKeDetik {
    public static void main(String[] args) {
        int JAM,MENIT,DETIK;
        
        Scanner input= new Scanner(System.in);
        System.out.print("Masukkan Jumlah Jam = ");
        JAM = input.nextInt();
        
        System.out.print("Masukkan Jumlah Menit = ");
        MENIT = input.nextInt();
        
        DETIK = (JAM*3600 + MENIT*60);
        System.out.println("Jumlah Detik adalah " + DETIK + " Detik");
        
        input.close();
    }
}
