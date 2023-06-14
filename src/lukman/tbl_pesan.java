/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lukman;

/**
 *
 * @author User
 */
public class tbl_pesan {
    private int id_psn;
    private int id_pjl;
    private int kode_brg;
    private int harga;
    private int jumlah;
    private int total;
    
    public tbl_pesan (int id_psn, int id_pjl, int kode_brg, int harga, int jumlah, int total) {
        this.id_psn=id_psn;
        this.id_pjl=id_pjl;
        this.kode_brg=kode_brg;
        this.harga=harga;
        this.jumlah=jumlah;
        this.total=total;
    }
    
    public int getid_psn(){
        return id_psn;
    }

    public void setid_psn(int id_psn){
        this.id_psn = id_psn;
    }
    
    public int getid_pjl(){
        return id_pjl;
    }

    public void setid_pjl(int id_pjl){
        this.id_pjl = id_pjl;
    }
    
    public int getkode_brg(){
        return kode_brg;
    }

    public void setkode_brg(int kode_brg){
        this.kode_brg = kode_brg;
    }
    
    public int getharga(){
        return harga;
    }

    public void setharga(int harga){
        this.harga = harga;
    }
    
    public int getjumlah(){
        return jumlah;
    }

    public void setjumlah(int jumlah){
        this.jumlah = jumlah;
    }
    
    public int gettotal(){
        return total;
    }

    public void settotal(int total){
        this.total = total;
    }
}