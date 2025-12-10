package latihan02b_objek_list_jawab;

import java.util.ArrayList;

public class Petugas {
    ArrayList<Buku> bukuList = new ArrayList<>();
    ArrayList<Anggota> anggotaList = new ArrayList<>();
    ArrayList<Peminjaman> peminjamanList = new ArrayList<>();

    private int nextPeminjamanId = 1;   // ID unik untuk setiap peminjaman

    void simpanBuku(Buku b) {
        bukuList.add(b);
    }

    void simpanAnggota(Anggota a) {
        anggotaList.add(a);
    }

    /**
     * Logika pinjamBuku diperbaiki.
     * Sekarang membuat objek Peminjaman baru dan menyimpannya ke peminjamanList.
     */

    void pinjamBuku(Anggota a, Buku b) {
        // Buat objek peminjaman baru dengan id unik
        Peminjaman peminjaman = new Peminjaman(nextPeminjamanId, a, b);
        peminjamanList.add(peminjaman);
        nextPeminjamanId++;
    }

    // menghapus peminjaman berdasarkan id
    void hapusPinjamBukuById(int id) {
        for (int i = 0; i < peminjamanList.size(); i++) {
            if (peminjamanList.get(i).getId() == id) {
                peminjamanList.remove(i);
                break;
            }
        }
    }

    /**
     * Fungsi untuk menampilkan semua data peminjaman yang ada.
     */
    void tampilPinjamBuku() {
        System.out.println("DATA PEMINJAMAN BUKU");
        System.out.println("-----------------------------------------------------------------");
        System.out.printf("| %-2s | %-13s | %-5s | %-15s | %-4s |\n", "No", "Nama Anggota", "NPM", "Judul Buku", "ID");
        System.out.println("-----------------------------------------------------------------");
        
        if (peminjamanList.isEmpty()) {
            System.out.println("| Tidak ada data peminjaman saat ini.                       |");
        } else {
            int no = 0;
            for (Peminjaman p : peminjamanList) {
                String namaAnggota = p.getAnggota().getNama();
                String judulBuku = p.getBuku().getJudul();
                
                System.out.printf(
                    "| %-2d | %-13s | %-5s | %-15s | %-4s |\n",
                    no + 1,
                    (namaAnggota.length() > 13) ? namaAnggota.substring(0, 13) : namaAnggota,
                    p.getAnggota().getNpm(),
                    (judulBuku.length() > 15) ? judulBuku.substring(0, 15) : judulBuku,
                    p.getBuku().getId()
                );
                no++;
            }
        }
        System.out.println("-----------------------------------------------------------------");
    }

    int jumlahPeminjaman(){
        return peminjamanList.size();
    }

    void tampilAnggota() {
        int no = 0;
        System.out.println("DATA ANGGOTA");
        System.out.println("--------------------------------------------");
        System.out.printf("| %-2s | %-8s | %-13s | %-5s |\n", "No", "NPM", "Nama", "Kelas");
        System.out.println("--------------------------------------------");
        for (Anggota a : anggotaList) {
            System.out.printf(
                "| %-2d | %-8s | %-13s | %-5s |\n",
                no + 1,
                a.getNpm(),
                (a.getNama().length() > 13) ? a.getNama().substring(0, 13) : a.getNama(),
                a.getKelas()
            );
            no++;
        }
        System.out.println("--------------------------------------------");
    }
    
    int jumlahAnggota(){
        return anggotaList.size();
    }
    
    void hapusAnggota(String id){
        // hapus anggota berdasarkan npm
        for (int i = 0; i < anggotaList.size(); i++) {  
            if (anggotaList.get(i).getNpm().equals(id)) {
                anggotaList.remove(i);
                break;
            }
        }
    }

    void tampilBuku() {
        int no = 0;
        System.out.println("DATA BUKU");
        System.out.println("-------------------------------------------------");
        System.out.printf("| %-2s | %-4s | %-25s | %-7s |\n", "No", "ID", "Judul", "Halaman");
        System.out.println("-------------------------------------------------");
        for (Buku b : bukuList) {
            System.out.printf(
                "| %-2d | %-4s | %-25s | %-7d |\n",
                no + 1,
                b.getId(),
                (b.getJudul().length() > 25) ? b.getJudul().substring(0, 25) : b.getJudul(),
                b.getHalaman()
            );
            no++;
        }
        System.out.println("-------------------------------------------------");
    }
    
    int jumlahBuku(){
        return bukuList.size();
    }

    void hapusBuku(String id){
        // hapu sbuku bersarkan id
        for (int i = 0; i < bukuList.size(); i++) { 
            if (bukuList.get(i).getId().equals(id)) {
                bukuList.remove(i);
                break;
            }
        }
    }
}