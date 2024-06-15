import java.util.Random;
import java.util.Scanner;

public class Admin extends User {
    static String adminusername = "admin";
    static String adminpassword = "admin";

    static String username, password;
    static Scanner inputuser = new Scanner(System.in);

    public static void addstudent() {
        int loop;
        System.out.println("\n==== Tambah Mahasiswa ====");
        System.out.print("Masukkan Nama         :");
        String nama = inputuser.nextLine();

        String nim;
        do {
            System.out.print("Masukkan NIM          :");
            nim = inputuser.nextLine();
            if (nim.length() != 15) {
                System.out.println("\n> NIM harus 15 digit");
                loop = 0;
            } else {
                loop = 1;
            }
        } while (loop == 0);
        System.out.print("Masukkan Fakultas     :");
        String fakultas = inputuser.nextLine();

        System.out.print("Masukkan jurusan      :");
        String jurusan = inputuser.nextLine();

        Main.arr_userStudent.add(new Main.UserStudent(nama, nim, fakultas, jurusan));

        System.out.println("==== berhasil didaftarkan ====");
    }

    @Override
    public void inputBook() {
        super.inputBook();
    }

    @Override
    public void displayBooks() {
        super.displayBooks();
    }

    static void displaystudent() {
        System.out.println("\n==== Daftar Mahasiswa ====");
        for (Main.UserStudent i : Main.arr_userStudent) {
            System.out.print("Nama     : " + i.nama + "\n");
            System.out.print("NIM      : " + i.nim + "\n");
            System.out.print("Fakultas : " + i.fakultas + "\n");
            System.out.print("Prodi    : " + i.prodi + "\n");
            System.out.println("============================");

        }

    }

    boolean isAdmin() {
        System.out.println("\n==== Login ====");
        System.out.print("Masukkan Username     : ");
        username = inputuser.nextLine();

        System.out.print("Massukkan password    : ");
        password = inputuser.nextLine();

        if (username.equals(adminusername) && password.equals(adminpassword)) {
            System.out.println("==== Login berhasil ====\n");
            return true;
        } else {
            System.out.println("==== Pengguna tidak ditemukan ====");
            return false;
        }
    }

    public String generateId() {
        Random random = new Random();
        StringBuilder[] idbuku = new StringBuilder[3];
        for (int i = 0; i < 3; i++) {
            idbuku[i] = new StringBuilder();
            for (int j = 0; j < 4; j++) {
                idbuku[i].append(random.nextInt(10));
            }
        }
        return (idbuku[0] + "-" + idbuku[1] + "-" + idbuku[2]);

    }

    public void validasiLogin() {
        if (isAdmin()) {
            Main.menuadmin();
        } else {
            isAdmin();
        }
    }
}