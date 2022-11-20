/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chintia_uts_strukturdata;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class NO3 {
    public static void main(String[] args) {
            List<Mahasiswa> MahasiswaList = new ArrayList<>();
        MahasiswaList.add(new Mahasiswa(2307, "CHINTIA PUTRI SEDAYU", "TIFRM22A", 191122));
        MahasiswaList.add(new Mahasiswa(1212, "DAMAYANTI EKA PUTRI", "TIFRM22A", 191122));
        MahasiswaList.add(new Mahasiswa(1009, "MUAMAR", "TIFRM22A", 191122));
        MahasiswaList.add(new Mahasiswa(3016, "ADITYA RAMDHANI", "TIFRM22A", 191122));
        MahasiswaList.add(new Mahasiswa(2456, "WILLIAM PRADANA PUTRA", "TIFRM22A", 191122));

        MahasiswaList.forEach(Mahasiswa -> System.out.println(Mahasiswa.toString()));
        System.out.println("Panjang Data Mahasiswa -> " + MahasiswaList.size());
        MahasiswaList.remove(0);

        MahasiswaList.forEach(Mahasiswa -> System.out.println(Mahasiswa.toString()));
        System.out.println("Panjang Data Mahasiswa -> " + MahasiswaList.size()); 
         System.out.println("=========== CHINTIA PUTRI SEDAYU ===========");
    }

}



