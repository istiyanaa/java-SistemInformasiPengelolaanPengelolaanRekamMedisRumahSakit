/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package istiyana2110010132;

/**
 *
 * @author ASUS
 */
public class ruang {
    private String idruang;
    private String namaruang;
    private String idperawat;
    
     public ruang(String idruang, String namaruang, String idperawat){
        this.idruang = idruang;
        this.namaruang = namaruang;
        this.idperawat = idperawat;
    }
        
    public void setIdRuang(String idruang){
        this.idruang=idruang;
    }
    
    public String getIdRuang(){
        return this.idruang;
    }
    
    public void setNamaRuang(String namaruang){
        this.namaruang=namaruang;
    }
    
    public String getNamaRuang(){
        return this.namaruang;
    }
    
    public void setIdPerawat(String idperawat) {
        this.idperawat=idperawat;
    }
    
    public String getIdPerawat(){
        return this.idperawat;
    }
    
     public void display(){
        System.out.println("ID Ruang: " + idruang);
        System.out.println("Nama Ruang: " + namaruang);
        System.out.println("ID Perawat: " + idperawat);
    }
}
