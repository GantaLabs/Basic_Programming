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

public class GajiTotal {
    public static void main(String[] args) {
        
        int JumlahAnak;
        int GajiPokok = 2000000;
        
      Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Anak : ");
        JumlahAnak = input.nextInt();
        
        if (JumlahAnak == 0) {
            System.out.println("Jumlah Gaji Anda : Rp.  " + GajiPokok + ", -" );
        } else if (JumlahAnak >= 1 && JumlahAnak <= 2 ){
            System.out.println("Jumlah Gaji Anda : Rp. " + (GajiPokok + 400000) + ", -");
        } else if (JumlahAnak >= 3 && JumlahAnak <=4){
            System.out.println("Jumlah Gaji Anda : Rp. " + (GajiPokok + 800000) + ", -");
        } else {
            System.out.println("Jumlah Gaji Anda : Rp. " + (GajiPokok + 1000000) + ", -");
        }
              
        input.close();
    }
    
}
