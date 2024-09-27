package latihan03_access;

public class Mahasiswa {
    
    // tidak bisa diakses dari luar secara langsung
    private String npm, nama, alamat;

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    // Variabel konstanta (harus menggunakan 'final' dan tidak bisa diubah)
    public final String UNIVERSITAS = "Universitas Indraprasta PGRI";

    public void info(){
        System.out.println("-- INFO MAHASISWA --");
        System.out.println("NPM: "+ npm);
        System.out.println("Nama: "+ nama);
        System.out.println("Alamat: "+ alamat);
    }

}
