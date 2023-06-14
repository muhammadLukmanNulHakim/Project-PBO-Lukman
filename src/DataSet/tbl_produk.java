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
public class tbl_produk {
    private ArrayList <Integer> kode_jenis;
    private ArrayList <Integer> kode_brg;
    private ArrayList <Integer> stok;
    private ArrayList <Integer> ukuran;
    private ArrayList <Integer> harga;
    
    public tbl_produk (){
        kode_jenis= new ArrayList <Integer>();
        kode_brg= new ArrayList <Integer>();
        stok = new ArrayList <Integer>();
        ukuran = new ArrayList <Integer>();
        harga= new ArrayList <Integer>();
    };
    
    
    public void insertkode_jenis(Integer isi){
    this.kode_jenis.add(isi);
    }
    
    public ArrayList <Integer> getRecordkode_jenis(){
        return this.kode_jenis;
    }
    
    public void insertkode_brg(Integer isi){
    this.kode_brg.add(isi);
    }
    
    public ArrayList <Integer> getRecordkode_brg(){
        return this.kode_brg;
    }
    
    public void insertstok(Integer isi){
    this.stok.add(isi);
    }
    
    public ArrayList <Integer> getRecordstok(){
        return this.stok;
    }
    
    public void insertukuran(Integer isi){
    this.ukuran.add(isi);
    }
    
    public ArrayList <Integer> getRecordukuran(){
        return this.ukuran;
    }
   
    public void insertharga(Integer isi){
    this.harga.add(isi);
    }
    
    public ArrayList <Integer> getRecordharga(){
        return this.harga;
    }
}

