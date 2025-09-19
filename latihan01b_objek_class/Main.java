package latihan01b_objek_class;

public class Main {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
        m.npm = "20204350009";
        m.nama = "Jogiyanto";
        m.alamat = "Klaten";
        m.info();

        MataKuliah mk = new MataKuliah();
        mk.info();
    }
}
