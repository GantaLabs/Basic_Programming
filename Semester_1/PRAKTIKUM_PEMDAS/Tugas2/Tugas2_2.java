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

public class Tugas2_2 {
    public static void main(String[] args) {
        
            int BeratBadan;
            double TinggiBadan, IMT;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Berat Badan (Kg) : ");
        BeratBadan = input.nextInt();
        
        System.out.print("Tinggi Badan (M) : ");
        TinggiBadan = input.nextDouble();
        
        IMT = (double) (BeratBadan/Math.pow(TinggiBadan,2));
        
        if (IMT <= 18.5){
            System.out.printf("%s%.2f%s", "IMT = "  , IMT ,  ", Anda Termasuk Kurus\n");
        } else if( IMT > 18.5 && IMT <= 25.0){
             System.out.printf("%s%.2f%s", "IMT = "  , IMT ,  ", Anda Termasuk Normal\n");
        } else if( IMT > 25.0 && IMT <= 30.0){
             System.out.printf("%s%.2f%s", "IMT = "  , IMT ,  ", Anda Termasuk Gemuk\n");
        } else {
             System.out.printf("%s%.2f%s", "IMT = "  , IMT ,  ", Anda Termasuk Kegemukan\n");
        }

        input.close();
    }
}
