package latihan04_koperasi;

public class KaryawanHonorer extends Karyawan{
    
    public void infoPinjam(){
        int pinjaman = 0;
        
        if(this.golongan.equalsIgnoreCase("A")){
            pinjaman = 30000000;
        }else if(this.golongan.equalsIgnoreCase("B")){
            pinjaman = 20000000;
        }else if(this.golongan.equalsIgnoreCase("C")){
            pinjaman = 10000000;
        }

        double bunga = (double) pinjaman * 0.025;
        int jumlah = (pinjaman - (int)bunga);
        int perbulan = pinjaman / bulan;
        
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
        System.out.println(String.format("Bulanan: \tRp.%,2d ", perbulan));
        System.out.println(String.format("Selama: \t%d bulan", bulan));   
    }
    
}
