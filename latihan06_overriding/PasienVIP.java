package latihan06_overriding;

class PasienVIP extends Pasien {
    @Override
    public double hitungBiaya() {
        System.out.println("Hitung biaya pasien VIP");
        return 200000;
    }
}