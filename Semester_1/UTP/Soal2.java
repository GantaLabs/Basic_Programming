/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semester_1.Basic_Programming.Semester_1.UTP;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Soal2 {
    
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        String[] warnaInput = new String[N];
        int[] kodeInput = new int[N];
        
        for (int i = 0; i < N; i++) {
            warnaInput[i] = in.next();
            kodeInput[i] = in.nextInt();
        }
        
        // Langkah 1: kelompokkan warna yang sama
        String[] warna = new String[N]; // maksimal N warna
        int[] kode = new int[N];
        int[] jumlah = new int[N];
        int HitungWarna = 0;
        
        warna[0] = warnaInput[0];
        kode[0] = kodeInput[0];
        jumlah[0] = 1;
        HitungWarna = 1;
        
        for (int i = 1; i < N; i++) {
            if (warnaInput[i].equals(warna[HitungWarna - 1])) {
                jumlah[HitungWarna - 1]++;
            } else {
                warna[HitungWarna] = warnaInput[i];
                kode[HitungWarna] = kodeInput[i];
                jumlah[HitungWarna] = 1;
                HitungWarna++;
            }
        }
        
        // Langkah 2: urutkan berdasarkan kode warna (bubble sort sederhana)
        for (int i = 0; i < HitungWarna - 1; i++) {
            for (int j = i + 1; j < HitungWarna; j++) {
                if (kode[i] > kode[j]) {
                    int tempKode = kode[i];
                    kode[i] = kode[j];
                    kode[j] = tempKode;
                    
                    String tempWarna = warna[i];
                    warna[i] = warna[j];
                    warna[j] = tempWarna;
                    
                    int tempJumlah = jumlah[i];
                    jumlah[i] = jumlah[j];
                    jumlah[j] = tempJumlah;
                }
            }
        }
        
        // Langkah 3: cari jumlah minimum
        int minJumlah = jumlah[0];
        for (int i = 1; i < HitungWarna; i++) {
            if (jumlah[i] < minJumlah) {
                minJumlah = jumlah[i];
            }
        }
        
        // Langkah 4: hitung tinggi total
        int tinggi = minJumlah * HitungWarna;
        System.out.println(tinggi);
        
        // Langkah 5: cetak dari atas (kode terbesar) ke bawah (kode terkecil)
        for (int i = HitungWarna - 1; i >= 0; i--) {
            for (int j = 0; j < minJumlah; j++) {
                System.out.println(warna[i]);
            }
        }

        in.close();
    }
}