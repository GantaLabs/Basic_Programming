/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
package Semester_1.Basic_Programming.Semester_1.PRAKTIKUM_PEMDAS.Tugas4;

import java.util.*;

public class Tugas4_1 {

    public static void main(String[] args) {

        int Pilihan1;
        int[] a = null;
        boolean Kondisi1 = true;
            
        Scanner input = new Scanner(System.in);

        while(Kondisi1) {
            System.out.println("");
            System.out.print("""
                               Pilihan Menu :
                               1.   Input Data
                               2.   Lihat Data
                               3.   Average
                               4.   Sum
                               5.   Max
                               6.   Min
                               0.   Keluar 
                               Masukkan nilai:""");

            
            Pilihan1 = input.nextInt();
            input.nextLine();

            switch (Pilihan1) {
                case 0: {
                    System.out.println("Anda Keluar Dari Program..");
                    Kondisi1 = false;
                    break;
    
                }
                case 1: {
                    System.out.print("Input Data : ");
                    String nilai = input.nextLine();
                    
                    String [] nilai1 = nilai.trim().split("\\s+");
                    a = new int [nilai1.length];
                    
                    for (int i = 0 ; i < nilai1.length ; i++){
                        a[i] = Integer.parseInt(nilai1[i]);
                    }System.out.println("");
                    break;
                }
                
                case 2 : {
                    if (a == null || a.length == 0){
                        System.out.println("Data tidak ditemukan, Silahkan Masukkan Data!");
                    } else{
                        System.out.println(Arrays.toString(a));
                    } break;
                }
                
                case 3 : {
                    if (a == null || a.length == 0){
                        System.out.println("Data tidak ditemukan, Silahkan Masukkan Data!");
                    } else{
                        double sum = 0;
                        for (int r : a ){
                            sum += r;     
                        }
                        double average = (double) (sum/a.length);
                            System.out.printf("%s %.2f","Average : " , average);
                            System.out.println("");
                    }
                    break;
                }
                
                case 4 : {
                    if (a == null || a.length == 0){
                        System.out.println("Data tidak ditemukan, Silahkan Masukkan Data!");
                    } else{
                        int sum = 0;
                        for (int r : a ){
                            sum += r;     
                        }
                            System.out.printf("%s %d","Sum : " , sum);
                            System.out.println("");
                    }
                    break;
                }
                
                case 5 : {
                    if (a == null || a.length == 0){
                        System.out.println("Data tidak ditemukan, Silahkan Masukkan Data!");
                    } else{
                        int [] temp = Arrays.copyOf(a, a.length);
                        Arrays.sort(temp);
                        int Max = temp[temp.length - 1];
                        
                        System.out.printf("%s %d","Max : " , Max);
                        System.out.println("");
                    }
                    break;
                }
                
                case 6 : {
                    if (a == null || a.length == 0){
                        System.out.println("Data tidak ditemukan, Silahkan Masukkan Data!");
                    } else{
                        int [] temp = Arrays.copyOf(a, a.length);
                        Arrays.sort(temp);
                        int Min = temp[0];
                        
                        System.out.printf("%s %d","Min : " , Min);
                        System.out.println("");
                    }
                    break;
                }
                
                default : {
                    System.out.println("Pilihan Anda Tidak Sesuai, Pilih lagi..");
                }
            }
        }
        input.close();
    }
}