
package pbo1.pkg10118002.latihan61.bangunruang;



/**
 *
 * @author 
 * NAMA     : Rizky Muslimin
 * KELAS    : IF-1
 * NIM      : 10118002
 * Deskripsi Program : Program ini untuk menghitung volume bangun ruang.
 */
public class PBO110118002Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Bola bola = new Bola();
        bola.setR(7);
        System.out.println("Hasil : V = "+Math.ceil(bola.hitungVolume()));
        
        Tabung tabung = new Tabung();
        tabung.setR(10);
        tabung.setT(21);
        System.out.println("Hasil V = "+Math.ceil(tabung.hitungVolume()));
        
        Kerucut kerucut = new Kerucut();
        kerucut.setR(14);
        kerucut.setT(9);
        System.out.println("Hasil : V = "+Math.ceil(kerucut.hitungVolume()));
    }
    
}
