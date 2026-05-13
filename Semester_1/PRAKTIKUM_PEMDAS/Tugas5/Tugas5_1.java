/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semester_1.Basic_Programming.Semester_1.PRAKTIKUM_PEMDAS.Tugas5;

/**
 *
 * @author ASUS
 */

import java.util.Scanner;

public class Tugas5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;

        do {
            System.out.println("Program Penghitung Kombinasi dan Permutasi");
            System.out.println("1. Menghitung Permutasi");
            System.out.println("2. Mengitung Kombinasi");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();

            if (menu == 3) {
                System.out.println("Program selesai. Terima kasih!");
                break;
            }

            if (menu < 1 || menu > 3) {
                System.out.println("Pilihan tidak valid!\n");
                continue;
            }

            System.out.print("Masukkan nilai n : ");
            int n = input.nextInt();
            System.out.print("Masukkan nilai r : ");
            int r = input.nextInt();

            if (r > n) {
                System.out.println("Error: nilai r tidak boleh lebih besar dari n!\n");
                continue;
            }

            if (menu == 1) {
                System.out.println("        n!");
                System.out.println("nPr = ------- = " + hitungPermutasi(n, r));
                System.out.println("      (n - r)!");
            } else {
                System.out.println("            n!");
                System.out.println("nCr = -------------- = " + hitungKombinasi(n, r));
                System.out.println("       (n - r)! x r!");
            }

            System.out.println();

            input.close();

        } while (menu != 3);
    }

    // faktorial
    public static int faktorial(int x) {
        int hasil = 1;
        for (int i = 2; i <= x; i++) {
            hasil *= i;
        }
        return hasil;
    }

    // Permutasi
    public static int hitungPermutasi(int n, int r) {
        return faktorial(n) / faktorial(n - r);
    }

    // Fungsi menghitung Kombinasi
    public static int hitungKombinasi(int n, int r) {
        return faktorial(n) / (faktorial(r) * faktorial(n - r));
        
    }
}
