package latihan02b_objek_list_jawab;

import java.util.Scanner;

public class MainInput {

    static Scanner sc = new Scanner(System.in);
    static int pilih = 0;
    static Petugas p = new Petugas();

    void generateSampleData() {
        // sample data
        Buku b1 = new Buku();
        b1.setId("B001");
        b1.setJudul("Pemrograman Berorientasi Objek");
        b1.setHalaman(350);
        p.simpanBuku(b1);

        Buku b2 = new Buku();
        b2.setId("B002");
        b2.setJudul("Basis Data Lanjut");
        b2.setHalaman(200);
        p.simpanBuku(b2);

        Anggota a1 = new Anggota();
        a1.setNpm("10118001");
        a1.setNama("Andi Saputra");
        a1.setKelas("IF-1");
        p.simpanAnggota(a1);

        Anggota a2 = new Anggota();
        a2.setNpm("10118002");
        a2.setNama("Budi Hartono");
        a2.setKelas("IF-2");
        p.simpanAnggota(a2);
    }

    public static void main(String[] args) {
        new MainInput().generateSampleData();

        do {
            mainMenu();
            pilih = getIntegerInput("[ Pilih menu (1-10) ]: ");

            switch (pilih) {
                case 1:
                    mainTambahAnggota();
                    break;
                case 2:
                    p.tampilAnggota();
                    pause();
                    break;
                case 3:
                    mainHapusAnggota();
                    break;
                case 4:
                    mainTambahBuku();
                    break;
                case 5:
                    p.tampilBuku();
                    pause();
                    break;
                case 6:
                    mainHapusBuku();
                    break;
                case 7:
                    mainPinjamBuku();
                    break;
                case 8:
                    mainLihatPinjamBuku();
                    break;
                case 9:
                    mainHapusPinjamBuku();
                    break;
                case 10:
                    System.out.println("[ Terima kasih telah menggunakan aplikasi. ]");
                    return; // Keluar dari program
                default:
                    System.out.println("[ Pilihan tidak valid, silakan coba lagi. ]");
                    pause();
            }
        } while (true);
    }
    
    private static void mainHapusPinjamBuku() {
        if(p.jumlahPeminjaman() == 0){
            System.out.println("[ Belum ada data peminjaman. ]");
            pause();
            return;
        }

        p.tampilPinjamBuku();
        int baris = getIntegerInput("[ Pilih baris peminjaman yang akan dihapus ]: ");

        if (baris > 0 && baris <= p.jumlahPeminjaman()) {
            p.hapusPinjamBukuById(baris);
            System.out.println("[ Data peminjaman berhasil dihapus. ]");
        } else {
            System.out.println("[ Gagal hapus, nomor baris tidak valid. ]");
        }
        pause();
    }

    private static void mainLihatPinjamBuku() {
        p.tampilPinjamBuku();
        pause();
    }

    private static void mainPinjamBuku() {
        if (p.jumlahAnggota() == 0 || p.jumlahBuku() == 0) {
            System.out.println("[ Data anggota atau buku masih kosong. Tidak bisa melakukan peminjaman. ]");
            pause();
            return;
        }

        // Pilih Anggota
        p.tampilAnggota();
        int noAnggota = getIntegerInput("[ Pilih nomor anggota yang akan meminjam ]: ");
        if (noAnggota <= 0 || noAnggota > p.jumlahAnggota()) {
            System.out.println("[ Nomor anggota tidak valid. ]");
            pause();
            return;
        }
        Anggota anggotaPeminjam = p.anggotaList.get(noAnggota - 1);

        // Pilih Buku
        p.tampilBuku();
        int noBuku = getIntegerInput("[ Pilih nomor buku yang akan dipinjam ]: ");
        if (noBuku <= 0 || noBuku > p.jumlahBuku()) {
            System.out.println("[ Nomor buku tidak valid. ]");
            pause();
            return;
        }
        Buku bukuDipinjam = p.bukuList.get(noBuku - 1);

        // Proses Peminjaman
        p.pinjamBuku(anggotaPeminjam, bukuDipinjam);
        System.out.println("[ Buku '" + bukuDipinjam.getJudul() + "' berhasil dipinjam oleh '" + anggotaPeminjam.getNama() + "'. ]");
        pause();
    }

