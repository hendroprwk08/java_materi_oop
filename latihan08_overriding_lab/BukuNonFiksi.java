package latihan08_overriding_lab;

public class BukuNonFiksi  extends Buku{
    String topik;

    // Konstruktor
    BukuNonFiksi(String judul, String penulis, int tahunTerbit, String topik) {
        super(judul, penulis, tahunTerbit);
        this.topik = topik;
    }

    // Override metode tampilInfo untuk menampilkan topik tambahan
    @Override
    void tampilInfo() {
        super.tampilInfo();
        System.out.println("Topik: " + topik);
    }
}

