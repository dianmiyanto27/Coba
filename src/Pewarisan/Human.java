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
public class Human {
    private String nama, alamat, no_hp;
    
    public Human(){
        
    }
    public Human(String nama, String alamat, String no_hp){
        this.nama = nama;
        this.alamat = alamat;
        this.no_hp = no_hp;
        
    }
    public String getNama(){
        return nama;
        
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
        
    }
    public String getNo_hp(){
        return no_hp;
    }
    public void setNo_hp(String no_hp){
        this.no_hp = no_hp;
    }
    public String cetak(){
        return "Nama : "+this.nama+"\n"+"Alamat : "+this.alamat+"\n"+"No HP : "+this.no_hp;
    }
}
