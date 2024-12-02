package latihan06_polymorphism;

public class MahasiswaS2 extends Mahasiswa {
    String bidangStudi;

    public MahasiswaS2(String nama, String nim, String bidangStudi) {
        super(nama, nim);
        this.bidangStudi = bidangStudi;
    }

    void tugas() {
        System.out.println(nama +" sedang mengerjakan tesis pada bidang "+ bidangStudi);
    }
}
