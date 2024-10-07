package latihan05_cuci_mobil;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String nama, alamat, telepon, surel;
        int jenis = 0, karyawan = 0;

        System.out.println("--- DATA PEMESAN ---");
        System.out.print("Nama: \t\t");
        nama = sc.nextLine();
        System.out.print("Alamat: \t");
        alamat = sc.nextLine();
        System.out.print("Telepon: \t");
        telepon = sc.nextLine();
        System.out.print("Surel: \t\t");
        surel = sc.nextLine();

        Pemesan p = new Pemesan();
        p.setNama(nama);
        p.setAlamat(alamat);
        p.setTelepon(telepon);
        p.setSurel(surel);

        Transaksi t = new Transaksi();        
        t.simpanPemesan(p);

        // masukkan pilihan
        boolean valid = false;
        t.menuJenis();

        // memastikan user harus input integer
        while (!valid) {
            System.out.print("[ Ketik 1/2/3 ]: ");

            if (sc.hasNextInt()) {
                jenis = sc.nextInt();

                if (jenis > 3) {
                    System.out.println("[ Pilihanmu salah, Coba lagi. ]");
                    valid = false;
                } else {
                    valid = true;
                }
            } else {
                System.out.println("[ Coba lagi! ]");
                sc.next();
                valid = false;
            }
        }

        // menu Karyawan
        t.menuKaryawan();
        valid = false;
        
        while (!valid) {
            System.out.print("[ Ketik 1/2/3/4 ]: ");

            if (sc.hasNextInt()) {
                karyawan = sc.nextInt();

                if (karyawan > 4) {
                    System.out.println("[ Pilihanmu salah, Coba lagi. ]");
                    valid = false;
                } else {
                    valid = true;
                }
            } else {
                System.out.println("[ Coba lagi! ]");
                sc.next();
                valid = false;
            }
        }

        // Hasil
        System.out.println("----- INFO PEMESANAN -----");
        System.out.println("Nama: \t\t"+ t.pemesanList.get(0).getNama());
        System.out.println("Alamat: \t"+ t.pemesanList.get(0).getAlamat());
        System.out.println("Telepon: \t"+ t.pemesanList.get(0).getTelepon());
        System.out.println("Surel: \t\t"+ t.pemesanList.get(0).getSurel());
        System.out.println("---------- BIAYA ----------");
        System.out.println("Karyawan: \t"+ t.pilihKaryawan(karyawan));

        int jasa = t.getBiayaJenis(jenis);
        double pajak = jasa * 0.025;
        int total = jasa + (int)pajak;

        System.out.println(String.format("By. Jasa: \tRp.%,2d", jasa));
        System.out.println(String.format("Pajak: \t\tRp.%,2d", (int)pajak ));
        System.out.println("---------------------------");
        System.out.println(String.format("Total: \t\tRp.%,2d", total));
    }

}
