package latihan01c_input;

import java.util.ArrayList;

public class Barang {
    private int idBarang;
    private String namaBarang;
    private int harga;
    private int stok;

    public int getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(int idBarang) {
        this.idBarang = idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void tambahStok(int jumlah) {
        this.stok += jumlah;
    }

    public void kurangiStok(int jumlah) {
        if (jumlah <= stok) {
            this.stok -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi.");
        }
    }

    // menggunakan static agar dapat langsung diakses
    public static void tampilkanDaftarBarang(ArrayList<Barang> daftarBarang) {
        System.out.println("ID    | Nama Barang     | Harga    | Stok  ");
        System.out.println("----------------------------------------------");
        for (Barang b : daftarBarang) {
            System.out.println(String.format("%-5d | %-15s | %-8d | %-6d ",
                    b.getIdBarang(), b.getNamaBarang(), b.getHarga(), b.getStok()));
        }
    }
}