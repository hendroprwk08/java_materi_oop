package latihan06_polymorphism_gabung;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Mahasiswa {
    String nama, nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    void tugas() {
        System.out.println("Mahasiswa " + nama + " sedang belajar mandiri.");
    }
}

// Mahasiswa S1 dengan tambahan nilai skripsi dan nama kelas
class MahasiswaS1 extends Mahasiswa {
    int semester;
    double nilaiSkripsi;
    String namaKelas;

    public MahasiswaS1(String nama, String nim, int semester, double nilaiSkripsi, 
        String namaKelas) {
        super(nama, nim);
        this.semester = semester;
        this.nilaiSkripsi = nilaiSkripsi;
        this.namaKelas = namaKelas;
    }

    @Override
    void tugas() {
        System.out.println("Mhs S1 " + nama + ", semester " + semester +
                " dari kelas " + namaKelas +
                " sedang mengerjakan skripsi dengan nilai " + nilaiSkripsi);
    }
}

class MahasiswaS2 extends Mahasiswa {
    String bidangStudi;

    public MahasiswaS2(String nama, String nim, String bidangStudi) {
        super(nama, nim);
        this.bidangStudi = bidangStudi;
    }

    @Override
    void tugas() {
        System.out.println(nama + " sedang mengerjakan tesis pada bidang " + bidangStudi);
    }
}

class MahasiswaS3 extends Mahasiswa {
    String promotor;

    public MahasiswaS3(String nama, String nim, String promotor) {
        super(nama, nim);
        this.promotor = promotor;
    }

    @Override
    void tugas() {
        System.out.println(nama + ", promotor " + promotor + ", sedang mengerjakan disertasi.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        System.out.print("Berapa jumlah mahasiswa yang ingin diinput? ");
        int jumlah = sc.nextInt();
        sc.nextLine(); // bersihkan buffer

        for (int i = 1; i <= jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + i);
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("NIM: ");
            String nim = sc.nextLine();

            System.out.print("Jenjang (1=S1, 2=S2, 3=S3, lainnya=umum): ");
            int jenjang = sc.nextInt();
            sc.nextLine(); // bersihkan buffer

            switch (jenjang) {
                case 1:
                    System.out.print("Semester: ");
                    int semester = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Nilai Skripsi: ");
                    double nilai = sc.nextDouble();
                    sc.nextLine();
                    daftarMahasiswa.add(new MahasiswaS1(nama, nim, semester, nilai, kelas));
                    break;
                case 2:
                    System.out.print("Bidang Studi: ");
                    String bidang = sc.nextLine();
                    daftarMahasiswa.add(new MahasiswaS2(nama, nim, bidang));
                    break;
                case 3:
                    System.out.print("Nama Promotor: ");
                    String promotor = sc.nextLine();
                    daftarMahasiswa.add(new MahasiswaS3(nama, nim, promotor));
                    break;
                default:
                    daftarMahasiswa.add(new Mahasiswa(nama, nim));
            }
        }

        // Cetak Report
        System.out.println("\n=== REPORT MAHASISWA ===");
        for (Mahasiswa mhs : daftarMahasiswa) {
            mhs.tugas(); // polymorphism: method sesuai tipe objek
        }

        sc.close();
    }
}