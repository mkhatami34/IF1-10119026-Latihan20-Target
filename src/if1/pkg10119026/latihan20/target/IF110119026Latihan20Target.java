/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan20.target;

import java.util.Scanner;

/**
 *
 * @author Asus
 * NAMA     : Muhammad Khatami
 * KELAS    : PBO
 * NIM      : 10119026
 * Deskripsi Program : Program ini berisi program untuk menampilkan program
 *                      saldo target
 */
public class IF110119026Latihan20Target {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldoAwal;
        double bunga;
        int saldoTarget;
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Perhitungan lama tabungan sampai mencapai saldo target.");
        System.out.print("Saldo awal :");
        saldoAwal = scan.nextInt();
        System.out.print("Bulan/Bulan :");
        bunga = scan.nextInt();
        System.out.print("Saldo target :");
        saldoTarget = scan.nextInt();
    }
    
}
