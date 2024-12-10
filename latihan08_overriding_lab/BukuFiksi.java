package latihan08_overriding_lab;

public class BukuFiksi extends Buku {
    String genre;

    // Konstruktor
    BukuFiksi(String judul, String penulis, int tahunTerbit, String genre) {
        super(judul, penulis, tahunTerbit);
        this.genre = genre;
    }

    // Override metode tampilInfo untuk menampilkan genre tambahan
    @Override
    void tampilInfo() {
        super.tampilInfo();
        System.out.println("Genre: " + genre);
    }
}
