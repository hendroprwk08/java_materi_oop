package latihan06_overriding;

class PasienBPJS extends Pasien {
    @Override
    public double hitungBiaya() {
        // Logika perhitungan biaya untuk pasien BPJS
        System.out.println("Hitung biaya pasien BPJS");
        return 50000; // Contoh biaya
    }
}
