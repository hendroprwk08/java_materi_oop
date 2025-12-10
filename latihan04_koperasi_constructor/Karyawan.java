package latihan04_koperasi_constructor;

public class Karyawan {
    public String nik, nama, golongan;
    public int bulan;
    
    // constructor
    Karyawan(String nik, String nama, String golongan, int bulan){
        this.nik = nik;
        this.nama = nama;
        this.golongan = golongan;
        this.bulan = bulan;
    }

}
