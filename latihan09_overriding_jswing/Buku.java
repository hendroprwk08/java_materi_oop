package latihan09_overriding_jswing;

public class Buku {
    String judul;
    String penulis;
    int tahunTerbit;

    // Konstruktor
    Buku(String judul, String penulis, 
    int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    // Metode untuk menampilkan informasi buku
    void tampilInfo() {
        System.out.println("Judul: " + 
        judul);
        System.out.println("Penulis: " + 
        penulis);
        System.out.println("Tahun Terbit: " +
        tahunTerbit);
    }
}