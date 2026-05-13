/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semester_1.Basic_Programming.Semester_1.TEORI_PEMDAS;

/**
 *
 * @author ASUS
 */

//Import Scannner
import java.util.Scanner; 

public class BilanganGanjilDanGenap {
    public static void main(String[] args) {
        int BILANGAN;
        
        //Masukkan Bilangan
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Bilangan = ");
        BILANGAN = input.nextInt();
        
        
        //Jikalau Habis dibagi 2 :
        if (BILANGAN % 2 == 0) {
            System.out.println("Bilangan Anda Adalah Genap!");
        }
        else {
            System.out.println("Bilangan Anda Adalah Ganjil!");
        }
        input.close();
    }
}
