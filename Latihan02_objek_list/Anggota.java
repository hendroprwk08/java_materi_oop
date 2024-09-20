package Latihan02_objek_list;

public class Anggota {
    String npm, nama, kelas;

    /* 
    sebelum UTS, jangan gunakan constructor
    
    public Anggota(String npm, String nama, String kelas) {
        this.npm = npm;
        this.nama = nama;
        this.kelas = kelas;
    }
    */

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }   
}
