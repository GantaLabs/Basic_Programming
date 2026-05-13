/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
package Semester_1.Basic_Programming.Semester_1.CASEBASED_PEMDAS; 

import java.util.Scanner;

public class CaseBased1 {
    public static void main(String[] args) {

        String Pilihan2, Pilihan3, Pilihan4, Pilihan5, YN;
        long Biaya = 0;
        int Pilihan;
        boolean Kondisi1 = true;

        Scanner input = new Scanner(System.in);

        while (Kondisi1) {
            System.out.println("""
                               ----------SELAMAT DATANG DI FILKOM ELECTRONIC SHOP----------
                               SILAHKAN PILIH BARANG YANG TELAH DISEDIAKAN : 
                               1. CHARGER HANDPHONE (Rp 45.000 - Rp 60.000)
                               2. POWERBANK (Rp 80.000 - Rp 200.000)
                               3. TWS (Rp. 40.000 - Rp. 150.000)
                               4. MOUSE (Rp. 50.000 - Rp. 100.000)
                               5. KIPAS ELEKRIK MINI (Rp. 60.000)
                               """);
            
            System.out.println("");
            System.out.print("Masukkan Barang Yang Ingin Anda Beli : ");
            Pilihan = input.nextInt();
            input.nextLine(); 

            switch (Pilihan) {
                // Bagian 1
                  case 1 : {
                    boolean Kondisi2 = true;
                    while (Kondisi2) {
                        System.out.println("""
                                           Silahkan Pilih Jenis Charger Yang Anda Inginkan:
                                           A. Charger Type - C (Rp 50.000)
                                           B. Charger Mikro USB (Rp 45.000)
                                           C. Charger Lightning (Rp 60.000)""");
                        System.out.println("");
                        System.out.print("Pilihan Anda : ");
                        Pilihan2 = input.nextLine();

                        switch (Pilihan2.toUpperCase()) {
                              case "A": {
                                System.out.println("Anda Memilih Charger Type - C");
                                Biaya += 50000;
                                Kondisi2 = false;
                                break;
                            } case "B": {
                                System.out.println("Anda Memilih Charger Mikro USB");
                                Biaya += 45000;
                                Kondisi2 = false;
                                break;
                            }  case "C": {
                                System.out.println("Anda Memilih Charger Lightning");
                                Biaya += 60000;
                                Kondisi2 = false;
                                break;
                            }  default:
                                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                                break;
                        }
                    } break;
                
                // Bagian 2
                } case 2 : {
                    boolean Kondisi3 = true;
                    while (Kondisi3) {
                        System.out.println("""
                                           Silahkan Pilih Jenis Powebank Yang Anda Inginkan:
                                           A. Powerbank 10.000 mAh (Rp. 80.000)
                                           B. Powerbank 50.000 mAh (Rp. 120.000)
                                           C. Powerbank 100.000 mAh (Rp. 200.000)""");
                        System.out.println("");
                        System.out.print("Pilihan Anda : ");
                        Pilihan3 = input.nextLine();

                        switch (Pilihan3.toUpperCase()) {
                              case "A": {
                                System.out.println("Anda Memilih Powerbank 10.000 mAh");
                                Biaya += 80000;
                                Kondisi3 = false;
                                break;
                            } case "B": {
                                System.out.println("Anda Memilih Powerbank 50.000 mAh");
                                Biaya += 120000;
                                Kondisi3 = false;
                                break;
                            } case "C": {
                                System.out.println("Anda Memilih Powerbank 100.000 mAh");
                                Biaya += 200000;
                                Kondisi3 = false;
                                break;
                            } default:
                                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                                break;
                        }
                    } break;
                    
                // Bagian 3
                } case 3:{
                    boolean Kondisi4 = true;
                    while (Kondisi4) {
                        System.out.println("""
                                           Silahkan Pilih Jenis Tws Yang Anda Inginkan:
                                           A. Tws Wired (Rp. 40.000)
                                           B. Tws Wireless (Rp. 150.000)""");
                        System.out.println("");
                        System.out.print("Pilihan Anda : ");
                        Pilihan4 = input.nextLine();

                        switch (Pilihan4.toUpperCase()) {
                            case "A": {
                                System.out.println("Anda Memilih Tws Wired");
                                Biaya += 40000;
                                Kondisi4 = false;
                                break;
                            }
                            case "B": {
                                System.out.println("Anda Memilih Tws Wireless");
                                Biaya += 150000;
                                Kondisi4 = false;
                                break;
                            }
                            default:
                                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                                break;
                        }
                    } break;
                   
                // Bagian 4    
                } case 4: {
                    boolean Kondisi5 = true;
                    while (Kondisi5) {
                        System.out.println("""
                                           Silahkan Pilih Jenis Mouse Yang Anda Inginkan:
                                           A. Mouse Wired (Rp. 50.000)
                                           B. Mouse Wireless (Rp. 100.000)""");
                        System.out.println("");
                        System.out.print("Pilihan Anda : ");
                        Pilihan5 = input.nextLine();

                        switch (Pilihan5.toUpperCase()) {
                              case "A": {
                                System.out.println("Anda Memilih Mouse Wired");
                                Biaya += 50000;
                                Kondisi5 = false;
                                break;
                            } case "B": {
                                System.out.println("Anda Memilih Mouse Wireless");
                                Biaya += 100000;
                                Kondisi5 = false;
                                break;
                            } default:
                                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                                break;
                        }
                    } break;
                
                // Bagian 5
                } case 5: {
                    System.out.println("Anda Memilih Kipas Elektrik Mini");
                    Biaya += 60000;
                    break;
                
                } default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }

            boolean Kondisi4 = true;
            while (Kondisi4) {
                System.out.print("Apakah Anda Ingin Membeli Lagi? (Y/N): ");
                YN = input.nextLine();

                if (YN.equalsIgnoreCase("Y")) {
                    Kondisi4 = false;
                    // Kondisi1 remains true, so the outer loop continues
                } else if (YN.equalsIgnoreCase("N")) {
                    Kondisi1 = false;
                    Kondisi4 = false;
                } else {
                    System.out.println("Pilihan tidak valid. Silakan masukkan Y atau N.");
                }
            }
        }
        System.out.println("Total Biaya Belanja Anda: Rp " + Biaya);
        input.close();
    }
}