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

public class MasukkanBilangan {
    public static void main(String[] args) {
        
        int b;
        
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Masukkan Bilangan : ");
            b = input.nextInt();
            System.out.println("Bilangan Yang Dimasukkan Adalah : " + b);
        } while ( b != 0);

        input.close();
    }
}
