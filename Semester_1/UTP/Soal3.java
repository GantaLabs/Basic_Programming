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

public class Soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] energi = new int[n];
        for (int i = 0; i < n; i++) {
            energi[i] = sc.nextInt();
        }
        
        int maxSum = energi[0];
        int JumlahNew = 0;
        int start = 0, end = 0, startTemp = 0;

        for (int i = 0; i < n; i++) {
            JumlahNew += energi[i];
            
            // Jika JumlahNew lebih besar, update jalur terbaik
            if (JumlahNew > maxSum || 
               (JumlahNew == maxSum && (i - startTemp < end - start))) {
                maxSum = JumlahNew;
                start = startTemp;
                end = i;
            }

            // Kalau JumlahNew negatif, reset
            if (JumlahNew < 0) {
                JumlahNew = 0;
                startTemp = i + 1;
            }
        }

        // Kasus semua negatif
        if (maxSum < 0) {
            int maxValue = energi[0];
            int idx = 0;
            for (int i = 1; i < n; i++) {
                if (energi[i] > maxValue) {
                    maxValue = energi[i];
                    idx = i;
                }
            }
            maxSum = maxValue;
            start = end = idx;
        }

        System.out.println("Kekuatan maksimum = " + maxSum);
        System.out.print("Jalur energi = ");
        for (int i = start; i <= end; i++) {
            System.out.print(energi[i] + (i < end ? " " : ""));
        }
        System.out.println();
        
        sc.close();
    }
}
