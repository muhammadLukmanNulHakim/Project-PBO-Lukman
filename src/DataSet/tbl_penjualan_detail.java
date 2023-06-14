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
public class tbl_penjualan_detail {
     private ArrayList <Integer> id_pjl;
    private ArrayList <Integer> id_pjl_detail;
    private ArrayList <Integer> kode_brg;
    private ArrayList <Integer> harga;
    private ArrayList <Integer> jumlah;
    private ArrayList <Integer> total;
    
    public tbl_penjualan_detail (){
        id_pjl= new ArrayList <Integer>();
        id_pjl_detail= new ArrayList <Integer>();
        kode_brg = new ArrayList <Integer>();
        harga = new ArrayList <Integer>();
        jumlah= new ArrayList <Integer>();
        total= new ArrayList <Integer>();
    };
    
    
    public void insertid_pjl(Integer isi){
    this.id_pjl.add(isi);
    }
    
    public ArrayList <Integer> getRecordid_pjl(){
        return this.id_pjl;
    }
    
    public void insertid_pjl_detail(Integer isi){
    this.id_pjl_detail.add(isi);
    }
    
    public ArrayList <Integer> getRecordid_pjl_detail(){
        return this.id_pjl_detail;
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
