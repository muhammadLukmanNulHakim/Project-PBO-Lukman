/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lukman;

/**
 *
 * @author User
 */
    public class tbl_akun {
   private String nama;
   private String alamat;
   private int nohp;
   private String password;
   private String email;

    public tbl_akun(String nama, String alamat, int nohp, String password, String email){ 
        this.nama=nama;
        this.alamat=alamat;
        this.nohp=nohp;
        this.password=password;
        this.email=email;
    }  

    public String getnama(){
        return nama;
    }

    public void setnama(String nama) {
        this.nama=nama;
    }
    
    public String getalamat(){
        return alamat;
    }

    public void setalamat(String alamat) {
        this.alamat=alamat;
    }

    public int getnohp(){
        return nohp;
    }

    public void setnohp(int nohp) {
        this.nohp=nohp;
    }

    public String getpassword(){
        return password;
    }

    public void setpassword(String password) {
        this.password=password;
    }

    public String getemail(){
        return email;
    }
    
    public void setemail(String email) {
        this.email=email;
    }
}