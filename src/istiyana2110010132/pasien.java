/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package istiyana2110010132;

/**
 *
 * @author ASUS
 */
public class pasien {
    private String idpasien;
    private String namapasien;
    private int umur;
    private String jeniskelamin;
    private String alamat;

public pasien(String idpasien, String namapasien, int umur, String jeniskelamin, String alamat){
    this.idpasien = idpasien;
    this.namapasien = namapasien;
    this.umur = umur;
    this.jeniskelamin = jeniskelamin;
    this.alamat = alamat;
} 
    
    public void setIdPasien(String idpasien){
        this.idpasien=idpasien;
    }
    
    public String getIdPasien(){
        return this.idpasien;
    }
    
    public void setNamaPasien(String namapasien){
        this.namapasien=namapasien;
    }
    
    public String getNamaPasien(){
        return this.namapasien;
    }
    
    public void setUmur(int umur){
        this.umur=umur;
    }
    
    public int getUmur(){
        return this.umur;
    }
    
    public void setJenisKelamin(String jeniskelamin){
        this.jeniskelamin=jeniskelamin;
    }
    
    public String getJenisKelamin(){
        return this.jeniskelamin;
    }
    
    public void setAlamat(String alamat){
        this.alamat=alamat;
    }
    
    public String getAlamat(){
        return this.alamat;
    }
    
    public void tampilDataPasien() {
    System.out.println("ID Pasien : " + getIdPasien());
    System.out.println("Nama Pasien : " + getNamaPasien());
    System.out.println("Umur : " + getUmur());
    System.out.println("Jenis Kelamin : " + getJenisKelamin());
    System.out.println("Alamat : " + getAlamat());
}
}


