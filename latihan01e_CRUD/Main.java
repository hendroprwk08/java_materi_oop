package latihan01e_CRUD;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mahasiswa> mhsArrayList = new ArrayList<>();
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Ubah data Mahasiswa");
            System.out.println("4. Hapus data Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan Alamat: ");
                    String alamat = scanner.nextLine();

                    Mahasiswa mhs = new Mahasiswa();
                    mhs.setNpm(nim);
                    mhs.setNama(nama);
                    mhs.setAlamat(alamat);
                    mhsArrayList.add(mhs);
                    System.out.println("Data mahasiswa berhasil ditambahkan.");
                    break;

                case 2:
                    Mahasiswa.tampilkanDataMahasiswa(mhsArrayList);
                    break;

                case 3:
                    System.out.print("Masukkan NPM mahasiswa yang akan diubah: ");
                    String npmUbah = scanner.nextLine();
                    boolean foundUbah = false;
                    for (Mahasiswa m : mhsArrayList) {
                        if (m.getNpm().equals(npmUbah)) {
                            System.out.print("Masukkan Nama baru: ");
                            String namaBaru = scanner.nextLine();
                            System.out.print("Masukkan Alamat baru: ");
                            String alamatBaru = scanner.nextLine();

                            m.setNama(namaBaru);
                            m.setAlamat(alamatBaru);
                            foundUbah = true;
                            System.out.println("Data mahasiswa berhasil diubah.");
                            break;
                        }
                    }

                    if (!foundUbah) {
                        System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.");
                    }

                    break;

                case 4:
                    System.out.print("Masukkan NPM mahasiswa yang akan dihapus: ");
                    String npmHapus = scanner.nextLine();
                    boolean foundHapus = false;
                    for (int i = 0; i < mhsArrayList.size(); i++) {
                        if (mhsArrayList.get(i).getNpm().equals(npmHapus)) {
                            mhsArrayList.remove(i);
                            foundHapus = true;
                            System.out.println("Data mahasiswa berhasil dihapus.");
                            break;
                        }
                    }
                    if (!foundHapus) {
                        System.out.println("Mahasiswa dengan NPM tersebut tidak ditemukan.");
                    }
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
            }
        } while (pilihan != 5);

    }
}
