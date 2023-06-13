/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dataset;
import java.util.ArrayList;
import Dataset.datasetobat;

/**
 *
 * @author ASUS
 */
public class datasetobat {
    private ArrayList<String> IdResep;
    private ArrayList<String> ResepObat;
    
    public datasetobat (){
        IdResep= new ArrayList<String>();
        ResepObat= new ArrayList<String>();
    }
    
    public void tambahIdResep(String value){
        IdResep.add(value);
    }
    
    public ArrayList<String> getIdResep(){
        return this.IdResep;
    }
    
    public void tambahResepObat(String value){
        ResepObat.add(value);
    }
    
    public ArrayList<String> getResepObat(){
        return this.ResepObat;
    }
    
}
