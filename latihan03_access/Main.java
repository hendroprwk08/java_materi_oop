package latihan03_access;

public class Main {
    public static void main (String[] args){
        Mahasiswa m = new Mahasiswa();
        
        // tidak bisa akses, akan memunculkan error
        // m.npm = "20204350009";
        // m.nama = "Jogiyanto";
        // m.alamat = "Klaten";

        // harus akses melali method
        // yang telah disediakan
        m.setNpm("20204350009");
        m.setNama("Jogiyanto");
        m.setAlamat("Klaten");

        // bisa akses langsung ke variabel UNIVERSITAS
        // tetapi tak bisa diubah
        // m.UNIVERSITAS = "Universitas hasanuddin";
        
        // namun bisa dimunculkan
        System.out.println(m.UNIVERSITAS);

        m.info();
    }
}
