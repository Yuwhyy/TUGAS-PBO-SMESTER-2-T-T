/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum1;

/**
 *
 * @author Yuwan Ketang
 */
public class DemoNilai {
    public static void main(String []args){
        Nilai l = new Nilai();
        
        l.NIM = "2510631170056";
        l.Nama = "Yuwan Ranu Pratama";
        l.NilaiAbsen = 99.9;
        l.NilaiTugas = 99.8;
        l.NilaiUTS = 99.9;
        l.NilaiUAS = 98.8;
        
        l.Nilai();
        
        l.CetakNilai();
        
    }
    
}
