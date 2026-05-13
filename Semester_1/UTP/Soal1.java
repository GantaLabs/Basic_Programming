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

public class Soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int NilaiAwal = input.nextInt();
        int[] Arr = new int[NilaiAwal];
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = input.nextInt();
        }

        boolean kritis = false;
        boolean error = false;
        boolean aktif = false;

        for (int i = 0; i < Arr.length; i++) {
            int SisaDariI = Arr.length - i;

            if (SisaDariI >= 5) {
                if (Arr[i] > 50 && Arr[i+1] > 50 && Arr[i+2] > 50 && Arr[i+3] > 50 && Arr[i+4] > 50) {
                    kritis = true;
                    break;
                }
                if ((Arr[i] > 50 && Arr[i+1] <= 50 && Arr[i+2] > 50 && Arr[i+3] <= 50 && Arr[i+4] > 50)
                        || (Arr[i] <= 50 && Arr[i+1] > 50 && Arr[i+2] <= 50 && Arr[i+3] > 50 && Arr[i+4] <= 50)) {
                    error = true;
                }
            }

            if (!aktif && SisaDariI >= 3) {
                if (Arr[i] > 50 && Arr[i+1] > 50 && Arr[i+2] > 50) {
                    aktif = true;
                }
            }
        }

        if (kritis) {
            System.out.println("Alarm kritis!");
        } else if (error) {
            System.out.println("Alarm error!");
        } else if (aktif) {
            System.out.println("Alarm aktif!");
        } else {
            System.out.println("Alarm tidak aktif.");
        }

        input.close();
    }
}


