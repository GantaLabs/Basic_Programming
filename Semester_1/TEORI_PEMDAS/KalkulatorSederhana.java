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

public class KalkulatorSederhana {
      public static void main(String[] args) {
      
          int Pilihan,Bilangan1, Bilangan2;
          double Pembagian;
    
          
          System.out.println("Masukkan Pilihan Anda : ");
          System.out.println("1. Penjumlahan");
          System.out.println("2. Pengurangan");
          System.out.println("3. Perkalian");
          System.out.println("4. Pembagian");
          
          Scanner input = new Scanner(System.in);
          
            System.out.print("Pilihan Anda : ");
                Pilihan = input.nextInt();
                
         switch (Pilihan) {    
         case 1 :{ 
                System.out.print("Masukkan Bilangan Pertama : ");
                    Bilangan1 = input.nextInt();
                System.out.print("Masukkan Bilangan Kedua : ");
                    Bilangan2 = input.nextInt();
                System.out.println("Hasil Penjumlahan Adalah = " + ( (Bilangan1 + Bilangan2) ));
         }break;
         
         case 2 : {
                System.out.print("Masukkan Bilangan Pertama : ");
                    Bilangan1 = input.nextInt();
                System.out.print("Masukkan Bilangan Kedua : ");
                    Bilangan2 = input.nextInt();
                System.out.println("Hasil Pengurangan Adalah = " + ( (Bilangan1 - Bilangan2) ));
         }break;
          
         case 3 : { 
                System.out.print("Masukkan Bilangan Pertama : ");
                    Bilangan1 = input.nextInt();
                System.out.print("Masukkan Bilangan Kedua : ");
                    Bilangan2 = input.nextInt();
                System.out.println("Hasil Perkalian Adalah = " + ( (Bilangan1 * Bilangan2) ));
         }break;
          
         case 4 : {
                System.out.print("Masukkan Bilangan Pertama : ");
                    Bilangan1 = input.nextInt();
                System.out.print("Masukkan Bilangan Kedua : ");
                    Bilangan2 = input.nextInt();
                    
                    Pembagian = (double) Bilangan1 / Bilangan2;
                    
                System.out.println("Hasil Pembagian Adalah = " + Pembagian );
         }break;
         
         default : {
             System.out.println("Tidak Ada Pilihan, Tidak Bisa Dilanjutkan");
         }
          
         }

         input.close();
    }
    
}
