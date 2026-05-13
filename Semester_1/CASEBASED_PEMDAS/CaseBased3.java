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

class Pelanggan {
    private String nama;
    private String nim;
    private String status;
    private String nomor;
    private long totalBelanja;

    public Pelanggan(String nama, String nim, String status, String nomor) {
        this.nama = nama;
        this.nim = nim;
        this.status = status;
        this.nomor = nomor;
        this.totalBelanja = 0;
    }

    public String getNama() {
        return nama;
    }

    public String getStatus() {
        return status;
    }

    public void tambahBelanja(long jumlah) {
        this.totalBelanja += jumlah;
    }

    public void tampilkanData() {
        System.out.println("Nama          : " + nama);
        System.out.println("NIM           : " + nim);
        System.out.println("Status Member : " + status);
        System.out.println("Nomor Telepon : " + nomor);
        System.out.println("Total Belanja : Rp " + totalBelanja);
    }
}

class Barang {
    private String nama;
    private long harga;
    private int jumlah;

    public Barang(String nama, long harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public long getTotal() {
        return harga * jumlah;
    }

    public String getDeskripsi() {
        return nama + " (x" + jumlah + ") - Rp " + getTotal();
    }
}

class Transaksi {
    private Pelanggan pelanggan;
    private Barang[] listBarang = new Barang[100];
    private int indexBarang = 0;
    private long subtotal = 0;

    public Transaksi(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public void tambahBarang(Barang b) {
        if (indexBarang < listBarang.length) {
            listBarang[indexBarang] = b;
            indexBarang++;
            subtotal += b.getTotal();
        }
    }

    public long hitungDiskon() {
        if (subtotal > 250000) {
            if (pelanggan.getStatus().equalsIgnoreCase("IYA")) {
                return (long) (subtotal * 0.2);
            } else {
                return (long) (subtotal * 0.1);
            }
        }
        return 0;
    }

    public void selesaikanTransaksi() {
        long diskon = hitungDiskon();
        long total = subtotal - diskon;
        pelanggan.tambahBelanja(total);

        System.out.println("\n===== STRUK PEMBAYARAN =====");
        System.out.println("Nama Pelanggan : " + pelanggan.getNama());
        System.out.println("Status Member  : " + pelanggan.getStatus());
        System.out.println("\nDaftar Pembelian:");

        for (int i = 0; i < indexBarang; i++) {
            System.out.println(listBarang[i].getDeskripsi());
        }

        System.out.println("\nSubtotal : Rp " + subtotal);
        System.out.println("Diskon   : Rp " + diskon);
        System.out.println("Total    : Rp " + total);
        System.out.println("==============================");
    }
}

class MenuBarang {
    public static Barang pilihBarang(Scanner sc) {
        System.out.println("""
                === Menu Barang ===
                1. Charger Handphone
                2. Powerbank
                3. TWS
                4. Mouse
                5. Kipas Elektrik Mini
                """);

        System.out.print("Pilih barang: ");
        int pilih = sc.nextInt();
        sc.nextLine();

        String nama = "";
        long harga = 0;

        switch (pilih) {
            case 1 -> {
                System.out.println("""
                        Pilih Jenis Charger:
                        A. Type-C (Rp 50.000)
                        B. Mikro USB (Rp 45.000)
                        C. Lightning (Rp 60.000)
                        """);
                String c = sc.nextLine().toUpperCase();
                harga = switch (c) {
                    case "A" -> 50000;
                    case "B" -> 45000;
                    case "C" -> 60000;
                    default -> 0;
                };
                nama = "Charger Handphone";
            }
            case 2 -> {
                System.out.println("""
                        Pilih Powerbank:
                        A. 10.000 mAh (Rp 80.000)
                        B. 50.000 mAh (Rp 120.000)
                        C. 100.000 mAh (Rp 200.000)
                        """);
                String p = sc.nextLine().toUpperCase();
                harga = switch (p) {
                    case "A" -> 80000;
                    case "B" -> 120000;
                    case "C" -> 200000;
                    default -> 0;
                };
                nama = "Powerbank";
            }
            case 3 -> {
                System.out.println("""
                        Pilih TWS:
                        A. Wired (Rp 40.000)
                        B. Wireless (Rp 150.000)
                        """);
                String t = sc.nextLine().toUpperCase();
                harga = t.equals("A") ? 40000 : 150000;
                nama = "TWS";
            }
            case 4 -> {
                System.out.println("""
                        Pilih Mouse:
                        A. Wired (Rp 50.000)
                        B. Wireless (Rp 100.000)
                        """);
                String m = sc.nextLine().toUpperCase();
                harga = m.equals("A") ? 50000 : 100000;
                nama = "Mouse";
            }
            case 5 -> {
                nama = "Kipas Elektrik Mini";
                harga = 60000;
            }
            default -> System.out.println("Pilihan tidak valid.");
        }

        System.out.print("Jumlah: ");
        int j = sc.nextInt();
        sc.nextLine();

        return new Barang(nama, harga, j);
    }
}

public class CaseBased3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pelanggan[] pelangganList = new Pelanggan[100];
        int jumlahPelanggan = 0;

        System.out.print("Masukkan jumlah pelanggan: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData pelanggan ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = sc.nextLine();

            System.out.print("NIM: ");
            String nim = sc.nextLine();

            String status;
            while (true) {
                System.out.print("STATUS MEMBER (IYA/TIDAK): ");
                status = sc.nextLine().toUpperCase();
                if (status.equals("IYA") || status.equals("TIDAK")) break;
                System.out.println("Input tidak valid.");
            }

            System.out.print("Nomor Telepon: ");
            String nomor = sc.nextLine();

            pelangganList[jumlahPelanggan] = new Pelanggan(nama, nim, status, nomor);
            jumlahPelanggan++;
        }

        boolean lanjut = true;
        while (lanjut) {
            System.out.println("\n=== Daftar Pelanggan ===");
            for (int i = 0; i < jumlahPelanggan; i++) {
                System.out.println((i + 1) + ". " + pelangganList[i].getNama() +
                        " - Member: " + pelangganList[i].getStatus());
            }

            System.out.print("Pilih pelanggan: ");
            int pilih = sc.nextInt();
            sc.nextLine();

            if (pilih < 1 || pilih > jumlahPelanggan) {
                System.out.println("Pilihan tidak valid.");
                continue;
            }

            Pelanggan p = pelangganList[pilih - 1];
            Transaksi t = new Transaksi(p);

            boolean tambah = true;
            while (tambah) {
                Barang b = MenuBarang.pilihBarang(sc);
                t.tambahBarang(b);

                System.out.print("Tambah barang lagi? (Y/N): ");
                String yn = sc.nextLine();
                tambah = yn.equalsIgnoreCase("Y");
            }

            t.selesaikanTransaksi();

            System.out.print("Lanjut pelanggan lain? (Y/N): ");
            String yn = sc.nextLine();
            lanjut = yn.equalsIgnoreCase("Y");
        }

        System.out.println("\n=== REKAP SEMUA PELANGGAN ===");
        for (int i = 0; i < jumlahPelanggan; i++) {
            System.out.println("\nPelanggan ke-" + (i + 1));
            pelangganList[i].tampilkanData();
        }

        sc.close();
    }
}
