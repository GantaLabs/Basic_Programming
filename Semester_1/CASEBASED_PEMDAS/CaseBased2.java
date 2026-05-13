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

public class CaseBased2 {

    static String[] nama;
    static String[] nim;
    static String[] status;
    static String[] nomor;
    static int jumlahPelanggan;
    static long[] totalBelanja;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pelanggan: ");
        jumlahPelanggan = sc.nextInt();
        sc.nextLine();
        
        
        
        nama = new String[jumlahPelanggan];
        nim = new String[jumlahPelanggan];
        status = new String[jumlahPelanggan];
        nomor = new String[jumlahPelanggan];
        totalBelanja = new long[jumlahPelanggan];

        for (int i = 0; i < jumlahPelanggan; i++) {
        System.out.println("\nData pelanggan ke-" + (i + 1));
        System.out.print("Masukkan nama: ");
        nama[i] = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim[i] = sc.nextLine();

        // Validasi input status
        boolean Status = true;
        while (Status) {
            System.out.print("STATUS MEMBER (IYA/TIDAK): ");
            status[i] = sc.nextLine().toUpperCase();
            if (status[i].equals("IYA") || status[i].equals("TIDAK")) {
                Status = false;
            } else {
                System.out.println("Input tidak valid! Ketik 'IYA' atau 'TIDAK' saja.");
            }
        }

        System.out.print("Nomor telepon: ");
        nomor[i] = sc.nextLine();
    }

        boolean lanjutSemua = true;
        while (lanjutSemua) {
            System.out.println("\n=== Daftar Pelanggan ===");
            for (int i = 0; i < jumlahPelanggan; i++) {
                System.out.println((i + 1) + ". " + nama[i] + " - Member: " + status[i]);
            }

            System.out.print("\nPilih pelanggan untuk transaksi (1-" + jumlahPelanggan + "): ");
            int pilih = sc.nextInt();
            sc.nextLine();

            if (pilih < 1 || pilih > jumlahPelanggan) {
                System.out.println("Pilihan tidak valid!");
                continue;
            }

            transaksi(sc, pilih - 1);

            System.out.print("\nApakah mau lanjut transaksi pelanggan lain? (Y/N): ");
            String yn = sc.nextLine();
            if (yn.equalsIgnoreCase("N")) {
                lanjutSemua = false;
            }
        }

