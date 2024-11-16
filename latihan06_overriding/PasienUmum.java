package latihan06_overriding;

class PasienUmum extends Pasien {
    @Override
    public double hitungBiaya() {
        System.out.println("Hitung biaya pasien umum");
        return 100000; // Contoh biaya
    }
}