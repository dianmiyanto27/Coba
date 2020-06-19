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
public class Abstark extends Komponen {
    @Override
    void anjing(){
        String jenis = "buldog";
        String suara = "gugug";
        String habitat = "Amerika";
        
        System.out.println("Anjing");
        System.out.println("Jenis : "+jenis);
        System.out.println("Suara : "+suara);
        System.out.println("Habitat : "+habitat);
    }
    
    @Override
    void kucing(){
        String jenis = "angora";
        String suara = "meong";
        String habitat = "china";
        
        System.out.println("Kucing");
        System.out.println("Jenis : "+jenis);
        System.out.println("Suara : "+suara);
        System.out.println("Habitat : "+habitat);
    }
}
