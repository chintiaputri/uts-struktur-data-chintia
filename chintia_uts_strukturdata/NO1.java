/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chintia_uts_strukturdata;

/**
 *
 * @author Asus
 */
public class NO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int angka[] = {17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32};
        System.out.println("          Angka Ganjil & Genap ");
        System.out.println("=================================================");
        System.out.println("Genap : ");
        for (int i = 0; i < 15; i++) {
            if (angka[i] % 2 == 0) {
                System.out.print(angka[i] + ",");
            }
        }
        System.out.println();
        System.out.println("Ganjil : ");
        for (int j = 0; j < 15; j++) {
            if (angka[j] % 2 != 0) {
                System.out.print(angka[j] + ",");
            }
        }

    }

}
