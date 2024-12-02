package latihan06_polymorphism;

public class MahasiswaS1 extends Mahasiswa{
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
