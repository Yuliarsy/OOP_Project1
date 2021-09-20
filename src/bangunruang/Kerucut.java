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
public class Kerucut {
   //atribut
    public int r;
    public int tinggi;
    public int sisimiring;
    
    //methods
    public void hitungVol(){
        double volume  = 0.3 * 3.14 * tinggi * Math.pow(r,2);
        System.out.println("Volume kerucut: "+volume);
    }
    
    public void hitungSelimut(){
        double selimut = 3.14*r*sisimiring;
        System.out.println("Luas Selimut Kerucut: "+selimut);
    }  

    void hitungselimut() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
