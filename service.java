package service;

import java.util.ArrayList;
import java.util.Scanner;
import model.destinasi;

public class service {
    private ArrayList<destinasi> daftarDestinasi = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public service() {
        daftarDestinasi.add(new destinasi("Candi Prambanan", 50000, 25000));
        daftarDestinasi.add(new destinasi("Candi Ratu Boko", 40000, 20000));
        daftarDestinasi.add(new destinasi("Keraton Yogyakarta", 15000, 7000));
        daftarDestinasi.add(new destinasi("Taman Sari", 15000, 7000));
        daftarDestinasi.add(new destinasi("Jalan Malioboro", 0, 0));
        daftarDestinasi.add(new destinasi("Alun-Alun Kidul", 5000, 3000));
        daftarDestinasi.add(new destinasi("Pantai Parangtritis", 10000, 5000));
        daftarDestinasi.add(new destinasi("Pantai Indrayanti", 10000, 5000));
        daftarDestinasi.add(new destinasi("Goa Jomblang", 500000, 0));
        daftarDestinasi.add(new destinasi("Gunung Merapi (Lava Tour)", 150000, 100000));
    }

    public void tampilkanDaftar() {
        if (daftarDestinasi.isEmpty()) {
            System.out.println("Belum ada data destinasi.");
            return;
        }

        System.out.println("\n+-----+---------------------------+------------+------------+");
        System.out.printf("| %-3s | %-25s | %-10s | %-10s |%n", "No", "Nama Destinasi", "Dewasa", "Anak");
        System.out.println("+-----+---------------------------+------------+------------+");

        for (int i = 0; i < daftarDestinasi.size(); i++) {
            destinasi d = daftarDestinasi.get(i);
            System.out.printf("| %-3d | %-25s | Rp%-8d | Rp%-8d |%n",
                    i + 1, d.namaDestinasi, d.tiketDewasa, d.tiketAnak);
        }

        System.out.println("+-----+---------------------------+------------+------------+");
    }

    public void tambahDestinasi() {
        System.out.print("Nama destinasi: ");
        String nama = scanner.nextLine();
        System.out.print("Harga tiket dewasa: ");
        int dewasa = inputAngka();
        System.out.print("Harga tiket anak: ");
        int anak = inputAngka();

        daftarDestinasi.add(new destinasi(nama, dewasa, anak));
        System.out.println("Destinasi berhasil ditambahkan!");
    }

    public void ubahDestinasi() {
        tampilkanDaftar();
        if (daftarDestinasi.isEmpty()) return;

        System.out.print("Pilih nomor destinasi yang mau diubah: ");
        int pilihan = inputAngka();
        if (pilihan < 1 || pilihan > daftarDestinasi.size()) {
            System.out.println("Nomor tidak valid.");
            return;
        }

        destinasi d = daftarDestinasi.get(pilihan - 1);
        System.out.print("Nama baru: ");
        d.namaDestinasi = scanner.nextLine();
        System.out.print("Harga tiket dewasa baru: ");
        d.tiketDewasa = inputAngka();
        System.out.print("Harga tiket anak baru: ");
        d.tiketAnak = inputAngka();

        System.out.println("Data berhasil diperbarui!");
    }

    public void hapusDestinasi() {
        tampilkanDaftar();
        if (daftarDestinasi.isEmpty()) return;

        System.out.print("Pilih nomor destinasi yang mau dihapus: ");
        int pilihan = inputAngka();
        if (pilihan < 1 || pilihan > daftarDestinasi.size()) {
            System.out.println("Nomor tidak valid.");
            return;
        }

        daftarDestinasi.remove(pilihan - 1);
        System.out.println("Data berhasil dihapus!");
    }

    public void cariDestinasi() {
    tampilkanDaftar();
    if (daftarDestinasi.isEmpty()) return;

    System.out.print("Cari berdasarkan nama (contoh: 'Pantai' atau 'Candi'): ");
    String keyword = scanner.nextLine().toLowerCase();
    boolean ditemukan = false;

    System.out.println("Hasil pencarian:");
    for (destinasi d : daftarDestinasi) {
        if (d.namaDestinasi.toLowerCase().contains(keyword)) {
            System.out.println("- " + d.namaDestinasi +
                               " (Dewasa: Rp" + d.tiketDewasa +
                               ", Anak: Rp" + d.tiketAnak + ")");
            ditemukan = true;
        }
    }

    if (!ditemukan) {
        System.out.println("Destinasi tidak ditemukan.");
    }
    }


    private int inputAngka() {
        while (!scanner.hasNextInt()) {
            System.out.print("Harus angka, coba lagi: ");
            scanner.next();
        }
        int angka = scanner.nextInt();
        scanner.nextLine();
        return angka;
    }
}
