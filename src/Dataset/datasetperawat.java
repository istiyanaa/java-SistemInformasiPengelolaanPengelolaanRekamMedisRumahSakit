/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;
import java.util.ArrayList;
import Dataset.datasetperawat;
/**
 *
 * @author ASUS
 */
public class datasetperawat {
    private ArrayList<String> IdPerawat;
    private ArrayList<String> NamaPerawat;
    private ArrayList<String> JenisKelamin;
    private ArrayList<String> Alamat;
    private ArrayList<String> Kota;
    private ArrayList<Integer> Telepon;
    
    public datasetperawat (){
        IdPerawat= new ArrayList<String>();
        NamaPerawat= new ArrayList<String>();
        JenisKelamin= new ArrayList<String>();
        Alamat= new ArrayList<String>();
        Kota= new ArrayList<String>();
        Telepon= new ArrayList<Integer>();
    }
    
    public void tambahIdPerawat(String value){
        IdPerawat.add(value);
    }
    
    public ArrayList<String> getIdPerawat(){
        return this.IdPerawat;
    }
    
    public void NamaPerawat(String value){
        NamaPerawat.add(value);
    }
    
    public ArrayList<String> getNamaPerawat(){
        return this.NamaPerawat;
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
}
