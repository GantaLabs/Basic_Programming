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

public class BelajarString {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat : ");
        String kalimat = sc.nextLine();
        
        String Kata[] = kalimat.split(" ");

        int jumlahKata = Kata.length;
        System.out.println("Jumlah Kata : " + jumlahKata);
        
        StringBuilder hasil = new StringBuilder();
        
       for (int i = 0; i < kalimat.length(); i++) {
            char c = kalimat.charAt(i);

            if (c =='a' || c == 'i' || c == 'u' || c == 'e') {
                hasil.append('o');
            } else if (c =='A' || c == 'I' || c == 'U' || c == 'E'){
                hasil.append('O');
            } else {
                hasil.append(c);
            }
        }

        System.out.println(hasil.toString());
                
        sc.close();
            }
        }
    