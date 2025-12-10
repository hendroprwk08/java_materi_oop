package latihan06_inheritance_01;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        java.util.List<Pasien> daftarPasien = new java.util.ArrayList<>();

        while (true) {
            System.out.println("=== Menu Pasien ===");
            System.out.println("1. Input Pasien Umum");
            System.out.println("2. Input Pasien BPJS");
            System.out.println("3. Input Pasien VIP");
            System.out.println("4. Tampilkan Semua Pasien");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            String pilihan = scanner.nextLine().trim();

            switch (pilihan) {
                case "1":
                    System.out.print("Nama: ");
                    String namaU = scanner.nextLine();
                    System.out.print("Umur: ");
                    int umurU = parseIntSafe(scanner.nextLine());
                    System.out.print("Jenis Kelamin: ");
                    String jkU = scanner.nextLine();
                    daftarPasien.add(new PasienUmum(namaU, umurU, jkU));
                    System.out.println("Pasien umum berhasil ditambahkan.");
                    break;
                case "2":
                    System.out.print("Nama: ");
                    String namaB = scanner.nextLine();
                    System.out.print("Umur: ");
                    int umurB = parseIntSafe(scanner.nextLine());
                    System.out.print("Jenis Kelamin: ");
                    String jkB = scanner.nextLine();
                    System.out.print("No. Kartu BPJS: ");
                    String noKartu = scanner.nextLine();
                    daftarPasien.add(new PasienBPJS(namaB, umurB, jkB, noKartu));
                    System.out.println("Pasien BPJS berhasil ditambahkan.");
                    break;
                case "3":
                    System.out.print("Nama: ");
                    String namaV = scanner.nextLine();
                    System.out.print("Umur: ");
                    int umurV = parseIntSafe(scanner.nextLine());
                    System.out.print("Jenis Kelamin: ");
                    String jkV = scanner.nextLine();
                    daftarPasien.add(new PasienVIP(namaV, umurV, jkV));
                    System.out.println("Pasien VIP berhasil ditambahkan.");
                    break;
                case "4":
                    if (daftarPasien.isEmpty()) {
                        System.out.println("Belum ada pasien yang dimasukkan.");
                    } else {
                        System.out.println("\n--- Daftar Pasien ---");
                        int idx = 1;
                        for (Pasien p : daftarPasien) {
                            System.out.println("\nPasien ke-" + idx);
                            p.cetakInfo();
                            p.bayar();
                            idx++;
                        }
                    }
                    break;
                case "5":
                    System.out.println("Keluar. Terima kasih.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static int parseIntSafe(String s) {
        try {
            return Integer.parseInt(s.trim());
        } catch (Exception e) {
            return 0;
        }
    }
}
