/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semester_1.Basic_Programming.Semester_1.TEORI_PEMDAS;

/**
 *
 * @author ASUS
 */

public class ArrayReferenceDemo {
    // Method yang memodifikasi elemen pertama dari array
    
    public static void modifyArray(int[] arr) {
        arr[0] = 999; //Mengubah elemen pertama
    }
    
    public static void main(String[] args) {
        int data [] = {1, 2, 3, 4, 5};
        
        System.out.println("Sebelum dipanggil method : ");
        
        for (int i = 0 ; i < data.length ; i++){
            System.out.print(data[i] + " ");
        }
        
        // Memanggil method yang memodifikas array modifyArray (data);
        
        System.out.println("\nSetelah dipanggil method : ");
        for (int i = 0 ; i < data.length ; i++){
            System.out.print(data[i] + " ");
        }
        
    }
}
