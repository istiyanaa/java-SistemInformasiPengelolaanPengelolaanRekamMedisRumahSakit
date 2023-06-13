/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;
import java.util.ArrayList;
import Dataset.datasetpasien;

/**
 *
 * @author ASUS
 */
public class datasetpasien {
    private ArrayList<String> IdPasien;
    private ArrayList<String> NamaPasien;
    private ArrayList<Integer> Umur;
    private ArrayList<String> JenisKelamin;
    private ArrayList<String> Alamat;
    
    public datasetpasien (){
        IdPasien= new ArrayList<String>();
        NamaPasien= new ArrayList<String>();
        Umur= new ArrayList<Integer>();
        JenisKelamin= new ArrayList<String>();
        Alamat= new ArrayList<String>();
    }
    
    public void tambahIdPasien(String value){
        IdPasien.add(value);
    }
    
    public ArrayList<String> getIdPasien(){
        return this.IdPasien;
    }
    
    public void NamaPasien(String value){
        NamaPasien.add(value);
    }
    
    public ArrayList<String> getNamaPasien(){
        return this.NamaPasien;
    }
    
    public void Umur(int x){
        Umur.add(x);
    }
    
    public ArrayList<Integer> getUmur(){
        return this.Umur;
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
}
