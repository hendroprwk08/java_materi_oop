package latihan02b_objek_list_soal;

public class Buku {
    String id, judul;
    int halaman;

    /*  
    sebelum UTS, jangan gunakan constructor
    
    public Buku(String id, String judul, int halaman) {
        this.id = id;
        this.judul = judul;
        this.halaman = halaman;
    }
    */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getHalaman() {
        return halaman;
    }

    public void setHalaman(int halaman) {
        this.halaman = halaman;
    }
    
}
