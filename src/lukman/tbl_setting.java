/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lukman;

/**
 *
 * @author User
 */
public class tbl_setting {
    private String nama_pt;
    private int nohp;
    private String alamat;
    
    public tbl_setting (String nama_pt, int nohp, String alamat){ 
        this.nama_pt=nama_pt;
        this.nohp=nohp;
        this.alamat=alamat;
     }

     public String getnama_pt(){
         return nama_pt;
     }
     
     public void setnma_pt(String nama_pt) {
         this.nama_pt = nama_pt;
     }
     
      public int getnohp(){
         return nohp;
     }
     
     public void setnohp(int nohp) {
         this.nohp = nohp;
     }
     
      public String getalamat(){
         return alamat;
     }
      
      
     
     public void setnohp(String alamat) {
         this.alamat = alamat;
     }
}
     
     
