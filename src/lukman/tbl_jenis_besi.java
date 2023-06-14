/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lukman;

/**
 *
 * @author User
 */
public class tbl_jenis_besi {
     private int kode_jenis;
     
     public tbl_jenis_besi (int kode_jenis){
     this.kode_jenis=kode_jenis;
     }
     
     public int getkode_jenis(){
         return kode_jenis;
     }
     
     public void setkode_jenis(int kode_jenis){
         this.kode_jenis=kode_jenis;
     }
}
     
