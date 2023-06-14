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
public class tbl_jenis_besi {
    private ArrayList <Integer> kode_jenis;
    
    
    public tbl_jenis_besi (){
        kode_jenis= new ArrayList <Integer>();
    }
    
    public void insertkode_jenis(Integer isi){
    this.kode_jenis.add(isi);
    }
    
    public ArrayList <Integer> getRecordkode_jenis(){
        return this.kode_jenis;
    }
}   

