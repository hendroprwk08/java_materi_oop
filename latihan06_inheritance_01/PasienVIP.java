package latihan06_inheritance_01;

class PasienVIP extends Pasien {
    public PasienVIP(String nama, int umur, String jenisKelamin) {
        super(nama, umur, jenisKelamin);
    }

    public void bayar() {
        System.out.println("Pasien VIP mendapatkan pelayanan khusus.");
    }
}