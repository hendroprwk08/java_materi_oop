package latihan08_praUAP;

// Kelas abstrak Pasien
abstract class Pasien {
    protected String nama;
    protected String alamat;

    public Pasien(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public abstract void cetakData();
}   