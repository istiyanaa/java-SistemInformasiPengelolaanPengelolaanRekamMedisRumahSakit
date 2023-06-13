/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package istiyana2110010132;
import forms.frameutama;
/**
 *
 * @author ASUS
 */
public class istiyana2110010132 {
    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        
        Pemeriksaan myobj = new Pemeriksaan();
        myobj.setIdPemeriksaan("");
        myobj.setIdDokter("");
        myobj.setNamaDokter("");
        myobj.setIdPasien("");
        myobj.setDiagnosa("");
        myobj.setTanggalPeriksa("");
        myobj.setHasil("");
        myobj.setIdResep("");
        System.out.println(myobj.getPemeriksaan());
*/
        
        frameutama formsDokter = new frameutama();
        formsDokter.setVisible(true);
        
        frameutama formsPasien = new frameutama();
        formsPasien.setVisible(true);
        
        frameutama formsPerawat = new frameutama();
        formsPasien.setVisible(true);
        
        frameutama formsPemeriksaan = new frameutama();
        formsPemeriksaan.setVisible(true);
        
        frameutama formsObat = new frameutama();
        formsObat.setVisible(true);
        
        frameutama formsRuang = new frameutama();
        formsRuang.setVisible(true);
    }
}
