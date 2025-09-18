package latihan06_polymorphism_gabung;

class Mahasiswa {
    String nama, nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    void tugas() {
        System.out.println("Mahasiswa sedang belajar.");
    }
}

class MahasiswaS1 extends Mahasiswa{
    int semester;

    public MahasiswaS1(String nama, String nim, int semester) {
        super(nama, nim);
        this.semester = semester;
    }

    void tugas() {
        System.out.println("Mhs S1 "+ 
        nama +", semester " + 
        semester +" sedang mengerjakan skripsi.");
    }
}

class MahasiswaS2 extends Mahasiswa {
    String bidangStudi;

    public MahasiswaS2(String nama, String nim, String bidangStudi) {
        super(nama, nim);
        this.bidangStudi = bidangStudi;
    }

    void tugas() {
        System.out.println(nama +" sedang mengerjakan tesis pada bidang "+ bidangStudi);
    }
}

class MahasiswaS3 extends Mahasiswa {
    String promotor;
    
    public MahasiswaS3(String nama, String nim, String promotor) {
        super(nama, nim);
        this.promotor = promotor;
    }

    void tugas() {
        System.out.println(nama + ", promotor "+ promotor + ", sedang mengerjakan disertasi");
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa("Agus", "20124350987");
        MahasiswaS1 m1 = new MahasiswaS1("Bambang", "20184350988", 9);
        MahasiswaS2 m2 = new MahasiswaS2("Andi", "20127689876", "Ekonomi");
        MahasiswaS3 m3 = new MahasiswaS3("Dimas", "20178768765", "Yuni");

        m.tugas();
        m1.tugas();
        m2.tugas();
        m3.tugas();
    }
}
