package latihan05_cuci_mobil_constructor;

import java.util.ArrayList;

public class Transaksi {
    
    ArrayList<Pemesan> pemesanList = new ArrayList<>();
    
    public void simpanPemesan(Pemesan p){
        pemesanList.add(p);
    }

    public void menuJenis(){
        System.out.println("---- JENIS JASA ----");
        System.out.println("1. Cuci Mobil");
        System.out.println("2. Interior");
        System.out.println("3. Detailing");
    }

    public int getBiayaJenis(int j){ // method return

        if(j == 1){
            return 30000;
        }else if(j == 2){
            return 250000;
        }else if(j == 3){
            return 80000;
        }

        return 0;
    }

    public void menuKaryawan(){
        System.out.println("---- KARYAWAN ----");
        System.out.println("1. Sidik Wibowo");
        System.out.println("2. Thomas Anum");
        System.out.println("3. Wiratno");
        System.out.println("4. Deni Suryana");
    }

    public String pilihKaryawan(int k){ // method return
        
        if(k == 1){
            return "Sidik Wibowo";
        }else if(k == 2){
            return "Thomas Anum";
        }else if(k == 3){
            return "Wiratno";  
        }else if(k == 4){
            return "Deni Suryana";
        }

        return null;
    }

}
