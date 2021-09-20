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
public class Bola {
    
    //atribut
    public int jarijari;
    
    //methods
    public void hitungVol(){
        double volume  = (4/3) *3.14* Math.pow(jarijari, 3);
        System.out.println("Volume Bola: "+volume);
    }
    
    public void hitungselimut(){
        double selimut = Math.pow(jarijari,2) * 4* 3.14;
        System.out.println("Luas Selimut Bola: "+selimut);
    }
    
    
    
    
}
