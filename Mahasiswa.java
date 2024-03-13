package Modul2;
public class Mahasiswa {
    private String nim;
    private String nama;
    private String jurusan;

    // Constructor
    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    // Getter for NIM
    public String getNim() {
        return nim;
    }

    // Getter for Nama
    public String getNama() {
        return nama;
    }

    // Getter for Jurusan
    public String getJurusan() {
        return jurusan;
    }
}