/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semester_1.Basic_Programming.Semester_1.TEORI_PEMDAS;

/**
 *
 * @author ASUS
 */

public class TugasArray {
    public static void main(String[] args) {
        
        int matrix1[][] = new int[3][3];
        matrix1[0][0] = 3;
        matrix1[0][1] = 4;
        matrix1[0][2] = 5;
        matrix1[1][0] = 3;
        matrix1[1][1] = 6;
        matrix1[1][2] = 8;
        matrix1[2][0] = 9;
        matrix1[2][1] = 5;
        matrix1[2][2] = 3;
        
        int matrix2[][] = new int[3][3];
        matrix2[0][0] = 1;
        matrix2[0][1] = 2;
        matrix2[0][2] = 3;
        matrix2[1][0] = 6;
        matrix2[1][1] = 5;
        matrix2[1][2] = 4;
        matrix2[2][0] = 2;
        matrix2[2][1] = 8;
        matrix2[2][2] = 6;
        
        // --- Tampil Matriks ---
        System.out.println("Matrix 1:");
           for (int a = 0; a < matrix1.length; a++) {
                for (int b = 0; b < matrix1[a].length; b++) {
                System.out.print(matrix1[a][b] + " "); 
            }   System.out.println();
}

        System.out.println("\nMatrix 2:");
            for (int a = 0; a < matrix2.length; a++) {
                for (int b = 0; b < matrix2[a].length; b++) {
                System.out.print(matrix2[a][b] + " ");
            }   System.out.println();
}
        
        // --- Penjumlahan ---
            System.out.println("\nPenjumlahan Matrix : ");
            for (int a = 0 ; a <= (matrix1.length - 1) ; a++){
                for (int b = 0 ; b <= (matrix2.length - 1) ; b++){
                    
                    int JumlahAB = matrix1[a][b] + matrix2[a][b];
                    System.out.print(JumlahAB + " ");
                }
                System.out.println("");
            }
            
            System.out.println("");
            
        // --- Pengurangan ---
            System.out.println("Pengurangan Matrix : ");
            for (int a = 0 ; a <= (matrix1.length - 1) ; a++){
                for (int b = 0 ; b <= (matrix2.length - 1) ; b++){
                    
                    int KurangAB = matrix1[a][b] - matrix2[a][b];
                    System.out.print(KurangAB + " ");
                }
                System.out.println("");
            }
            
            System.out.println("");
        
        // --- Perkalian Matriks ---
            System.out.println("Perkalian Matrix : ");
                int[][] hasil = new int[3][3];

            for (int i = 0; i < 3; i++) {
                 for (int j = 0; j < 3; j++) {
                    hasil[i][j] = 0;
            for (int k = 0; k < 3; k++) {
                hasil[i][j] += matrix1[i][k] * matrix2[k][j];
            }
                System.out.print(hasil[i][j] + " ");
         }
             System.out.println();
}
            
    }  
}
