package Latihan02_objek_list;

import java.util.ArrayList;

public class Petugas {
    ArrayList<Buku> bukuList = new ArrayList<>();
    ArrayList<Anggota> anggotaList = new ArrayList<>();

    void simpanBuku(Buku b) {
        bukuList.add(b);
    }

    void simpanAnggota(Anggota a) {
        anggotaList.add(a);
    }

    void pinjamBuku(Anggota a, Buku b) {
        anggotaList.add(a);
        bukuList.add(b);
    }

    void tampilAnggota() {
        // tabel anggota
        // urut berdasarkan nama
        
        int no = 0;
        System.out.println("DATA ANGGOTA");           
        System.out.println("------------------------------------");            
        for (Anggota a : anggotaList) {
            System.out.printf(
                    "| %-2s | %-5s | %-13s | %-3s |",
                    no + 1,
                    a.getNpm(),
                    (a.getNama().length() > 13) ? a.getNama().substring(0, 13): a.getNama(),
                    a.getKelas());
            System.out.println();
            no++;
        }
        System.out.println("------------------------------------");            
        System.out.println();
    }

    void tampilBuku() {
        // tabel buku
        int no = 0;
        System.out.println("DATA BUKU");            
        System.out.println("-------------------------------------");            
        for (Buku b : bukuList) {
            System.out.printf(
                    "| %-2s | %-4s | %-15s | %-3s |",
                    no + 1,
                    b.getId(),
                    (b.getJudul().length() > 15 ) ? b.getJudul().substring(0, 15) : b.getJudul(),
                    b.getHalaman());
            System.out.println();
            no++;
        }
        System.out.println("-------------------------------------");            
        System.out.println();
    }
}
