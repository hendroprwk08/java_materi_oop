package latihan08_praUAP;

// Kelas PasienRawatJalan
class PasienRawatJalan extends Pasien {
    private String penyakit;

    public PasienRawatJalan(String nama, 
    String alamat, 
    String penyakit) {
        super(nama, alamat);
        this.penyakit = penyakit;
    }

    // Overriding method cetakData()
    @Override
    public void cetakData() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Penyakit: " + penyakit);
    }
}