/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pewarisan;

/**
 *
 * @author Yunda Budiarti
 */
public class Mahasiswa extends Human {
    private String NRP;
    
    public Mahasiswa(){
        
    }
    public Mahasiswa(String NRP, String nama, String alamat, String no_hp){
        super(nama, alamat, no_hp);
        this.NRP = NRP;
    }
    public String getNRP(){
        return NRP;
        
    }
    public void setNRP(String NRP){
        this.NRP = NRP;
    }
    public String cetak(){
        return "Human" 
                + ""+"\n"+super.cetak()+"\n"+"NRP : "+this.NRP;
    }
}
