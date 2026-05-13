/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semester_1.Basic_Programming.Semester_1.PRAKTIKUM_PEMDAS.Tugas2;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Tugas2_3 {
    public static void main(String[] args) {
            
            int JamKerja, Upah, Lembur, Denda;
            
            Scanner input = new Scanner(System.in);
            
            System.out.print("Jam Kerja : ");
            JamKerja = input.nextInt();
            
            Upah = JamKerja * 5000;
            Lembur = 0;
            Denda = 0;
           
            if ( JamKerja > 60) {
                Upah = (60 * 5000);
                Lembur = (JamKerja - 60)*6000;
         } else if (JamKerja < 50){
                Denda = (-(50 - JamKerja)*1000);}
         
            System.out.println("Jam Kerja : " + JamKerja + " Jam");
            System.out.println("Upah : Rp. " + Upah + ", -");
            System.out.println("Lembur : Rp. " + Lembur + ", -");
            System.out.println("Denda : Rp. " + Denda + ", -");
            System.out.println("----------------------");
            System.out.println("Total : Rp. " + (Upah + Lembur + Denda) + ", -");

            input.close();
    }
    
}
