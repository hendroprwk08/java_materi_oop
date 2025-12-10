package latihan06_inheritance_01;

class PasienBPJS extends Pasien {
    String noKartu;

    public PasienBPJS(String nama, int umur, String jenisKelamin, String noKartu) {
        super(nama, umur, jenisKelamin);
        this.noKartu = noKartu;
    }

    @Override
    public void bayar() {
        System.out.println("Pasien BPJS menggunakan kartu BPJS dengan nomor: " + noKartu);
    }
}