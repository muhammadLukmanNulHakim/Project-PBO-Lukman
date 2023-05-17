/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lukman;

/**
 *
 * @author User
 */
public class tbl_penjualan {
    private int id_jl;
    private String email;
    private int tgl;

    public tbl_penjualan (int id_pjl, String email, int tgl){
        this.id_pjl;
        this. String email;
        this.tgl;
    }

    public int getid_pjl(){
        return id_pjl;
    }

    public void setid_pjl(int id_pjl) {
        this.id_pjl = id_pjl;
    }

    public int getemail(){
        return email;
    }   

    public void setemail(String email) {
        this.email = email;
    }
    public int gettgl(){
        return tgl;
    }

    public void settgl(int tgl) {
        this.tgl = tgl;
    }
}