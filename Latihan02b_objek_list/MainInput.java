package Latihan02b_objek_list;

import java.util.Scanner;

public class MainInput {
    
    static Scanner sc = new Scanner(System.in);
    static int pilih = 0;
    static Petugas p = new Petugas();

    public static void main(String[] args) {
        do {
            boolean valid = false;
            mainMenu();

            // memastikan user harus input integer
            while (!valid) {
                System.out.print("[ Ketik 1/2/3/4 ]: ");

                if (sc.hasNextInt()) {
                    pilih = sc.nextInt();

                    if(pilih > 4){
                        System.out.println("[ Menu salah!, Coba lagi. ]");
                        valid = false;
                    }else{
                        valid = true;        
                    }
                } else {
                    System.out.println("[ Coba lagi! ]");
                    sc.next();
                    valid = false;
                }
            }

            if (pilih == 1) {
                mainTambahAnggota();
            } else if (pilih == 2) {
                p.tampilAnggota();
                System.out.print("[ Tekan apapun untuk kembali ]");
                sc.nextLine();
                sc.nextLine();
            } else if (pilih == 3) {
                mainHapusAnggota();
            }

        } while (pilih != 4);
    }

    static void mainMenu() {
        System.out.println("Jumlah data: " + p.jumlahAnggota());
        System.out.println("-----------------------");
        System.out.println("1. Tambah Anggota");
        System.out.println("2. Tampilkan Anggota");
        System.out.println("3. Hapus Anggota");
        System.out.println("4. Keluar");
        System.out.println("-----------------------");
    }

    static void mainTambahAnggota() {
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

        p.simpanAnggota(a);
        System.out.println("[ Data anggota tersimpan. ]");
    }
    
    static void mainHapusAnggota() {
        boolean valid = false;
        int baris = 0;

        p.tampilAnggota();

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
        if (baris > p.jumlahAnggota() ) {            
            System.out.println("[ Gagal hapus, baris salah ]");
            sc.nextLine();
            sc.nextLine();
        } else {
            p.hapusAnggota(baris - 1);
            System.out.println("[ Berhasil dihapus ]");
        }
        
    }
    
}