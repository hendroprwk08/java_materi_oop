package latihan01e_CRUD;

import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private String npm;
    private String alamat;

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNpm() {
        return npm;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public static void tampilkanDataMahasiswa(ArrayList<Mahasiswa> mhsArrayList) {
        System.out.println("           DATA MAHASISWA");
        System.out.println("----------------------------------------");
        for (Mahasiswa mhs : mhsArrayList) {
            System.out.println(String.format("| %-5s | %-15s | %-10s |", 
            mhs.getNpm(), 
            mhs.getNama(), 
            mhs.getAlamat()));
            System.out.println("----------------------------------------");
        }        
    }

    /*
    public void info() {
        System.out.println("NPM: " + npm);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
    }
    */
}
