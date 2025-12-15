package latihan10_praktek_interface;

import java.util.ArrayList;
import java.util.List;

import latihan10_praktek_interface.model.Mahasiswa;
import latihan10_praktek_interface.service.MahasiswaInterface;

public class MahasiswaImplementation implements MahasiswaInterface {
    private List<Mahasiswa> data = new ArrayList<>();

    @Override
    public void tambah(Mahasiswa mhs) {
        data.add(mhs);
    }

    @Override
    public void update(int index, Mahasiswa mhs) {
        if (index >= 0 && index < data.size()) {
            data.set(index, mhs);
        }
    }

    @Override
    public void hapus(int index) {
        if (index >= 0 && index < data.size()) {
            data.remove(index);
        }
    }

    @Override
    public List<Mahasiswa> getAll() {
        return data;
    }
}