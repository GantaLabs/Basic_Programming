/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semester_1.Basic_Programming.Semester_1.PRAKTIKUM_PEMDAS.Tugas3;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Tugas3_1 {
    public static void main(String[] args) {
        
        
        System.out.print("Masukkan Jumlah Bintang Yang Ingin Dikeluarkan : ");
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        for (int i = 1 ; i <= a ; i++){
            for (int j = i ; j <= a ; j ++ ){
                System.out.print("  ");
            }
            for (int k = 1 ; k <= i ; k++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        
        sc.close();
    }
}

            
            
