/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Yunda Budiarti
 */
public class Mobil implements Komponen {
    
    @Override
    public void mesin(){
        System.out.println("Kecepatan mobil adalah : "+kecepatan);
        
    }
    @Override
    public void desain(){
        System.out.println("Model mobil : "+model);
        
    }
}
