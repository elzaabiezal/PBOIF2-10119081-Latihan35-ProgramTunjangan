/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg1011081.latihan35.programtunjangan;

/**
 *
 * @author Elza Abiezal
 * NAMA     : Muhammad Elza Abiezal
 * KELAS    : IF2
 * NIM      : 10119081
 * Deskripsi: Program Tunjangan
 */
public class Gaji {

    double gaji;
    String status;
    
    
     public double hitungTunjangan () {
        double tunjangan;
        if (status.equals("menikah") || status.equals("Menikah")) {
            tunjangan = 0.35 * gaji;
        } else {
            tunjangan = 0;
        }
        return tunjangan;
     }
     
     public double hitungTotalGaji() {
         return gaji + hitungTunjangan();
     }
}

