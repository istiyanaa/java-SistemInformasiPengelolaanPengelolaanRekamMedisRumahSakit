/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;
import java.util.ArrayList;
import Dataset.datasetdokter;

/**
 *
 * @author ASUS
 */
public class datasetdokter {
    private ArrayList<String> IdDokter;
    private ArrayList<String> NamaDokter;
    private ArrayList<String> Spesialis;
    private ArrayList<String> JenisKelamin;
    private ArrayList<String> Alamat;
    private ArrayList<String> Kota;
    private ArrayList<Integer> Telepon;
    
    public datasetdokter (){
        IdDokter= new ArrayList<String>();
        NamaDokter= new ArrayList<String>();
        Spesialis= new ArrayList<String>();
        JenisKelamin= new ArrayList<String>();
        Alamat= new ArrayList<String>();
        Kota= new ArrayList<String>();
        Telepon= new ArrayList<Integer>();
    }
    
    public void tambahIDDokter(String value){
        IdDokter.add(value);
    }
    
    public ArrayList<String> getIdDokter(){
        return this.IdDokter;
    }
    
    public void NamaDokter(String value){
        NamaDokter.add(value);
    }
    
    public ArrayList<String> getNamaDokter(){
        return this.NamaDokter;
    }
    
    public void Spesialis (String value){
        Spesialis.add(value);
    }
    
    public ArrayList<String> getSpesialis(){
        return this.Spesialis;
    }
    
    public void JenisKelamin(String value){
        JenisKelamin.add(value);
    }
    
    public ArrayList<String> getJenisKelamin(){
        return this.JenisKelamin;
    }
    
    public void Alamat(String value){
        Alamat.add(value);
    }
    
    public ArrayList<String> getAlamat(){
        return this.Alamat;
    }
    
    public void Kota(String value){
        Kota.add(value);
    }
    
    public ArrayList<String> getKota(){
        return this.Kota;
    }
    
    public void Telepon(int x){
        Telepon.add(x);
    }
    
    public ArrayList<Integer> getTelepon(){
        return this.Telepon;
    }

    public Object getDatasetDokter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
