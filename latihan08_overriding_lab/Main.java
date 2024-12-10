package latihan08_overriding_lab;

public class Main {
    public static void main(String[] args){
        Perpustakaan perpustakaan = new Perpustakaan();

        // Menambahkan buku
        Buku buku1 = new BukuFiksi("Harry Potter", "J.K. Rowling", 1997, "Fantasi");
        Buku buku2 = new BukuNonFiksi("Think and Grow Rich", "Napoleon Hill", 1937, "Motivasi");
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        // Menampilkan semua buku
        System.out.println("Semua Buku:");
        perpustakaan.tampilkanSemuaBuku();

        // Mencari buku
        Buku bukuDicari = perpustakaan.cariBuku("Think and Grow Rich");
        if (bukuDicari != null) {
            System.out.println("\nBuku ditemukan:");
            bukuDicari.tampilInfo();
        } else {
            System.out.println("Buku tidak ditemukan.");
        }

        // Menghapus buku
        perpustakaan.hapusBuku(buku1);
        System.out.println("\nSetelah menghapus buku:");
        perpustakaan.tampilkanSemuaBuku();
    }
}
