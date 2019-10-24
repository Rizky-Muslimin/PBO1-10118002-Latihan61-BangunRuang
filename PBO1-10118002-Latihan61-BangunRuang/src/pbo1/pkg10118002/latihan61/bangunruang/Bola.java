
package pbo1.pkg10118002.latihan61.bangunruang;

/**
 * NAMA     : Rizky Muslimin
 * KELAS    : IF-1
 * NIM      : 10118002
 */
public class Bola extends BangunRuang {
    
    private double r;
    private double volume;

    @Override
    public double hitungVolume() {
        volume = (4*Math.PI*Math.pow(r, 3))/3;
        
        return volume;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    
}
