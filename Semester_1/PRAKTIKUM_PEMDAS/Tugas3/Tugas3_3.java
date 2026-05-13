/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
package Semester_1.Basic_Programming.Semester_1.PRAKTIKUM_PEMDAS.Tugas3;

import java.util.Scanner;

public class Tugas3_3 {
    public static void main(String[] args) {
        
        int Pilihan1;
        boolean Kondisi1 = true;

        while(Kondisi1 == true){
            System.out.println("""
                           
                               
                           MENU : 
                           0. KELUAR
                           1. HITUNG VOLUME BALOK
                           2. HITUNG VOLUME BOLA
                           3. HITUNG VOLUME KERUCUT
                           4. HITUNG VOLUME SILINDER
                           5. HITUNG VOLUME LIMAS SEGITIGA
                           -----------------------------------""");
        
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMASUKKAN PILIHAN ANDA : ");
        
            Pilihan1 = sc.nextInt();
            switch (Pilihan1){
                  case 0 : {
                    System.out.println("Anda Telat Keluar Dari Program..");
                    Kondisi1 = false;
                    break;
                    
                } case 1 : {
                    System.out.println("Anda Memilih Pilihan Untuk Menghitung Volume Balok.");
                    System.out.print("Masukkan Panjang Balok : ");
                    int Panjang = sc.nextInt();
                    System.out.print("Masukkan Lebar Balok : ");
                    int Lebar = sc.nextInt();
                    System.out.print("Masukkan Tinggi Balok : ");
                    int Tinggi = sc.nextInt();
                    
                    int VolumeBalok = Panjang * Lebar * Tinggi;
                    
                    System.out.println("Volume Balok Adalah : " + VolumeBalok);
                    break;
                    
                } case 2 : {
                    System.out.println("Anda Memilih Pilihan Untuk Menghitung Volume Bola.");
                    System.out.print("Masukkan Jari - Jari Bola : ");
                    int JariB = sc.nextInt();
                    
                    double VolumeBola = (4/3 * Math.PI * JariB * JariB * JariB);
                    
                    System.out.printf("%s%f","Volume Bola Adalah : ", VolumeBola );
                    break;
                    
                } case 3 : {
                    System.out.println("Anda Memilih Pilihan Untuk Menghitung Volume Kerucut.");
                    System.out.print("Masukkan Jari - Jari Kerucut : ");
                    int JariK = sc.nextInt();
                    System.out.print("Masukkan Tinggi Kerucut : ");
                    int TinggiK = sc.nextInt();
                    
                    double VolumeKerucut = (1/3 * Math.PI * JariK * JariK * TinggiK);
                    
                    System.out.printf("%s%f","Volume Kerucut Adalah : ", VolumeKerucut );
                    break;
                    
                } case 4 : {
                    System.out.println("Anda Memilih Pilihan Untuk Menghitung Volume Silinder.");
                    System.out.print("Masukkan Jari - Jari Silinder : ");
                    int JariS = sc.nextInt();
                    System.out.print("Masukkan Tinggi Silinder : ");
                    int TinggiS = sc.nextInt();
                    
                    double VolumeSilinder = (Math.PI * JariS * JariS * TinggiS);
                    
                    System.out.printf("%s%f","Volume Silinder Adalah : ", VolumeSilinder );
                    break;
                    
                } case 5 : {
                    System.out.println("Anda Memilih Pilihan Untuk Menghitung Volume Limas Segitiga.");
                    System.out.print("Masukkan Alas Segitiga : ");
                    int AlasSegitiga = sc.nextInt();
                    System.out.print("Masukkan Tinggi Segitiga : ");
                    int TinggiSegitiga = sc.nextInt();
                    System.out.print("Masukkan Tinggi Limas : ");
                    int TinggiLimas = sc.nextInt();
                    
                    double AlasLimas = (1/2 * AlasSegitiga * TinggiSegitiga);
                    double VolumeLimas = (1/2 * AlasLimas * TinggiLimas);
                    
                    System.out.printf("%s%f","Volume Limas Adalah : ", VolumeLimas );
                    break;
                    
                } default : {
                    System.out.println("Pilihan Anda Tidak Tersedia, Pilih Lagi!");
                }
                
            }
            sc.close();
        }
        
    } 
    
}
