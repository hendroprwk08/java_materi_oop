package latihan07_overloading_lab;

import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private String npm;
    private double ipk;

    // Konstruktor default
    public Mahasiswa() {
        this.nama = "Belum diisi";
        this.npm = "Belum diisi";
        this.ipk = 0.0;
    }

    // Konstruktor dengan parameter nama dan npm
    public Mahasiswa(String nama, String npm) {
        this.nama = nama;
        this.npm = npm;
        this.ipk = 0.0;
    }

    // Konstruktor dengan semua parameter
    public Mahasiswa(String nama, String npm, double ipk) {
        this.nama = nama;
        this.npm = npm;
        this.ipk = ipk;
    }

    // Fungsi untuk menghitung rata-rata IPK (overloading)
    public double hitungRataRataIPK(
        ArrayList<Mahasiswa> listMahasiswa
        ) {
        double totalIPK = 0;
        for (Mahasiswa mhs : listMahasiswa) {
            totalIPK += mhs.ipk;
        }
        return totalIPK / listMahasiswa.size();
    }

    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public double getIpk() {
        return ipk;
    }

}