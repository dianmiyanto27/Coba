/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binatang;

/**
 *
 * @author Yunda Budiarti
 */
public class Bebek implements Interface {
    
    @Override
    
    public void j(){
        System.out.println("Bebek");
        
        System.out.println("Jenis : "+jenis);
        
    }
    @Override
    public void s(){
        System.out.println("Suara : "+suara);
        
    }
    @Override
    public void h(){
        System.out.println("Habitat : "+habitat);
}
}
