/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package istiyana2110010132;
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
    }
}
