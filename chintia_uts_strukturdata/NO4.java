/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chintia_uts_strukturdata;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class NO4 {
    
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        
        String id,name,kelas,tglMasuk,def=" Masukan ";
        
        System.out.println("================================");
        System.out.print(def + "ID : ");
        id = scan.nextLine();
        System.out.print(def + "Nama : ");
        name=scan.nextLine();
         System.out.print(def + "Kelas : ");
        kelas=scan.nextLine();
    System.out.print(def + "Tgl Masuk : ");
        tglMasuk=scan.nextLine();
        System.out.println("");
        
        System.out.println("| DATA BIODATA MAHASISWA |");
        System.out.println("+--------------------------------------+");
        System.out.println("ID : "+id); 
        System.out.println("Nama : "+name); 
        System.out.println("Kelas : "+kelas); 
        System.out.println("Tgl Masuk : "+tglMasuk); 
        
   }
           
}
