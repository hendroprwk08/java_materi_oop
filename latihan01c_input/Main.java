package latihan01c_input;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Barang> daftarBarang = new ArrayList<>();
        int pilihan;

        do {
            System.out.println("\n=== MENU BARANG RETAIL ===");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan Semua Barang");
            System.out.println("3. Tambah Stok Barang");
            System.out.println("4. Kurangi Stok Barang");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    Barang barang = new Barang();

                    System.out.print("ID Barang [number]: ");
                    barang.setIdBarang(input.nextInt());
                    input.nextLine();

                    System.out.print("Nama Barang: ");
                    barang.setNamaBarang(input.nextLine());

                    System.out.print("Harga [number]: ");
                    barang.setHarga(input.nextInt());

                    System.out.print("Stok [number]: ");
                    barang.setStok(input.nextInt());
                    input.nextLine();

                    daftarBarang.add(barang); // simpan
                    
                    System.out.println("Barang berhasil ditambahkan.");
                    break;

                case 2:
                    Barang.tampilkanDaftarBarang(daftarBarang);
                    input.nextLine();
                    break;

                case 3:
                    System.out.print("Masukkan ID Barang untuk tambah stok: ");
                    int idTambah = input.nextInt();
                    System.out.print("Jumlah stok yang ditambahkan: ");
                    int jumlahTambah = input.nextInt();

                    for (Barang b : daftarBarang) {
                        if (b.getIdBarang() == idTambah) {
                            b.tambahStok(jumlahTambah);
                            System.out.println("Stok berhasil ditambahkan.");
                        }
                    }
                    break;

                case 4:
                    System.out.print("Masukkan ID Barang untuk kurangi stok: ");
                    int idKurang = input.nextInt();
                    System.out.print("Jumlah stok yang dikurangi: ");
                    int jumlahKurang = input.nextInt();

                    for (Barang b : daftarBarang) {
                        if (b.getIdBarang() == idKurang) {
                            b.kurangiStok(jumlahKurang);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 5);

        input.close();
    }
}