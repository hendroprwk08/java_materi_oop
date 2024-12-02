package latihan06_polymorphism;

public class MahasiswaS3 extends Mahasiswa {
    String promotor;
    
    public MahasiswaS3(String nama, String nim, String promotor) {
        super(nama, nim);
        this.promotor = promotor;
    }

    void tugas() {
        System.out.println(nama + ", promotor "+ promotor + ", sedang mengerjakan disertasi");
    }
}
  