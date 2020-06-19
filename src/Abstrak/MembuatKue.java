/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstrak;

/**
 *
 * @author Yunda Budiarti
 */
public class MembuatKue extends Komponen {
    
    @Override
    void bahan_bahan(){
        String bahan1 = "Tepung terigu";
        String bahan2 = "Telur";
        String bahan3 = "Gula";
        
        System.out.println("Bahan-bahan");
        System.out.println("1."+bahan1);
        System.out.println("2."+bahan2);
        System.out.println("3."+bahan3);
    }
    
    @Override
    void peralatan(){
        String alat1 = "Oven";
        String alat2 = "Mixer";
        String alat3 = "Loyang";
        
        System.out.println("Alat-alat");
        System.out.println("1."+alat1);
        System.out.println("2."+alat2);
        System.out.println("3."+alat3);
    }
    
    @Override
    void proses(){
        System.out.println("PROSES PEMBUATAN");
        System.out.println("1. Campur dan aduk bahan dengan mixer");
        System.out.println("2. Masukkan kedalam loyang");
        System.out.println("3. Panggang dan oven sampai matang");
        System.out.println("4. Kelauar kue dan siap disajikan");
    }
 
        
        
}
    

