package latihan06_uts_2024; 

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Transaksi t = new Transaksi();

    public static void main(String[] args) {
        menuCargo();
        menuBarang();
        menuTransaksi();
    }

    static void menuCargo() {     
        String nama, alamat, telepon;

        System.out.println("----------<*>-----------");
        System.out.println("        DATA CARGO");
        System.out.println("----------<*>-----------");
        System.out.print("Nama :");
        nama = sc.nextLine();
        System.out.print("Alamat :");
        alamat = sc.nextLine();
        System.out.print("Telepon :");
        telepon = sc.nextLine();

        Cargo c = new Cargo(nama, alamat, telepon);
        t.simpanCargo(c);
    }
    // copy paste dari menuCargo
    static void menuBarang() {
        String kode, nama;

        System.out.println("----------<*>-----------");
        System.out.println("      DATA BARANG");
        System.out.println("----------<*>-----------");
        System.out.print("Kode :");
        kode = sc.nextLine();
        System.out.print("Nama :");
        nama = sc.nextLine();

        Barang b = new Barang(kode, nama);
        t.simpanBarang(b);
    }

    // copy dari menuBarang
    static void menuTransaksi() {
        int jumlah, harga;

        System.out.println("=======================");
        System.out.println("       KATEGORI");
        System.out.println("=======================");
        System.out.println("  A. 1-100");
        System.out.println("  B. 101-200");
        System.out.println("  C. > 200");
        System.out.println();
        System.out.print("Jumlah Barang: ");
        jumlah = sc.nextInt();
        System.out.print("Harga :");
        harga = sc.nextInt();   
        t.hitungTransaksi(jumlah, harga);        
    }
}
