/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semester_1.Basic_Programming.Semester_1.PRAKTIKUM_PEMDAS.Tugas3;

/**
 *
 * @author ASUS
 */

public class Tugas3_2 {
    public static void main(String[] args) {
        
        
        //Huruf R
        for (int i = 1 ; i <= 9 ; i++){
            for (int j = 1 ; j<= 9 ; j++ ){
              int mid = 9/2;
                if( i == 1 
                 || j == 1 
                 || i == mid
                 || (j == 9 -1 && i > 1 && i < mid)
                 || (i > mid && j == i)){
                    System.out.print("R");
                }else {
                    System.out.print(" ");
                }
            }System.out.println("");
        }
        
        System.out.println("");
        
        //Huruf O
        for (int i = 1 ; i <= 9 ; i++){
            for (int j = 1 ; j<= 9 ; j++ ){
                if (i == 1
                  || j == 1
                  || i == 9
                  || j == 9 ){
                    System.out.print("O");
                } else{
                    System.out.print(" ");
                }
            }System.out.println("");
        }
        
        //Huruf G
        for (int i = 1 ; i <= 9 ; i++){
            for (int j = 1 ; j<= 9 ; j++ ){
                int mid = 9/2;
                if( i == 1
                 || j == 1
                 || i == 9
                 || i == mid && j > 2 
                 || j == 9 && i >= 5
                 || j == 9 && i == 2){
                    System.out.print("G");
                }else {
                    System.out.print(" ");
                }
            }System.out.println("");
        }
    }
    
}