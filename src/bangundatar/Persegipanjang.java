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
public class Persegipanjang {
    
    //atribut
    public int panjang;
    public int lebar;
    
    
    //methods
    public void hitungLuas(){
        int hasil = panjang * lebar;
        System.out.println("Luas Persegi Panjang:"+ hasil);
    }

    public void hitungKeliling(){
        int hasil = 2*(panjang + lebar);
        System.out.println("Keliling Persegi Panjang:"+ hasil);
    }
}
