/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum1;

/**
 *
 * @author Yuwan Ketang
 */
public class Nilai {
    String NIM;
    String Nama;
    Double NilaiAbsen;
    Double NilaiTugas;
    Double NilaiUTS;
    Double NilaiUAS;
    Double NilaiAkhir;
    
    void Nilai(){
        NilaiAkhir = (0.1*NilaiAbsen) + (0.2*NilaiTugas) + (0.3*NilaiUTS) + (0.4*NilaiUAS);
    }
    
    void CetakNilai(){
        System.out.println("NIM     :" +NIM);
        System.out.println("Nama     :" +Nama);
        System.out.println("NilaiAbsen     :" +NilaiAbsen);
        System.out.println("Nilai Tugas     :" +NilaiTugas);
        System.out.println("Nilai UTS     :" +NilaiUTS);
        System.out.println("Nilai UAS     :" +NilaiUAS);
        System.out.println("Nilai Akhir     :" +NilaiAkhir);
    }
}
