package latihan01b_pengenalan_list;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Buku> bukuList = new ArrayList<>();

        Buku b1 = new Buku();
        b1.setJudul("Bumi");        
        b1.setPengarang("Tere Liye");        
        b1.setLembar(230);
        
        bukuList.add(b1); // simpan buku pertama 
        
        Buku b2 = new Buku();
        b2.setJudul("Menara Kertas");        
        b2.setPengarang("Makmun");        
        b2.setLembar(190);
        
        bukuList.add(b2); // simpan buku kedua
        
        // tampilkan data buku 
        // yang tersimpan dalam bukuList
        for (Buku b : bukuList) {
            System.out.println("Judul: "+ b.getJudul());
            System.out.println("Pengarang: "+ b.getPengarang());
            System.out.println("Lembar: "+ b.getLembar());
            System.out.println();
        }
    }
}
