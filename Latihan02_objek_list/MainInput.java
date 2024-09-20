package Latihan02_objek_list;

import java.util.ArrayList;
import java.util.Scanner;

public class MainInput {
    static Scanner sc = new Scanner(System.in);
    static int pilih = 0;
    static ArrayList<Anggota> anggotaList = new ArrayList<>();

    public static void main(String[] args) {
        do {
            boolean valid = false;
            menu();

            // memastikan user harus input integer
            while (!valid) {
                System.out.print("[ Ketik 1/2/3/4 ]: ");

                if (sc.hasNextInt()) {
                    pilih = sc.nextInt();
                    valid = true;
                } else {
                    System.out.println("[ Coba lagi! ]");
                    sc.next();
                }
            }

            if (pilih == 1) {
                tambahAnggota();
            } else if (pilih == 2) {
                tampilAnggota(anggotaList);
                System.out.print("[ Tekan apapun untuk kembali ]");
                sc.nextLine();
                sc.nextLine();
            } else if (pilih == 3) {
                hapusAnggota(anggotaList);
            }

        } while (pilih != 4);
    }

    static void menu() {
        System.out.println("Jumlah data: " + anggotaList.size());
        System.out.println("-----------------------");
        System.out.println("1. Tambah Anggota");
        System.out.println("2. Tampilkan Anggota");
        System.out.println("3. Hapus Anggota");
        System.out.println("4. Keluar");
        System.out.println("-----------------------");
    }

    static void tambahAnggota() {
        String npm, nama, kelas;

        sc.nextLine();
        System.out.print("NPM: ");
        npm = sc.nextLine();
        System.out.print("Nama: ");
        nama = sc.nextLine();
        System.out.print("Kelas: ");
        kelas = sc.nextLine();

        Anggota a = new Anggota();
        a.setNpm(npm);
        a.setNama(nama);
        a.setKelas(kelas);

        anggotaList.add(a); // simpan
        System.out.println("[ Data anggota tersimpan. ]");
    }

    static void tampilAnggota(ArrayList<Anggota> anggotaList) {
        System.out.println("DATA ANGGOTA");
        System.out.println("------------------------------------");

        if (anggotaList.size() == 0) {
            System.out.println("KOSONG!");
        } else {
            for (int i = 0; i < anggotaList.size(); i++) {
                System.out.printf(
                        "| %-2s | %-5s | %-13s | %-3s |",
                        i + 1,
                        anggotaList.get(i).getNpm(),
                        (anggotaList.get(i).getNama().length() > 13) ? anggotaList.get(i).getNama().substring(0, 13)
                                : anggotaList.get(i).getNama(),
                        anggotaList.get(i).getKelas());
                System.out.println();
            }
        }

        System.out.println("------------------------------------");
    }

    static void hapusAnggota(ArrayList<Anggota> anggotaList) {
        boolean valid = false;
        int baris = 0;

        tampilAnggota(anggotaList);

        // memastikan user harus input integer
        while (!valid) {
            System.out.print("[ Pilih baris yang akan dihapus ]: ");

            if (sc.hasNextInt()) {
                baris = sc.nextInt();
                valid = true;
            } else {
                System.out.println("[ Coba lagi! ]");
                sc.next();
            }
        }

        // jika salah baris
        if (baris > anggotaList.size() ) {            
            System.out.println("[ Gagal hapus, baris salah ]");
            sc.nextLine();
            sc.nextLine();
        } else {
            anggotaList.remove(baris - 1);
            System.out.println("[ Berhasil dihapus ]");
        }
    }

}
