package latihan06_uts_2024;

import java.util.ArrayList;


public class Transaksi {
    ArrayList<Cargo> cargoList = new ArrayList<>();
    ArrayList<Barang> barangList = new ArrayList<>();
    
    void simpanCargo(Cargo c){
        cargoList.add(c);
    }

    void simpanBarang(Barang b){
        barangList.add(b);
    }

    void hitungTransaksi(int j, int h){
        String kategori = "X";
        double pajak = 0.0;
        
        if(j >= 1 || j <= 100){
            kategori = "A";
            pajak = 0.025;
        }else if(j >= 101 || j <= 200){
            kategori = "B";
            pajak = 0.005;
        }else if(j >= 201){
            kategori = "C";
            pajak = 0.1;
        }
        
        double total = (h * j) * pajak;

        System.out.println("=== Pembayaran ===");
        System.out.println("Kategori : "+ kategori);
        System.out.println("Pajak : "+ pajak );
        System.out.println(String.format("Total : Rp.%,2d", (int)total));
        System.out.println();
        System.out.println("========================");
        System.out.println("Cargo    : "+ this.cargoList.get(0).getNama());
        System.out.println("Barang   : "+ this.barangList.get(0).getNama());
    }

}
