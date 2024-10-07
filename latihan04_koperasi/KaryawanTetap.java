package latihan04_koperasi;

public class KaryawanTetap {
    private String nik, nama, golongan;
    private int bulan;
    
    // jangan gunakan constructor sebelum UTS
    // public KaryawanTetap(String nk, String nm, String gl, int bl) {
    //     this.nik = nk;
    //     this.nama = nm;
    //     this.golongan = gl;
    //     this.bulan = bl;
    // }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

    public void setBulan(int bulan) {
        this.bulan = bulan;
    }

    public void infoPinjam(){
        int pinjaman = 0;
        
        if(this.golongan.equalsIgnoreCase("A")){
            pinjaman = 100000000;
        }else if(this.golongan.equalsIgnoreCase("B")){
            pinjaman = 75000000;
        }else if(this.golongan.equalsIgnoreCase("C")){
            pinjaman = 50000000;
        }

        double bunga = (double) pinjaman * 0.025;
        int jumlah = (pinjaman + (int)bunga);
        int perbulan = jumlah / bulan;
        
        System.out.println("--- INFO PEMINJAM ---");
        System.out.println("NIK : \t\t"+ this.nik);
        System.out.println("Nama : \t\t"+ this.nama);
        System.out.println();
        System.out.println("--- DETIL PINJAMAN ---");
        System.out.println(String.format("Pinjaman: \tRp.%,2d", pinjaman));
        System.out.println(String.format("Bunga: \t\tRp.%,2d", (int)bunga));
        System.out.println("-----------------------------");
        System.out.println(String.format("Jumlah: \tRp.%,2d", jumlah));
        System.out.println("=============================");
        System.out.println(String.format("Bulanan: \tRp.%,2d", perbulan));     
        System.out.println(String.format("Selama: \t%d bulan", bulan));   
    }
    
}
