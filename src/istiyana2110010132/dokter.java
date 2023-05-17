/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package istiyana2110010132;

/**
 *
 * @author ASUS
 */
public class dokter {
    private String iddokter;
    private String namadokter;
    private String spesialis;
    private String jeniskelamin;
    private String alamat;
    private String kota;
    private int telepon;  
    
    public dokter(String iddokter, String namadokter, String jeniskelamin, String alamat, String kota, int telepon){
        this.iddokter = iddokter;
        this.namadokter = namadokter;
        this.jeniskelamin = jeniskelamin;
        this.alamat = alamat;
        this.kota = kota;
        this.telepon = telepon;
    }
    
    public void setIdDokter(String iddokter) {
        this.iddokter = iddokter;
    }
    
    public String getIdDokter(){
        return this.iddokter;
    }
    
    public void setNamaDokter(String namadokter){
        this.namadokter = namadokter;
    }
    
    public String getNamaDokter(){
        return this.namadokter;
    }
    
     public void setSpesialis(String namadokter){
    if(namadokter.equalsIgnoreCase("Dr. John Doe")){
        this.spesialis = "Kardiologi";
    } else if (namadokter.equalsIgnoreCase("Dr. Jane Smith")){
        this.spesialis = "Oftalmologi";
    } else {
        this.spesialis = "Umum";
    }
}
    
    public String getSpesialis() {
        return this.spesialis;
    }
     
    public void setJenisKelamin(String jeniskelamin){
        this.jeniskelamin = jeniskelamin;
    }
    
    public String getJenisKelamin(){
        return this.jeniskelamin;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getAlamat(){
        return this.alamat;
    }
    
    public void setKota(String kota){
        this.kota = kota;
    }
    
    public String getKota(){
        return this.kota;
    }
    
    public void setTelepon(int telepon){
        this.telepon = telepon;
    }
    
    public int getTelepon(){
        return this.telepon;
    }
    
     public void tampilData(){
        System.out.println("ID Dokter: " + getIdDokter());
        System.out.println("Nama Dokter: " + getNamaDokter());
        System.out.println("Spesialis: " + getSpesialis());
        System.out.println("Jenis Kelamin: " + getJenisKelamin());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Kota: " + getKota());
        System.out.println("Telepon: " + getTelepon());
    }
}

    