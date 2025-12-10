package latihan09_overriding_jswing;

import javax.swing.*;
import java.awt.*;

public class FormPerpustakaan extends JFrame {

    // inisiasi perpustakaan
    private Perpustakaan perpustakaan = new Perpustakaan();

    // inisiasi komponen
    private JTextField txtJudul = new JTextField();
    private JTextField txtPenulis = new JTextField();
    private JTextField txtTahun = new JTextField();
    private JTextField txtGenreTopik = new JTextField();

    private JComboBox<String> cmbJenis = new JComboBox<>(new String[] { "Fiksi", "NonFiksi" });
    private JTextArea areaOutput = new JTextArea(5, 5);

    public FormPerpustakaan() {
        // JFrame
        setTitle("Form Perpustakaan");
        setSize(350, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // judul
        JLabel lblJudul = new JLabel("Judul:");
        lblJudul.setBounds(20, 20, 80, 25);
        add(lblJudul);

        txtJudul.setBounds(100, 20, 200, 25);
        add(txtJudul);

        // penulis
        JLabel lblPenulis = new JLabel("Penulis:");
        lblPenulis.setBounds(20, 50, 80, 25);
        add(lblPenulis);

        txtPenulis.setBounds(100, 50, 200, 25);
        add(txtPenulis);

        // tahun terbit
        JLabel lblTahunTerbit = new JLabel("Tahun:");
        lblTahunTerbit.setBounds(20, 80, 80, 25);
        add(lblTahunTerbit);

        txtTahun.setBounds(100, 80, 50, 25);
        add(txtTahun);

        // jenis buku
        JLabel lblJenis = new JLabel("Jenis Buku:");
        lblJenis.setBounds(20, 110, 80, 25);
        add(lblJenis);

        cmbJenis.setBounds(100, 110, 200, 25);
        add(cmbJenis);

        // genre atau topik
        JLabel lblGenreTopik = new JLabel("Genre/Topik:");
        lblGenreTopik.setBounds(20, 140, 80, 25);
        add(lblGenreTopik);

        txtGenreTopik.setBounds(100, 140, 200, 25);
        add(txtGenreTopik);

        // tombol tambah
        JButton btnTambah = new JButton("Tambah");
        btnTambah.setBounds(20, 180, 90, 30);
        add(btnTambah);

        // tombol hapus
        JButton btnHapus = new JButton("Hapus");
        btnHapus.setBounds(115, 180, 90, 30);
        add(btnHapus);

        // tombol tampil
        JButton btnTampil = new JButton("Tampil");
        btnTampil.setBounds(210, 180, 90, 30);
        add(btnTampil);

        // area output
        areaOutput.setEditable(true);

        // bungkus dengan JScrollPane
        JScrollPane scrollPane = new JScrollPane(areaOutput);
        scrollPane.setBounds(20, 230, 280, 100);
        add(scrollPane);

        // tambahkan action listener untuk tombol
        btnTambah.addActionListener(e -> tambahBuku());
        btnHapus.addActionListener(e -> hapusBuku());
        btnTampil.addActionListener(e -> tampilkanSemuaBuku());
    }

    private void tampilkanSemuaBuku() {
        areaOutput.setText("Daftar Buku:\n");
        for (Buku b : perpustakaan.koleksiBuku) {
            areaOutput.append("Judul: " + b.judul + "\n");
            areaOutput.append("Penulis: " + b.penulis + "\n");
            areaOutput.append("Tahun: " + b.tahunTerbit + "\n");

            if (b instanceof BukuFiksi) {
                areaOutput.append("Genre: " + ((BukuFiksi) b).genre + "\n");
            } else if (b instanceof BukuNonFiksi) {
                areaOutput.append("Topik: " + ((BukuNonFiksi) b).topik + "\n");
            }
            areaOutput.append("----------------------\n");
        }
    }

    private void tambahBuku() {
        try {
            String judul = txtJudul.getText();
            String penulis = txtPenulis.getText();
            int tahun = Integer.parseInt(txtTahun.getText());
            String genreTopik = txtGenreTopik.getText();

            // simpan buku berdasarkan jenisnya
            Buku buku;
            if (cmbJenis.getSelectedItem().equals("Fiksi")) {
                buku = new BukuFiksi(judul, penulis, tahun, genreTopik);
            } else {
                buku = new BukuNonFiksi(judul, penulis, tahun, genreTopik);
            }

            perpustakaan.tambahBuku(buku);
            areaOutput.append("Buku berhasil ditambahkan!\n");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Input tidak valid!");
        }
    }

    private void hapusBuku() {
        String judul = JOptionPane.showInputDialog(this, "Masukkan judul buku yang ingin dihapus:");
        Buku b = perpustakaan.cariBuku(judul);
        if (b != null) {
            perpustakaan.hapusBuku(b);
            areaOutput.append("Buku berhasil dihapus!\n");
        } else {
            areaOutput.append("Buku tidak ditemukan.\n");
        }
    }
}