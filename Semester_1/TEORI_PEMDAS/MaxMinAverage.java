/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semester_1.Basic_Programming.Semester_1.TEORI_PEMDAS;

/**
 *
 * @author ASUS
 */

import java.util.Scanner;

public class MaxMinAverage {
    public static void main(String[] args) {
        
        int A,B,C;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai A : ");
        A = input.nextInt();
        
        System.out.print("Masukkan Nilai B : ");
        B = input.nextInt();
        
        System.out.print("Masukkan Nilai C : ");
        C = input.nextInt();
        
        //Statement 1
        if (A < B){
            if (A < C){
                System.out.println("Nilai Minimal = " + A);
            } else {
                System.out.println("Nilai Minimal = " + C);
            }
        } else {
                if (B < C){
                System.out.println("Nilai Minimal = " + B);
            } else {
                System.out.println("Nilai Minimal = " + C);
             }
        }
        
        // Statement 2
                if (A > B){
            if (A > C){
                System.out.println("Nilai Maksimal = " + A);
            } else {
                System.out.println("Nilai Maksimal = " + C);
            }
        } else {
                if (B > C){
                System.out.println("Nilai Maksimal = " + B);
            } else {
                System.out.println("Nilai Maksimal = " + C);
             }
        }
                
          //Mean
          System.out.println("Rata - Rata = " + ((double)(A+B+C)/3));
          
          input.close();
        }
    }


      
