package latihan07_overloading;

public class Pasien {
    private String nama;
    private String alamat;
    
    public Pasien(String string, String string2) {
        //TODO Auto-generated constructor stub
    }

    public int hitungBiaya(String jenisLayanan) {
        if(jenisLayanan.equalsIgnoreCase("Suntik")){
            return 25000;
        }else if(jenisLayanan.equalsIgnoreCase("Cek Darah")){
            return 65000;
        }else if(jenisLayanan.equalsIgnoreCase("Cek Urin")){
            return 60000;
        }

        return 0;
    }

    public int hitungBiaya(String jenisLayanan, int jumlahTindakan) {
        if(jenisLayanan.equalsIgnoreCase("Suntik")){
            return 25000 * jumlahTindakan;
        }else if(jenisLayanan.equalsIgnoreCase("Cek Darah")){
            return 65000 * jumlahTindakan;
        }else if(jenisLayanan.equalsIgnoreCase("Cek Urin")){
            return 60000 * jumlahTindakan;
        }

        return 0;
    }
}
