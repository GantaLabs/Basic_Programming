/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semester_1.Basic_Programming.Semester_1.PRAKTIKUM_PEMDAS.Tugas1;

/**
 *
 * @author ASUS
 */

//Import Scanner
import java.util.Scanner;

public class Tugas1_1 {
    public static void main(String[] args) {
        
        //Deklarasikan Variabel 
        int Bilangan1, Bilangan2, Penjumlahan, Pengurangan, Perkalian;
        float Pembagian;
        
        //Membuat object scanner bernama input
        Scanner input = new Scanner (System.in);
        
       System.out.print("Masukkan Operator Pertama : ");
          Bilangan1 = input.nextInt();
       
       System.out.print("Masukkan Operator Kedua : ");
          Bilangan2 = input.nextInt();
          
          //Menentukan Hasil Penjumlahan, Pengurangan, Perkalian, Dan Pembagian          
          Penjumlahan = Bilangan1 + Bilangan2;
          Pengurangan = Bilangan1 - Bilangan2;
          Perkalian = Bilangan1 * Bilangan2;
          Pembagian = (float) Bilangan1 / Bilangan2;

          
        //Print Hasil  
        System.out.println("Hasil Penjumlahan : " + Penjumlahan);
        System.out.println("Hasil Pengurangan : " + Pengurangan);
        System.out.println("Hasil Perkalian : " + Perkalian);
        System.out.println("Hasil Pembagian : " + Pembagian);

       input.close();
        
    }
}
