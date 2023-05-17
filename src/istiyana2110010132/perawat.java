/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package istiyana2110010132;

/**
 *
 * @author ASUS
 */
public class perawat {
    private String idperawat;
    private String namaperawat;
    private String jeniskelamin;
    private String alamat;
    private String kota;
    private int telepon;
    
    public perawat(String idperawat, String namaperawat, String jeniskelamin, String alamat, String kota, int telepon){
        this.idperawat = idperawat;
        this.namaperawat = namaperawat;
        this.jeniskelamin = jeniskelamin;
        this.alamat = alamat;
        this.kota = kota;
        this.telepon = telepon;
    }
    
    public void setIdPerawat(String idperawat) {
        this.idperawat=idperawat;
    }
    
    public String getIdPerawat(){
        return this.idperawat;
    }
    
    public void setNamaPerawat(String namaperawat) {
        this.namaperawat=namaperawat;
    }
    
    public String getNamaPerawat(){
        return this.namaperawat;
    }
    
    public void setJenisKelamin(String jeniskelamin) {
        this.jeniskelamin=jeniskelamin;
    }
    
    public String getJenisKelamin(){
        return this.jeniskelamin;
    }
    
    public void setAlamat(String alamat) {
        this.alamat=alamat;
    }
    
    public String getAlamat(){
        return this.alamat;
    }
    
    public void setKota(String kota){
        this.kota=kota;
    }
    
    public String getKota(){
        return this.kota;
    }
    
    public void setTelepon(int telepon){
        this.telepon=telepon;
    }
    
    public int Telepon(){
        return this.telepon;
    }
    
    public void tampilDataPerawat(){
        System.out.println("ID Perawat\t: " + this.getIdPerawat());
        System.out.println("Nama Perawat\t: " + this.getNamaPerawat());
        System.out.println("Jenis Kelamin\t: " + this.getJenisKelamin());
        System.out.println("Alamat\t\t: " + this.getAlamat());
        System.out.println("Kota\t\t: " + this.getKota());
        System.out.println("Telepon\t\t: " + this.Telepon());
    }
}
