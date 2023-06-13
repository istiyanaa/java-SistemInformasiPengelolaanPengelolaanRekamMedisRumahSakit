/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class datasetpemeriksaan {
    private ArrayList<String> idPemeriksaan;
    private ArrayList<String> idDokter;
    private ArrayList<String> namaDokter;
    private ArrayList<String> idPasien;
    private ArrayList<String> namaPasien;
    private ArrayList<String> diagnosa;
    private ArrayList<String> tanggalPeriksa;
    private ArrayList<String> hasil;
    private ArrayList<String> idResep;

    public  datasetpemeriksaan() {
        idPemeriksaan = new ArrayList<String>();
        idDokter = new ArrayList<String>();
        namaDokter = new ArrayList<String>();
        idPasien = new ArrayList<String>();
        namaPasien = new ArrayList<String>();
        diagnosa = new ArrayList<String>();
        tanggalPeriksa = new ArrayList<String>();
        hasil = new ArrayList<String>();
        idResep = new ArrayList<String>();
    }  
    
    public void tambahIdPemeriksaan(String value) {
        idPemeriksaan.add(value);
    }

    public ArrayList<String> getIdPemeriksaan() {
        return this.idPemeriksaan;
    }

    public void tambahIdDokter(String value) {
        idDokter.add(value);
    }

    public ArrayList<String> getIdDokter() {
        return this.idDokter;
    }

    public void tambahNamaDokter(String value) {
        namaDokter.add(value);
    }

    public ArrayList<String> getNamaDokter() {
        return this.namaDokter;
    }

    public void tambahIdPasien(String value) {
        idPasien.add(value);
    }

    public ArrayList<String> getIdPasien() {
        return this.idPasien;
    }

    public void tambahNamaPasien(String value) {
        namaPasien.add(value);
    }

    public ArrayList<String> getNamaPasien() {
        return this.namaPasien;
    }

    public void tambahDiagnosa(String value) {
        diagnosa.add(value);
    }

    public ArrayList<String> getDiagnosa() {
        return this.diagnosa;
    }

    public void tambahTanggalPeriksa(String value) {
        tanggalPeriksa.add(value);
    }

    public ArrayList<String> getTanggalPeriksa() {
        return this.tanggalPeriksa;
    }

    public void tambahHasil(String value) {
        hasil.add(value);
    }

    public ArrayList<String> getHasil() {
        return this.hasil;
    }

    public void tambahIdResep(String value) {
        idResep.add(value);
    }

    public ArrayList<String> getIdResep() {
        return this.idResep;
    }
}
