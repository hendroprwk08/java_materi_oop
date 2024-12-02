package latihan06_inheritance_01;

public class Pasien {
    String nama;
    int umur;
    String jenisKelamin;

    public Pasien(String nama, int umur, String jenisKelamin) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
    }

    public void bayar() {
        System.out.println("Pasien harus melakukan pembayaran");
    }
}
