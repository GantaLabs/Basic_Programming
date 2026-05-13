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

public class Hari {
    public static void main(String[] args) {
     
       
        int hari;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Angka Sesuai Hari!");
        hari = input.nextInt();
        
        switch (hari) {
            case 1 : System.out.println(" Hari Senin");
            
            case 2 : System.out.println(" Hari Selasa");
            break;
            case 3 : System.out.println(" Hari Rabu");
            break;
            case 4 : System.out.println(" Hari Kamis");
            break;
            case 5 : System.out.println(" Hari Jumat");
            break;
            case 6 : System.out.println(" Hari Sabtu");
            break;
            case 7 : System.out.println(" Hari Minggu");
            break;
            
            default : System.out.println("Pilih Hari");
        }
                
        input.close();
    }
    
}
