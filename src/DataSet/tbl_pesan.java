/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataSet;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class tbl_pesan {
    private ArrayList <Integer> id_psn;
    private ArrayList <Integer> id_pjl;
    private ArrayList <Integer> kode_brg;
    private ArrayList <Integer> harga;
    private ArrayList <Integer> jumlah;
    private ArrayList <Integer> total;
    
    public tbl_pesan (){
        id_psn= new ArrayList <Integer>();
        id_pjl  = new ArrayList <Integer>();
        kode_brg = new ArrayList <Integer>();
        harga = new ArrayList <Integer>();
        jumlah= new ArrayList <Integer>();
        total= new ArrayList <Integer>();
    };
    
    
    public void insertid_psn(Integer isi){
    this.id_psn.add(isi);
    }
    
    public ArrayList <Integer> getRecordid_psn(){
        return this.id_psn;
    }
    
    public void insertid_pjl(Integer isi){
    this.id_pjl.add(isi);
    }
    
    public ArrayList <Integer> getRecordid_pjl(){
        return this.id_pjl;
    }
    
    public void insertkode_brg(Integer isi){
    this.kode_brg.add(isi);
    }
    
    public ArrayList <Integer> getRecordkode_brg(){
        return this.kode_brg;
    }
    
    public void insertharga(Integer isi){
    this.harga.add(isi);
    }
    
    public ArrayList <Integer> getRecordharga(){
        return this.harga;
    }
    
    public void insertjumlah(Integer isi){
    this.jumlah.add(isi);
    }
    
    public ArrayList <Integer> getRecordjumlah(){
        return this.jumlah;
    }
    
    
    public void inserttotal(Integer isi){
    this.total.add(isi);
    }
    
    public ArrayList <Integer> getRecordtotal(){
        return this.total;
    }   
}
