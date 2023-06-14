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
public class tbl_setting {
    private ArrayList <String> nama_pt;
    private ArrayList <Integer> nohp;
    private ArrayList <String> alamat;
    
    public tbl_setting (){
        nama_pt= new ArrayList <String>();
        nohp= new ArrayList <Integer>();
        alamat = new ArrayList <String>();
    };
    
    
    public void insertnama_pt(String isi){
    this.nama_pt.add(isi);
    }
    
    public ArrayList <String> getRecordnama_pt(){
        return this.nama_pt;
    }
    
    public void insertnohp(Integer isi){
    this.nohp.add(isi);
    }
    
    public ArrayList <Integer> getRecordnohp(){
        return this.nohp;
    }
    
    public void insertalamat(String isi){
    this.alamat.add(isi);
    }
    
    public ArrayList <String> getRecordalamat(){
        return this.alamat;
    }
}

   