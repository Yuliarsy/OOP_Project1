/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author Yulia Rakhmah
 */
public class Tabung {
    //atribut
    public int r;
    public int tinggi;
    
    //methods
    public void hitungVol(){
        double volume  = 3.14 * tinggi * Math.pow(r,2);
        System.out.println("Volume Tabung: "+volume);
    }
    
    public void hitungSelimut(){
        double selimut = 2*3.14*r*tinggi;
        System.out.println("Luas Selimut Tabung: "+selimut);
    }
}