    private static void mainHapusBuku() {
        if (p.jumlahBuku() == 0) {
            System.out.println("[ Tidak ada data buku untuk dihapus. ]");
            pause();
            return;
        }
        p.tampilBuku();

        sc.nextLine(); // membersihkan buffer
        System.out.print("[ Ketik ID buku yang akan dihapus ]: ");
        String id = sc.nextLine();

        if (id != "") {
            p.hapusBuku(id);
            System.out.println("[ Buku berhasil dihapus. ]");
        } else {
            System.out.println("[ Gagal hapus, baris tidak valid. ]");
        }
        pause();
    }

    private static void mainTambahBuku() {
        sc.nextLine(); // membersihkan buffer
        System.out.print("ID Buku: ");
        String id = sc.nextLine();
        System.out.print("Judul: ");
        String judul = sc.nextLine();
        int halaman = getIntegerInput("Jumlah Halaman: ");

        Buku b = new Buku();
        b.setId(id);
        b.setJudul(judul);
        b.setHalaman(halaman);
        p.simpanBuku(b);

        System.out.println("[ Data buku berhasil tersimpan. ]");
        pause();
    }
    
    // Menu utama diperbaiki agar lebih jelas
    static void mainMenu() {
        System.out.println("\nAnggota: " + p.jumlahAnggota() + " | Buku: " + p.jumlahBuku() + " | Dipinjam: " + p.jumlahPeminjaman());
        System.out.println("---------------------------------------");
        System.out.println("MANAJEMEN ANGGOTA");
        System.out.println("  1. Tambah Anggota");
        System.out.println("  2. Tampilkan Anggota");
        System.out.println("  3. Hapus Anggota");
        System.out.println("---------------------------------------");
        System.out.println("MANAJEMEN BUKU");
        System.out.println("  4. Tambah Buku");
        System.out.println("  5. Tampilkan Buku");
        System.out.println("  6. Hapus Buku");
        System.out.println("---------------------------------------");
        System.out.println("TRANSAKSI");
        System.out.println("  7. Pinjam Buku");
        System.out.println("  8. Lihat Peminjaman");
        System.out.println("  9. Hapus/Kembalikan Peminjaman");
        System.out.println("---------------------------------------");
        System.out.println("  10. Keluar");
        System.out.println("=======================================");
    }

    static void mainTambahAnggota() {
        sc.nextLine(); // membersihkan buffer
        System.out.print("NPM: ");
        String npm = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Kelas: ");
        String kelas = sc.nextLine();

        Anggota a = new Anggota();
        a.setNpm(npm);
        a.setNama(nama);
        a.setKelas(kelas);

        p.simpanAnggota(a);
        System.out.println("[ Data anggota berhasil tersimpan. ]");
        pause();
    }

    static void mainHapusAnggota() {
        if (p.jumlahAnggota() == 0) {
            System.out.println("[ Tidak ada data anggota untuk dihapus. ]");
            pause();
            return;
        }
        p.tampilAnggota();
        
        sc.nextLine(); // membersihkan buffer
        System.out.print("[ Ketik ID anggota yang akan dihapus ]: ");
        String id = sc.nextLine();

        if (!id.isEmpty()) {
            p.hapusAnggota(id);
            System.out.println("[ Anggota berhasil dihapus. ]");
        } else {
            System.out.println("[ Gagal hapus, ID tidak valid. ]");
        }
        pause();
    }
    
    // Fungsi bantuan untuk validasi input integer
    static int getIntegerInput(String message) {
        while (true) {
            System.out.print(message);
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("[ Input harus berupa angka! ]");
                sc.next(); // buang input yang salah
            }
        }
    }
    
    // Fungsi bantuan untuk jeda
    static void pause() {
        System.out.print("[ Tekan Enter untuk kembali ke menu... ]");
        sc.nextLine(); // Menunggu input setelah nextInt()
        sc.nextLine(); // Menunggu Enter dari user
    }
}