package latihan02_objek_list;

public class Main {
    // sesi 1 dasar pemanfaatan class dgn list 
    // sesi 2 gunakan file MainInput.java 
    public static void main(String[] args) {
        // tambah buku saja
        Buku b1 = new Buku();
        b1.setId("B001");
        b1.setJudul("Sang Pencerah");
        b1.setHalaman(125);
        
        Buku b2 = new Buku();
        b2.setId("B002");
        b2.setJudul("Bumi");
        b2.setHalaman(320);

        Buku b3 = new Buku();
        b3.setId("B003");
        b3.setJudul("Accounting Principal");
        b3.setHalaman(620);

        // tambah anggota saja
        Anggota a1 = new Anggota();
        a1.setNpm("12345");
        a1.setNama("Handoko");
        a1.setKelas("R5V");

        Anggota a2 = new Anggota();
        a2.setNpm("10988");
        a2.setNama("Yunita Hapsari AlBantani");
        a2.setKelas("R5C");

        // memanfaatkan class Buku, anggota
        // dan menambahkan data pinjam buku
        // melalui class Petugas
        Petugas p = new Petugas();
        p.simpanBuku(b1);
        p.simpanBuku(b2);
        p.simpanBuku(b3);
        
        p.simpanAnggota(a1);
        p.simpanAnggota(a2);

        p.tampilBuku();
        p.tampilAnggota();
    }
}
