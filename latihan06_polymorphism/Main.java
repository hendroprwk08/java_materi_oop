package latihan06_polymorphism;

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
