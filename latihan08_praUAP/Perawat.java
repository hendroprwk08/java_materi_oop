package latihan08_praUAP;

// Kelas Perawat
class Perawat implements TindakanMedis {
    @Override
    public void periksa() {
        System.out.println("Perawat melakukan pemeriksaan awal.");
    }

    @Override
    public void beriObat() {
        System.out.println("Perawat memberikan obat.");
    }
}