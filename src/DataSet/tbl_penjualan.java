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
public class tbl_penjualan {
    private ArrayList <Integer> id_pjl;
    private ArrayList <String> email;
    private ArrayList <Integer> tgl;
    
    public tbl_penjualan (){
        id_pjl= new ArrayList <Integer>();
        email = new ArrayList <String>();
        tgl= new ArrayList <Integer>();
    };
    
    
    public void insertid_pjl(Integer isi){
    this.id_pjl.add(isi);
    }
    
    public ArrayList <Integer> getRecordid_pjl(){
        return this.id_pjl;
    }
    
    public void insertemail(String isi){
    this.email.add(isi);
    }
    
    public ArrayList <String> getRecoremail(){
        return this.email;
    }
    
    public void inserttgl(int isi){
    this.tgl.add(isi);
    }
    
    public ArrayList <Integer> getRecordtgl(){
        return this.tgl;
    }
}    

