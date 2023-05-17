/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package istiyana2110010132;

/**
 *
 * @author ASUS
 */
public class pemeriksaan {
    private String idpemeriksaan;
    private String iddokter;
    private String namadokter;
    private String idpasien;
    private String namapasien;
    private String diagnosa;
    private String tanggalperiksa;
    private String hasil;
    private String idresep;
    
    public pemeriksaan(String idpemeriksaan, String iddokter, String namadokter, String idpasien, String namapasien, String diagnosa, String tanggalperiksa, String hasil, String idresep) {
        this.idpemeriksaan = idpemeriksaan;
        this.iddokter = iddokter;
        this.namadokter = namadokter;
        this.idpasien = idpasien;
        this.namapasien = namapasien;
        this.diagnosa = diagnosa;
        this.tanggalperiksa = tanggalperiksa;
        this.hasil = hasil;
        this.idresep = idresep;
    }
    
    public void setIdPemeriksaan(String idpemeriksaan) {
        this.idpemeriksaan = idpemeriksaan;
    }
    
    public String getIdPemeriksaan(){
        return this.idpemeriksaan;
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
    
    public void setIdPasien(String idpasien){
        this.idpasien = idpasien;
    }
    
    public String getIdPasien(){
        return this.idpasien;
    }
    
    public void setNamaPasien(String namapasien){
        this.namapasien = namapasien;
    }
    
    public String getNamaPasien(){
        return this.namapasien;
    }
    
    public void setDiagnosa(String diagnosa, String spesialis, String resep){
        this.diagnosa = diagnosa;
        if (spesialis.equalsIgnoreCase("Kardiologi")){
            this.idresep = "R001";
            this.diagnosa += ", perlu diberikan obat jantung";
        } else if (spesialis.equalsIgnoreCase("Oftalmologi")){
            this.idresep = "R002";
            this.diagnosa += ", perlu diberikan obat mata";
        } else {
            this.idresep = "R003";
        }
        this.idresep += resep;
    }
    
    public String getDiagnosa(){
        return this.diagnosa;
    }
    
    public void setTanggalPeriksa(String tanggalperiksa){
        this.tanggalperiksa = tanggalperiksa;
    }
    
    public String getTanggalPeriksa(){
        return this.tanggalperiksa;
    }
    
    public void setHasil(String hasil){
        this.hasil = hasil;
    }
    
    public String getHasil(){
        return this.hasil;
    }
    
    public void setIdResep(String idresep){
        this.idresep = idresep;
    }
    
    public String getIdResep(){
        return this.idresep;
    }
    
    public void tampilkanPemeriksaan() {
        System.out.println("ID Pemeriksaan: " + this.idpemeriksaan);
        System.out.println("ID Dokter: " + this.iddokter);
        System.out.println("Nama Dokter: " + this.namadokter);
        System.out.println("ID Pasien: " + this.idpasien);
        System.out.println("Nama Pasien: " + this.namapasien);
        System.out.println("Diagnosa: " + this.diagnosa);
        System.out.println("Tanggal Periksa: " + this.tanggalperiksa);
        System.out.println("Hasil: " + this.hasil);
        System.out.println("ID Resep: " + this.idresep);
    }
}
