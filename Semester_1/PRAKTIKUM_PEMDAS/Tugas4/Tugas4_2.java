/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semester_1.Basic_Programming.Semester_1.PRAKTIKUM_PEMDAS.Tugas4;

/**
 *
 * @author ASUS
 */
import java.util.*;

public class Tugas4_2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        boolean Kondisi1 = true;
        String pesanan = null;
        int Pilihan1;
        String KeretaApi [][] = {{"Ekonomi", "Bisnis", "Eksekutif", "Parawisata"},
                            {"50000", "100000", "200000", "300000"},
                            {"2%", "5%", "7%", "10%"},
                            {"Tidak Ada", "Ada", "Ada", "Ada"},
                            {"Tidak Ada", "Tidak Ada", "Tidak Ada", "Ada"}};
        
        while (Kondisi1){
            System.out.println("""
                               Pilihan Menu :
                               1. Melihat Daftar Kereta Api
                               2. Melihat Daftar Kereta Api yang ada AC
                               3. Melihat Daftar Kereta Api yang ada Colokan
                               4. Memesan Tiket Kereta Api
                               5. Melihat Pesanan Tiket
                               0. Keluar""");
            System.out.println("");
            
            System.out.print("Masukkan Pilihan Anda : ");
            Pilihan1 = input.nextInt();
            input.nextLine();
            
            switch (Pilihan1){
                case 0 :{
                    System.out.println("Anda Telah Keluar dari program");
                    System.out.println("Terimakasih..");
                    Kondisi1 = false;
                    break;
                }
                
                case 1 : {
                    System.out.println("Daftar Kereta : ");
                    System.out.printf("%-15s %-12s %-8s %-12s %-12s%n", 
                                      "Jenis", "Harga" , "Diskon" ,
                                      "AC", "Colokan");
                    System.out.println("-------------------------------------------------------------");
                    int PanKereta = KeretaApi[0].length; 
                    for (int j = 0; j < PanKereta; j++) {
                        System.out.printf("%-15s %-12s %-8s %-12s %-12s%n",
                            KeretaApi[0][j], 
                            KeretaApi[1][j], 
                            KeretaApi[2][j], 
                            KeretaApi[3][j], 
                            KeretaApi[4][j] );
                    } System.out.println();
                    break;
                }
                
                case 2 : {
                    System.out.println("Daftar Kereta Yang Memiliki AC : ");
                    System.out.printf("%-15s %-12s %-8s %-12s %-12s%n", 
                                      "Jenis", "Harga" , "Diskon" ,
                                      "AC", "Colokan");
                    System.out.println("-------------------------------------------------------------");
                    int PanKereta = KeretaApi[0].length; 
                    
                    for (int j = 0; j < PanKereta; j++) {
                        
                        if (KeretaApi[3][j].equalsIgnoreCase("Ada")){
                            System.out.printf("%-15s %-12s %-8s %-12s %-12s%n",
                            KeretaApi[0][j], 
                            KeretaApi[1][j], 
                            KeretaApi[2][j], 
                            KeretaApi[3][j], 
                            KeretaApi[4][j] );
                        }
                    } System.out.println();
                    break;
                }
                
                case 3 : {
                    System.out.println("Daftar Kereta Yang Memiliki Colokan : ");
                    System.out.printf("%-15s %-12s %-8s %-12s %-12s%n", 
                                      "Jenis", "Harga" , "Diskon" ,
                                      "AC", "Colokan");
                    System.out.println("-------------------------------------------------------------");
                    int PanKereta = KeretaApi[0].length; 
                    
                    for (int j = 0; j < PanKereta; j++) {
                        if (KeretaApi[4][j].equalsIgnoreCase("Ada")){
                            System.out.printf("%-15s %-12s %-8s %-12s %-12s%n",
                            KeretaApi[0][j], 
                            KeretaApi[1][j], 
                            KeretaApi[2][j], 
                            KeretaApi[3][j], 
                            KeretaApi[4][j] );
                        }
                    } System.out.println();
                    break;
                }
                
                case 4 : {
                    System.out.print("Masukkan Jenis Kereta Api Yang Ingin Anda Pesan : ");
                    String JenisKereta = input.nextLine();
                    boolean found = false;
                    int cols = KeretaApi[0].length;
                    for (int j = 0; j < cols; j++) {
                        if (KeretaApi[0][j].equalsIgnoreCase(JenisKereta)) {
                            found = true;
                            pesanan = (KeretaApi[0][j]); // simpan nama jenis (format konsisten)
                            System.out.println("Anda memesan kereta " + KeretaApi[0][j] + ".\n");
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Kereta dengan jenis '" + JenisKereta + "' tidak ditemukan.\n");
                    }
                    break;
                }
            
                case 5 : {
                    
                    if (pesanan == null) {
                        System.out.println("Belum ada pesanan.\n");
                    } else {
                        System.out.println("Daftar Pesanan Anda:");
                        System.out.println("Anda Memesan Kereta Jenis " + pesanan);
                    }
                        System.out.println();
                        break;
                    }
                default : {
                    System.out.println("Pastikan Anda Memilih dengan benar!");
                }
            }
        }
        input.close();
    }
}

