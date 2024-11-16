package latihan08_praUAP;

// Class Main
public class Main {
    public static void main(String[] args) {
        PasienRawatJalan pasien = new PasienRawatJalan("Andi", "Jakarta", "Demam");
        Dokter dokter = new Dokter();
        Perawat perawat = new Perawat();

        pasien.cetakData();
        dokter.periksa();
        perawat.beriObat();
    }
}