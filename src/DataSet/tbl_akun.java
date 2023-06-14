/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataSet;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class tbl_akun {
    private ArrayList <String> nama;
    private ArrayList <String> alamat;
    private ArrayList <Integer> nohp;
    private ArrayList <String> password;
    private ArrayList <String> email;
    
    public tbl_akun (){
        nama= new ArrayList <String>();
        alamat = new ArrayList <String>();
        nohp = new ArrayList <Integer>();
        password = new ArrayList <String>();
        email= new ArrayList <String>();
    };
    
    
    public void insertnama(String isi){
    this.nama.add(isi);
    }
    
    public ArrayList <String> getRecordnama(){
        return this.nama;
    }
    
    public void insertalamat(String isi){
    this.alamat.add(isi);
    }
    
    public ArrayList <String> getRecordalamat(){
        return this.alamat;
    }
    
    public void insertnohp(int isi){
    this.nohp.add(isi);
    }
    
    public ArrayList <Integer> getRecordnohp(){
        return this.nohp;
    }
    
    public void insertpassword(String isi){
    this.password.add(isi);
    }
    
    public ArrayList <String> getRecordpassword(){
        return this.password;
    }
    
    
    public ArrayList <String> getRecordemail(){
        return this.email;
}
    public void insertemail(String isi){
    this.email.add(isi);
}
}