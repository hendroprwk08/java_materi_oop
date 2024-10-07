package latihan04_koperasi;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int pilih = 0;
    
    public static void main(String[] args) {
        do {
            boolean valid = false;
            mainMenu();

            // memastikan user harus input integer
            while (!valid) {
                System.out.print("[ Ketik 1/2/3 ]: ");

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
                mainInputKaryawan(1); // karyawan tetap
            } else if (pilih == 2) {
                mainInputKaryawan(2); // karyawan honorer
            }

        } while (pilih != 3);
    }

    private static void mainInputKaryawan(int tipe) {
        String nik, nama, golongan;
        int bulan;

        sc.nextLine();
        System.out.print("NIK: ");
        nik = sc.nextLine();
        System.out.print("Nama: ");
        nama = sc.nextLine();

        //menu golongan
        System.out.print("Golongan [ A/B/C ]: ");
        golongan = sc.nextLine();

        System.out.print("Lama pinjaman (bln): ");
        bulan = sc.nextInt();

        if(tipe == 1){ // karyawan tetap
            // KaryawanTetap k = new KaryawanTetap(nik, nama, golongan, bulan);
            KaryawanTetap k = new KaryawanTetap();
            k.setNik(nik);
            k.setNama(nama);
            k.setGolongan(golongan);
            k.setBulan(bulan);
            k.infoPinjam();
        }else if(tipe == 2){ // karyawan honorer
            // KaryawanHonorer k = new KaryawanHonorer(nik, nama, golongan, bulan);
            KaryawanHonorer k = new KaryawanHonorer();
            k.setNik(nik);
            k.setNama(nama);
            k.setGolongan(golongan);
            k.setBulan(bulan);
            k.infoPinjam();        
        }
        
        System.out.print("[ Tekan apapun untuk lanjut ]");
        sc.nextLine();
        sc.nextLine();
    }

    private static void mainMenu() {
        System.out.println("-----------------------");
        System.out.println("1. Karyawan Tetap");
        System.out.println("2. Karyawan Honorer");
        System.out.println("3. Keluar");
        System.out.println("-----------------------");
    }
}
