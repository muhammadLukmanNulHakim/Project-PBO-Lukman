/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lukman;

/**
 *
 * @author User
 */
public class tbl_produk {
    private int kode_jenis;
    private int kode_brg;
    private int stok;       
    private int ukuran;
    private int harga;

public tbl_produk (int kode_jenis, int kode_brg, int stok, int ukuran, int harga) {
    this.kode_jenis=kode_jenis;
    this.kode_brg=kode_brg;
    this.stok=stok;
    this.ukuran=ukuran;
}

    public int getkode_jenis() {
        return kode_jenis;
    }

    public void setkode_jenis(int kode_jenis) {
        this.kode_jenis = kode_jenis;
    }

    public int getkode_brg() {
        return kode_brg;
    }

    public void setkode_brg(int kode_brg) {
        this.kode_brg = kode_brg;
    }

    public int getstok() {
        return stok;
    }

    public void setstok(int stok) {
        this.stok = stok;
    }

    public int getukuran() {
        return ukuran;
    }

    public void setukuran(int ukuran) {
        this.ukuran = ukuran;
    }

    public int getharga() {
        return harga;
    }
}
public void setkharga(int harga) {
    this.harga = harga;
}


