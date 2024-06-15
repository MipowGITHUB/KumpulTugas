import java.util.Scanner;

public class User {
    public void displayBooks() {
        System.out.println(
                "===========================================================================================================================");
        System.out.printf("|| %-25s || %-25s || %-25s || %-17s || %-3s ||", "ID Buku", "Nama Buku", "Penulis",
                "Kategori", "Stok");
        System.out.println(
                "\n===========================================================================================================================");

        for (Main.BookList i : Main.arr_bookList) {
            System.out.printf("|| %-25s || %-25s || %-25s || %-18s || %3s  ||\n", i.idbuku, i.judulbuku,
                    i.penulisbuku,
                    i.kategoriBuku, i.stokbuku);
        }

        System.out.print(
                "===========================================================================================================================");

    }

    public void inputBook() {
        Admin adminObj = new Admin();
        Scanner inputuser = new Scanner(System.in);

        System.out.println("\n====== Tambah Buku ======");
        String idbuku = adminObj.generateId();

        System.out.println("Pilih kategori buku:");
        System.out.println("1. History");
        System.out.println("2. Story");
        System.out.println("3. Text Book");
        System.out.print("Pilihan (1-3): ");
        int kategoriChoice = inputuser.nextInt();
        inputuser.nextLine(); // Membersihkan newline di buffer

        String kategoribuku = "";
        switch (kategoriChoice) {
            case 1:
                kategoribuku = "History";
                break;
            case 2:
                kategoribuku = "Story";
                break;
            case 3:
                kategoribuku = "Text Book";
                break;
            default:
                System.out.println("Pilihan tidak valid. Kategori default akan digunakan.");
                kategoribuku = "Unknown";
                break;
        }

        System.out.print("Masukkan judul Buku       : ");
        String judulbuku = inputuser.nextLine();

        System.out.print("Masukkan Nama Penulis     : ");
        String penulisbuku = inputuser.nextLine();

        /*
         * System.out.print("Masukkan Kategori Buku    : ");
         * String kategoribuku = inputuser.nextLine();
         */

        System.out.print("Masukkan Jumlah Stok Buku : ");
        int stokbuku = inputuser.nextInt();

        Main.arr_bookList.add(new Main.BookList(idbuku, judulbuku, penulisbuku, kategoribuku, stokbuku));
        System.out.println("====== Buku berhasil ditambahkan ======");
        Main.menuadmin();
        inputuser.close();
    }

    private Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

}