package latihan05_cuci_mobil_constructor;

public class Pemesan {
    
    private String nama, alamat, telepon, surel;

    // constructor
    Pemesan(String nama, String alamat, String telepon, String surel){
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
        this.surel = surel;
    }

    public String getNama() {
        return nama;   
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTelepon() {
        return telepon;
    }
    
    public String getSurel() {
        return surel;
    }
}
