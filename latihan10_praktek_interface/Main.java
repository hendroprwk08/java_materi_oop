package latihan10_praktek_interface;

import java.util.Scanner;

import latihan10_praktek_interface.model.Mahasiswa;

public class Main {
    private static MahasiswaImplementation implementation = new MahasiswaImplementation();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== MENU CRUD MAHASISWA ===");
            System.out.println("1. Tambah");
            System.out.println("2. Lihat");
            System.out.println("3. Update");
            System.out.println("4. Hapus");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // buang newline

            switch (pilihan) {
                case 1:
                    tambah();
                    break;
                case 2:
                    show();   
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    hapus();
                    break;
            }
        } while (pilihan != 0);
    }

    private static void tambah() {
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Jurusan: ");
        String jurusan = sc.nextLine();
        implementation.tambah(new Mahasiswa(nim, nama, jurusan));
    }

    private static void show() {
        System.out.println("=== Data Mahasiswa ===");
        int i = 0;
        for (Mahasiswa m : implementation.getAll()) {
            System.out.println((i++) + ". " + m);
        }
    }

    private static void update() {
        System.out.print("Index yang mau diupdate: ");
        int idx = sc.nextInt(); sc.nextLine();
        System.out.print("NIM baru: ");
        String nim = sc.nextLine();
        System.out.print("Nama baru: ");
        String nama = sc.nextLine();
        System.out.print("Jurusan baru: ");
        String jurusan = sc.nextLine();
        implementation.update(idx, new Mahasiswa(nim, nama, jurusan));
    }

    private static void hapus() {
        System.out.print("Index yang mau dihapus: ");
        int idx = sc.nextInt(); sc.nextLine();
        implementation.hapus(idx);
    }
}