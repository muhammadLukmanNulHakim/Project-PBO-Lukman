/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lukman;

/**
 *
 * @author User
 */
public class tbl_penjualan_detail {
    private int id_pjl;
    private int id_pjl_detail;
    private int kode_brg;
    private int harga;
    private int jumlah;
    private int total;
    
    public tbl_penjualan_detail (int id_pjl, int id_pjl_detail, int kode_brg, int harga, int jumlah, int total) {
        this.id_pjl=id_pjl;
        this.id_pjl_detail=id_pjl_detail;
        this.kode_brg=kode_brg;
        this.harga=harga;
        this.jumlah=jumlah;
        this.total=total;
    }
    
    public int getid_pjl() {
        return id_pjl;
    }
    

    public void setid_pjl(int id_pjl) {
        this.id_pjl = id_pjl;
    }
    
    public int getid_pjl_detail() {
        return id_pjl_detail;
    }
    

    public void setid_pjl_detail(int id_pjl_detail) {
        this.id_pjl_detail = id_pjl_detail;
    }
    
    public int getkode_brg() {
        return kode_brg;
    }
    

    public void setkode_brg(int kode_brg) {
        this.kode_brg = kode_brg;
    }
    
    public int getharga() {
        return harga;
    }
    

    public void setharga(int harga) {
        this.harga = harga;
    }
    
    public int getjumlah() {
        return jumlah;
    }
    

    public void setjumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    public int gettotal() {
        return total;
    }
    

    public void settotal(int total) {
        this.total = total;
    }
}