package latihan07_constructor;
/**
 * Mobil
 */
public class Mobil {

    int roda, cc;
    String merek, seri;

    public Mobil() {
    }
    
    public Mobil(int roda, int cc, String merek, String seri) {
        this.roda = roda;
        this.cc = cc;
        this.merek = merek;
        this.seri = seri;
    }

    public int getRoda() {
        return roda;
    }

    public void setRoda(int roda) {
        this.roda = roda;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getSeri() {
        return seri;
    }

    public void setSeri(String seri) {
        this.seri = seri;
    }
    
}