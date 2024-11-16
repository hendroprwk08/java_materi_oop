package latihan08_praUAP;

// Kelas Dokter
class Dokter implements TindakanMedis {
    @Override
    public void periksa() {
        System.out.println("Dokter melakukan pemeriksaan.");
    }

    @Override
    public void beriObat() {
        System.out.println("Dokter memberikan resep obat.");
    }
}