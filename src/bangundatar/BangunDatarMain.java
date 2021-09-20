/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author Yulia Rakhmah
 */
public class BangunDatarMain {
    public static void main(String[] args) {
        Persegipanjang pp = new Persegipanjang();
        pp.panjang = 25;
        pp.lebar = 38;
        pp.hitungLuas();
        pp.hitungKeliling();
        
        System.out.println("=========================================");
        
        Persegi p = new Persegi();
        p.sisi = 10;
        p.namapersegi = "A";
        p.hitungLuas();
        p.hitungKeliling();
        
        p.sisi = 15;
        p.namapersegi = "B";
        p.hitungLuas();
        p.hitungKeliling();
        
        System.out.println("=========================================");
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.jarijari = 25;
        lingkaran.namalingkaran = "A";
        lingkaran.hitungLuas();
        lingkaran.hitungKeliling();
        
        lingkaran.jarijari = 37;
        lingkaran.namalingkaran = "B";
        lingkaran.hitungLuas();
        lingkaran.hitungKeliling();
    }
}
