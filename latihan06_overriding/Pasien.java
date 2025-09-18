package latihan06_overriding;

class Pasien {
    String nama;
    int umur;
    String jenisKelamin;

    // akan di-override
    public double hitungBiaya() {
        System.out.println("Hitung biaya pasien secara umum");
        return 0.0;
    }
}