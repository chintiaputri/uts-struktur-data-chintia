/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chintia_uts_strukturdata;

import java.util.Arrays;
import java.util.Scanner;
import javafx.scene.chart.BubbleChart;

/**
 *
 * @author Asus
 */
public class NO2 {
     public static void main(String[]args){
         int []angka= new int[10];
         Scanner valueArray = new Scanner(System.in);
         System.out.println("Masukan Isi Dari Array");
         for (int i = 0; i < angka.length; i++) {
             System.out.print("Masuka Index ke - " + (i+1)+":");
             angka[i]=valueArray.nextInt();
         }
        bubblesort(angka);
             System.out.println("Isi Array : " + Arrays.toString(angka));
         
     }
     public static void bubblesort(int array[]){
         int size = array.length;
         for (int i = 0; i < size-1; i++) {
             for (int j = 0; j < size-i-1; j++) {
                 if (array[j] > array[j + 1]) {
                     int temp = array[j];
                     array[j]=array[j+1];
                     array[j+1]=temp;
                     
                 }
             }
             
         }
     }
}
