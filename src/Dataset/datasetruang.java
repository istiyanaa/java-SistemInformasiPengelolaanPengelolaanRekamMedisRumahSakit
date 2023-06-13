/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;
import java.util.ArrayList;
import Dataset.datasetruang;
/**
 *
 * @author ASUS
 */
public class datasetruang {
    private ArrayList<String> IdRuang;
    private ArrayList<String> NamaRuang;
    private ArrayList<String> IdPerawat;
    
    public datasetruang (){
        IdRuang= new ArrayList<String>();
        NamaRuang= new ArrayList<String>();
        IdPerawat= new ArrayList<String>();
    }
    
    public void tambahIdRuang(String value){
        IdRuang.add(value);
    }
    
    public ArrayList<String> getIdRuang(){
        return this.IdRuang;
    }
    
    public void tambahNamaRuang(String value){
        NamaRuang.add(value);
    }
    
    public ArrayList<String> getNamaRuang(){
        return this.NamaRuang;
    }
    
    public void tambahIdPerawat(String Value){
        IdPerawat.add(Value);
    }
    
    public ArrayList<String> getIdPerawat(){
        return this.IdPerawat;
    }
}
