package uts;

/**
 *
 * @author INSTIKI
 * Nama : I Kadek Pande Wisnu Antara
 * Nim  : 2201010511
 * TGL  : 16-05-2024
 */
import java.util.Scanner;

public class Application {
    private static final int MAX_RECORDS = 100;
    private Record[] records;
    private int numOfRecords;
    private final Scanner scanner;

    public Application() {
        records = new Record[MAX_RECORDS];
        numOfRecords = 0;
        scanner = new Scanner(System.in);
    }

    public void tambahRecord() {
        if (numOfRecords < MAX_RECORDS) {
            System.out.println("Masukkan data pembeli:");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Alamat Email: ");
            String email = scanner.nextLine();
            System.out.print("Nomor Telepon: ");
            String telepon = scanner.nextLine();

            records[numOfRecords++] = new Record(nama, email, telepon);
            System.out.println("Data berhasil ditambahkan.");
        } else {
            System.out.println("Batas maksimal data sudah tercapai.");
        }
    }

    public void ubahRecord() {
        System.out.print("Masukkan nomor data yang ingin diubah: ");
        int nomor = scanner.nextInt();
        scanner.nextLine(); // Membuang newline

        if (nomor >= 1 && nomor <= numOfRecords) {
            System.out.println("Masukkan data baru:");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Alamat Email: ");
            String email = scanner.nextLine();
            System.out.print("Nomor Telepon: ");
            String telepon = scanner.nextLine();

            records[nomor - 1].setNamaPembeli(nama);
            records[nomor - 1].setAlamatEmail(email);
            records[nomor - 1].setTeleponPembeli(telepon);

            System.out.println("Data berhasil diubah.");
        } else {
            System.out.println("Nomor data tidak valid.");
        }
    }

    public void hapusRecord() {
        System.out.print("Masukkan nomor data yang ingin dihapus: ");
        int nomor = scanner.nextInt();
        scanner.nextLine(); // Membuang newline

        if (nomor >= 1 && nomor <= numOfRecords) {
            for (int i = nomor - 1; i < numOfRecords - 1; i++) {
                records[i] = records[i + 1];
            }
            records[numOfRecords - 1] = null; // Clear the last record
            numOfRecords--;
            System.out.println("Data berhasil dihapus.");
        } else {
            System.out.println("Nomor data tidak valid.");
        }
    }

    public void tampilkanRecord() {
        System.out.println("Daftar Data Penyewa Kos:");
        for (int i = 0; i < numOfRecords; i++) {
            System.out.println("Data " + (i + 1) + ":");
            System.out.println(records[i].toString());
            System.out.println();
        }
    }

    public void jalankan() {
        int pilihan;

        do {
            System.out.println("Menu Aplikasi:");
            System.out.println("1. Tambah Data Pembeli");
            System.out.println("2. Tampilkan Data Pembeli");
            System.out.println("3. Ubah Data Pembeli");
            System.out.println("4. Hapus Data Pembeli");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membuang newline

            switch (pilihan) {
                case 1:
                    tambahRecord();
                    break;
                case 2:
                    tampilkanRecord();
                    break;
                case 3:
                    ubahRecord();
                    break;
                case 4:
                    hapusRecord();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan aplikasi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);
    }

    public static void main(String[] args) {
        Application rentalApp = new Application();
        rentalApp.jalankan();
    }
}