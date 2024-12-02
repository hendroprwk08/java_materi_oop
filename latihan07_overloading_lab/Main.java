package latihan07_overloading_lab;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Mahasiswa> mhsList = new ArrayList();
    static Scanner sc = new Scanner(System.in);
    static int pilih = 0;

    public static void main(String[] args) {
        do {
            System.out.println("===============================");
            System.out.println("        DATA MAHASISWA");
            System.out.println("===============================");
            System.out.println("  1. Tambah Data");
            System.out.println("  2. Tampilkan");
            System.out.println("  3. Keluar");
            System.out.println("===============================");
            System.out.print("Pilih [ 1-3 ]: ");
            pilih = sc.nextInt();

            if (pilih == 1) {
                menuTambah();
            } else if (pilih == 2) {
                menuTampil();
            } 
        } while (pilih != 3);

    }

    private static void menuTampil() {
        if(mhsList.size() == 0){
            System.out.println("[ Kosong ]");
        }else{
            System.out.println("DATA MAHASISWA");
            System.out.println("-----------------------------");
            for (Mahasiswa m : mhsList) {
                System.out.printf(
                        "%-5s | %-13s | %-4s |",
                        m.getNpm().substring(0, 5), // 5 digit saja
                        (m.getNama().length() > 13) ? m.getNama().substring(0, 13) : m.getNama(),
                        m.getIpk());
                System.out.println();            
            }
            System.out.println("-----------------------------");
            System.out.println("Rata-rata "+ new Mahasiswa().hitungRataRataIPK(mhsList));
            System.out.println("Lanjut...");
            sc.nextLine();
            sc.nextLine();
        }
    }

    private static void menuTambah() {
        String npm, nama;
        double ipk;
        boolean valid = true;

        do {
            sc.nextLine();
            System.out.print("NPM: ");
            npm = sc.nextLine();
            System.out.print("Nama: ");
            nama = sc.nextLine();
            System.out.print("IPK: ");
            ipk = sc.nextDouble();

            if (npm.length() == 0 || nama.length() == 0) {
                valid = false;
                System.out.println("[ NPM dan Nama wajib diisi ]");
            }else{
                valid = true;
            }
            
        } while (valid = false);

        Mahasiswa m;

        if (ipk == 0.0) {
            m = new Mahasiswa(npm, nama);
        } else {
            m = new Mahasiswa(npm, nama, ipk);
        }

        mhsList.add(m);

        System.out.println("[ Data mahasiswa tersimpan. ]");
    }

}
