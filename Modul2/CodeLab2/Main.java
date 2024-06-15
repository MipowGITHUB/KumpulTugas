package Modul2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Mahasiswa> listMahasiswa = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean runProgram = false;
        while (!runProgram) {
            System.out.println("===== Library System =====");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");

            System.out.print("Choose Your Option(1-3): ");
            String userRole = scanner.next();
            scanner.nextLine();

            switch (userRole) {
                case "1":
                    System.out.println("Masukkan Nama Mahasiswa: ");
                    String nama = scanner.nextLine();

                    System.out.println("Masukkan NIM Mahasiswa : ");
                    String nim = scanner.nextLine();

                    if (nim.length() == 15) {
                        System.out.println("Successful Login as Student");
                    } else {
                        System.out.println("NIM harus 15 Digit");
                        return; // Kembali ke menu utama setelah pesan kesalahan
                    }
                    System.out.println("Masukkan Jurusan Mahasiswa: ");
                    String jurusan = scanner.nextLine();

                    Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jurusan);
                    listMahasiswa.add(mahasiswa);
                    System.out.println("Data mahasiswa berhasil ditambahkan.");
                    break;
                case "2":
                    tampilDataMahasiswa();
                    break;
                case "3":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    public static void tampilUniversitas() {
        System.out.println("Universitas Muhammadiyah Malang");
    }

    public static void tampilDataMahasiswa() {
        tampilUniversitas();
        System.out.println("\nData Mahasiswa:");
        for (Mahasiswa m : listMahasiswa) {
            System.out.println("Nama: " + m.getNama() + ", NIM: " + m.getNim() + ", Jurusan: " + m.getJurusan());
        }
    }
}