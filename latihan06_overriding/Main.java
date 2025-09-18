package latihan06_overriding;

public class Main {
    public static void main(String[] args) {
        Pasien pasienUmum = new PasienUmum();
        Pasien pasienBPJS = new PasienBPJS();
        Pasien pasienVIP = new PasienVIP();

        double biayaUmum = pasienUmum.hitungBiaya();
        double biayaBPJS = pasienBPJS.hitungBiaya();
        double biayaVIP = pasienVIP.hitungBiaya();

        System.out.println("Biaya pasien umum: " + biayaUmum);
        System.out.println("Biaya pasien BPJS: " + biayaBPJS);
        System.out.println("Biaya pasien VIP: " + biayaVIP);
    }
}