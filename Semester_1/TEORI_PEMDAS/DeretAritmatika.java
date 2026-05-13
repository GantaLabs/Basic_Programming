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

public class DeretAritmatika {
    public static void main(String[] args) {
        int a,pengulangan,total = 0;
        
        
        Scanner input = new Scanner(System.in);
        
       System.out.print("Masukkan Nilai Awal : ");
       a = input.nextInt(); 
        
        
       System.out.print("Masukkan Nilai Ahkir : ");
       pengulangan = input.nextInt();
        
        for (int i = a; i < pengulangan; i++ ) {
            System.out.print(1 +(i *3) + " ");

            total += (1 + i * 3);
        }
            System.out.println("\nTotal: " + total); 
            
            /*int counter = 0;
            
            while (counter <= 7){
                total += (1 + counter * 3);
                System.out.print(1 + (counter * 3) +" ");
                counter++;
            }
                System.out.println("\nTotal : " + total);*/

                input.close();

    }
     
}
