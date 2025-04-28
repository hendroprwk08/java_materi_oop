package latihan08_overriding_lab;

import java.util.ArrayList;
import java.util.List;

public class Perpustakaan {
List<Buku> koleksiBuku = new ArrayList<>();

    // Metode untuk menambahkan buku (Create)
    void tambahBuku(Buku buku) {
        koleksiBuku.add(buku);
    }

    // Metode untuk menampilkan semua buku (Read)
    void tampilkanSemuaBuku() {
        for (Buku buku : koleksiBuku) {
            buku.tampilInfo();
            System.out.println("--------------");
        }
    }

    // Metode untuk mencari buku berdasarkan judul (Read)
    Buku cariBuku(String judul) {
        for (Buku buku : koleksiBuku) {
            if (buku.judul.equals(judul)) {
                return buku;
            }
        }
        return null;
    }

    // Metode untuk menghapus buku (Delete)
    void hapusBuku(Buku buku) {
        koleksiBuku.remove(buku);
    }
}
