package latihan06_polymorphism;

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
