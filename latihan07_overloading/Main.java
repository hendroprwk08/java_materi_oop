package latihan07_overloading;

public class Main {
    public static void main(String[] args) {
        Pasien pasien = new Pasien("Sanusi", "Jl. Margahayu");

        // Menghitung biaya layanan umum
        int biayaUmum = pasien.hitungBiaya("cek urin");

        // Menghitung biaya tindakan khusus
        int biayaTindakan = pasien.hitungBiaya("cek darah", 3);

        System.out.println("Biaya umum     : "+ biayaUmum);
        System.out.println("Biaya tindakan : "+ biayaTindakan);
    }
}
