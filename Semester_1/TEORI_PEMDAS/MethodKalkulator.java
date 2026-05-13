/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semester_1.Basic_Programming.Semester_1.TEORI_PEMDAS;

/**
 *
 * @author ASUS
 */


public class MethodKalkulator {
    int t = 100;
    static int r = 10;
    
    public static void main(String[] args) {
        
        int v = 102;
        
        System.out.println(r + v);
        
        int hasil = Penjumlahan(5,10);
        System.out.println("Hasil Penjumlahan = " + hasil);
        
        int hasil1 = Pengurangan(10,2);
        System.out.println("Hasil Pengurangan = " + hasil1);
        
        Perkalian();
        
        Pembagian();
        
        
//        System.out.println("-----------------------");
//                int hasil = Pengurangan(
//                        Penjumlahan(4, 10),   // (4 + 10)
//                        Perkalian(6, 10)      // (6 * 10)
//                    );
//        System.out.println(Pengurangan(Penjumlahan(4,10), Perkalian(6,10)));
    }
    
    
    static int Penjumlahan(int a , int b){
        int c = a + b;
        return c;
    }
    
    static int Pengurangan(int a , int b){
        int c = a - b;
        return c;
    }
    
    static void Perkalian(){
        int c = 10 * 6;
        
        System.out.println("Hasil Perkalian : " + c);
    }
    
    static void Pembagian(){
        double f = ((double)10/(double)7);
        
        System.out.printf("%s %.2f","Hasil Pembagian : " , f,"\n");
    }
    
}