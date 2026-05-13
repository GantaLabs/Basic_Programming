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

public class Tugas2_1 {
    public static void main(String[] args) {
        
        //Deklerasi Variabel
        int pilihan, r,  A, B ,C;
            
        System.out.println("Menu : ");
        System.out.println("1. Menghitung Luas Dan Keliling Persegi Panjang");
        System.out.println("2. Menghitung Luas Dan Keliling Lingkaran");
        System.out.println("3. Menghitung Luas Dan Keliling Segitiga");
        
         Scanner input = new Scanner(System.in);
         System.out.print("Pilihan anda : ");
         pilihan = input.nextInt();
         
          switch (pilihan) {
             case 1 : 
                 System.out.print("Masukkan Nilai Panjang Persegi Panjang : ");
                 A = input.nextInt();
                 System.out.print("Masukkan Nilai Lebar Persegi Panjang : ");
                 B = input.nextInt();

                 System.out.println("\n Keliling Persegi Panjang : " + (2*(A+B)) + " Cm");
                 System.out.println("Luas Persegi Panjang : " + (A*B) + " Cm2");
                 break;
                 
             case 2 : 
                 System.out.print("Masukkan Nilai Jari - Jari Lingkaran : ");
                 r = input.nextInt();

                 System.out.println("\nKeliling Lingkaran : " + (double)(2*Math.PI*r) + " Cm");
                 System.out.println("Luas Lingkaran : " + (double)(r*r*Math.PI) + " Cm2");
                 break;
                 
              case 3 : 
                 System.out.print("Masukkan A : ");
                 A = input.nextInt();
                 System.out.print("Masukkan B : ");
                 B = input.nextInt();
                 System.out.print("Masukkan C : ");
                 C = input.nextInt();
                 
                 System.out.println("\nKeliling Segitiga : " + (A+B+C) + " Cm");
                 System.out.println("Luas Persegi Panjang : " + ((A*B)/2) + "  Cm2");
                 break;
               
              default :
                  System.out.println("Data tak ditemukan, program dihentikan ...");    

                  input.close();
        }
    }
}
