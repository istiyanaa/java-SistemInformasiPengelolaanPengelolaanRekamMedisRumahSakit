 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package istiyana2110010132;

/**
 *
 * @author ASUS
 */
public class obat {
    private String idresep;
    private String resepobat;
    
    public obat(String idresep, String resepobat) {
        this.idresep = idresep;
        setResepObat(resepobat);
    }
    
    public void setIdResep(String idresep){
        this.idresep=idresep;
    }
    
    public String getIdResep(){
        return this.idresep;
    }
    
    public final void setResepObat(String resepobat) {
    if (resepobat.equalsIgnoreCase("Aspirin")) {
        this.resepobat = "Obat Penyakit Jantung";
    } else if (resepobat.equalsIgnoreCase("Atenolol")) {
        this.resepobat = "Obat Penyakit Jantung";
    } else if (resepobat.equalsIgnoreCase("Timolol")) {
        this.resepobat = "Obat Penyakit Mata";
    } else if (resepobat.equalsIgnoreCase("Latanoprost")) {
        this.resepobat = "Obat Penyakit Mata";
    } else {
        this.resepobat = "Obat Umum";
    }
}
    
    public String getResepObat(){
        return this.resepobat;
    }
    
    public void tampil() {
        System.out.println("ID Resep: " + this.idresep);
        System.out.println("Resep Obat: " + this.resepobat);
    }
}
    