/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semester_1.Basic_Programming.Semester_1.PRAKTIKUM_PEMDAS.Tugas1;

/**
 *
 * @author ASUS
 */

import java.util.Scanner;

public class Tugas1_2 {   
    public static void main(String[] args){
        
        // Deklerasikan Variabel
        String Nama, Kelurahan;
        int PosisiAwal, PosisiAhkir, BiayaBeban;
        double PPJ;
        
        //Masukkan Object Scanner
        Scanner input = new Scanner(System.in);
        
                
        System.out.print("Masukkan Nama : ");
        Nama = input.nextLine();
        
        System.out.print("Kelurahan : ");
        Kelurahan = input.nextLine();
        
        System.out.print("Masukkan Posisi Awal Kwh Meter : ");
        PosisiAwal = input.nextInt();
        System.out.print("Masukkan Posisi Ahkir Kwh Meter : ");
        PosisiAhkir = input.nextInt();
        
        System.out.print("Masukkan Biaya Beban Saat Ini : ");
        BiayaBeban = input.nextInt();
        
        System.out.print("Masukkan PPJ (Dalam Persen (%)) : ");
        PPJ = input.nextDouble();
        
               System.out.println("===================PLN Java===================" ); 
               System.out.println("Nama : " + Nama);
               System.out.println("Kelurahan : " + Kelurahan);
               System.out.println("Pemakaian bulan ini : " + (PosisiAhkir - PosisiAwal) + " Kwh Meter");
               System.out.println("Tarif Listrik : Rp. " + (BiayaBeban*(PosisiAhkir - PosisiAwal)) +", - ");
               System.out.println("PPJ 10% : " + ( (PPJ / 100)*(BiayaBeban*(PosisiAhkir - PosisiAwal))) +", - " );
               System.out.println("Total Bayar : Rp. " + ((BiayaBeban*(PosisiAhkir - PosisiAwal)) + (PPJ / 100*(BiayaBeban*(PosisiAhkir - PosisiAwal)))) +", - " );
               System.out.println("==============================================");
    
               input.close();
    }
    
}
