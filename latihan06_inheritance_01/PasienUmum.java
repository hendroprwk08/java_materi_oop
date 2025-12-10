package latihan06_inheritance_01;

class PasienUmum extends Pasien {
    public PasienUmum(String nama, int umur, String jenisKelamin) {
        super(nama, umur, jenisKelamin);
    }

    @Override
    public void bayar() {
        System.out.println("Pasien umum melakukan pembayaran secara tunai.");
    }
}
