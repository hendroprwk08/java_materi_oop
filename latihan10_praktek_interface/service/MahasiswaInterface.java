package latihan10_praktek_interface.service;

import latihan10_praktek_interface.model.Mahasiswa; 
import java.util.List;

public interface MahasiswaInterface {
    void tambah(Mahasiswa mhs);
    void update(int index, Mahasiswa mhs);
    void hapus(int index);
    List<Mahasiswa> getAll();
}