        System.out.println("\n=== REKAP SEMUA PELANGGAN ===");
        for (int i = 0; i < jumlahPelanggan; i++) {
            System.out.println("\nPelanggan ke-" + (i + 1));
            System.out.println("Nama          : " + nama[i]);
            System.out.println("NIM           : " + nim[i]);
            System.out.println("Status Member : " + status[i]);
            System.out.println("Nomor Telepon : " + nomor[i]);
            System.out.println("Total Belanja : Rp " + totalBelanja[i]);
        }
    }

    static void transaksi(Scanner sc, int idx) {
        String[] pembelianNama = new String[100];
        long[] pembelianHarga = new long[100];
        int[] pembelianJumlah = new int[100];
        int pembelianCount = 0;
        long subtotal = 0;
        boolean lanjut = true;

        System.out.println("\nPelanggan terpilih: " + nama[idx]);

        while (lanjut) {
            System.out.println("""
                               \n=== Menu Barang ===
                               1. Charger Handphone (Rp 45.000 - Rp 60.000)
                               2. Powerbank (Rp 80.000 - Rp 200.000)
                               3. TWS (Rp 40.000 - Rp 150.000)
                               4. Mouse (Rp 50.000 - Rp 100.000)
                               5. Kipas Elektrik Mini (Rp 60.000)
                               """);
            System.out.print("Pilih barang (1-5): ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            long harga = 0;
            String namaBarang = "";

            switch (pilihan) {
                case 1:
                    harga = pilihCharger(sc);
                    namaBarang = "Charger Handphone";
                    break;
                case 2:
                    harga = pilihPowerbank(sc);
                    namaBarang = "Powerbank";
                    break;
                case 3:
                    harga = pilihTws(sc);
                    namaBarang = "TWS";
                    break;
                case 4:
                    harga = pilihMouse(sc);
                    namaBarang = "Mouse";
                    break;
                case 5:
                    harga = 60000;
                    namaBarang = "Kipas Elektrik Mini";
                    System.out.println("Anda Memilih Kipas Elektrik Mini");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    continue;
            }

            System.out.print("Masukkan jumlah: ");
            int jumlah = sc.nextInt();
            sc.nextLine();

            pembelianNama[pembelianCount] = namaBarang;
            pembelianHarga[pembelianCount] = harga;
            pembelianJumlah[pembelianCount] = jumlah;
            pembelianCount++;
            subtotal += harga * jumlah;

            System.out.print("Tambah barang lagi? (Y/N): ");
            String yn = sc.nextLine();
            if (yn.equalsIgnoreCase("N")) {
                lanjut = false;
            }
        }

        double diskon = 0;
        if (subtotal > 250000) {
            if (status[idx].equalsIgnoreCase("IYA")) diskon = subtotal * 0.2;
            else diskon = subtotal * 0.1;
        }

        double totalBayar = subtotal - diskon;
        totalBelanja[idx] = (long) totalBayar;

        System.out.println("\n===== STRUK PEMBAYARAN =====");
        System.out.println("Nama Pelanggan : " + nama[idx]);
        System.out.println("Status Member  : " + status[idx]);
        System.out.println("\nDaftar Pembelian:");
        for (int i = 0; i < pembelianCount; i++) {
            long totalItem = pembelianHarga[i] * pembelianJumlah[i];
            System.out.printf("%d. %s (x%d) - Rp %,d\n", i + 1, pembelianNama[i], pembelianJumlah[i], totalItem);
        }
        System.out.printf("\nSubtotal : Rp %,d\n", subtotal);
        System.out.printf("Diskon   : Rp %,d\n", (long) diskon);
        System.out.printf("Total    : Rp %,d\n", (long) totalBayar);
        System.out.println("==============================");
        System.out.println("Transaksi selesai untuk " + nama[idx] + ".");
    }

    // DETAIL PILIHAN BARANG
    static long pilihCharger(Scanner input) {
        while (true) {
            System.out.println("""
                               Pilih Jenis Charger (A/B/C):
                               A. Type-C (Rp 50.000)
                               B. Mikro USB (Rp 45.000)
                               C. Lightning (Rp 60.000)
                               """);
            System.out.print("Pilihan Anda: ");
            String pilih = input.nextLine().toUpperCase();

            if (pilih.equals("A")) return 50000;
            else if (pilih.equals("B")) return 45000;
            else if (pilih.equals("C")) return 60000;
            else System.out.println("Pilihan tidak valid.");
        }
    }

    static long pilihPowerbank(Scanner input) {
        while (true) {
            System.out.println("""
                               Pilih Jenis Powerbank (A/B/C):
                               A. 10.000 mAh (Rp 80.000)
                               B. 50.000 mAh (Rp 120.000)
                               C. 100.000 mAh (Rp 200.000)
                               """);
            System.out.print("Pilihan Anda: ");
            String pilih = input.nextLine().toUpperCase();

            if (pilih.equals("A")) return 80000;
            else if (pilih.equals("B")) return 120000;
            else if (pilih.equals("C")) return 200000;
            else System.out.println("Pilihan tidak valid.");
        }
    }

    static long pilihTws(Scanner input) {
        while (true) {
            System.out.println("""
                               Pilih Jenis TWS (A/B):
                               A. Wired (Rp 40.000)
                               B. Wireless (Rp 150.000)
                               """);
            System.out.print("Pilihan Anda: ");
            String pilih = input.nextLine().toUpperCase();

            if (pilih.equals("A")) return 40000;
            else if (pilih.equals("B")) return 150000;
            else System.out.println("Pilihan tidak valid.");
        }
    }

    static long pilihMouse(Scanner input) {
        while (true) {
            System.out.println("""
                               Pilih Jenis Mouse (A/B):
                               A. Wired (Rp 50.000)
                               B. Wireless (Rp 100.000)
                               """);
            System.out.print("Pilihan Anda: ");
            String pilih = input.nextLine().toUpperCase();

            if (pilih.equals("A")) return 50000;
            else if (pilih.equals("B")) return 100000;
            else System.out.println("Pilihan tidak valid.");
        }
    }
}
