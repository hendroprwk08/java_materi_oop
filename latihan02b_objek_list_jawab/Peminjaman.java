package latihan02b_objek_list_jawab;

public class Peminjaman {
    private int id;
    private Anggota anggota;
    private Buku buku;

    public Peminjaman(int id, Anggota anggota, Buku buku) {
        this.id = id;
        this.anggota = anggota;
        this.buku = buku;
    }

    public int getId() {
        return id;
    }

    public Anggota getAnggota() {
        return anggota;
    }

    public Buku getBuku() {
        return buku;
    }
}