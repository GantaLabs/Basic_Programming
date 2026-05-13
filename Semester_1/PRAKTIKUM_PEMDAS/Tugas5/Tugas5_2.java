/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semester_1.Basic_Programming.Semester_1.PRAKTIKUM_PEMDAS.Tugas5;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Tugas5_2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        TentukanPrima(angka);
        BilPrima();
        System.out.println();

        input.close();
    }
    
    
    public static void TentukanPrima(int angka){
        int x = 0;
        
        for (int i = 2 ; i <= angka ; i++){
            int Sisa = angka % i;
                if (Sisa == 0){
                    x++;
                }
       }
         if (x == 1) {
        System.out.println("Bilangan " + angka + " Termasuk Prima");
       } else {
        System.out.println("Bilangan " + angka + " Bukan Termasuk Prima");
       }
    }
    
    public static void BilPrima(){
        for (int i = 2 ; i <= 100 ; i++){
            boolean prima = true;   
        
        
        for (int j = 2 ; j < i ; j++){
            if (i % j == 0){
                prima = false;
            }
        }
        
        if (prima){
            System.out.print(i +" ");
        }
    }
        System.out.println();
    }
}
