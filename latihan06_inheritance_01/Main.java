package latihan06_inheritance_01;

public class Main {
    public static void main(String[] args) {
        Pasien pasienUmum = new PasienUmum("Andi", 25, "Laki-laki");
        Pasien pasienBPJS = new PasienBPJS("Budi", 30, "Laki-laki", "123456789");
        Pasien pasienVIP = new PasienVIP("Cici", 28, "Perempuan");

        pasienUmum.cetakInfo();
        pasienUmum.bayar();

        System.out.println();

        pasienBPJS.cetakInfo();
        pasienBPJS.bayar();

        System.out.println();

        pasienVIP.cetakInfo();
        pasienVIP.bayar();
    }
}
