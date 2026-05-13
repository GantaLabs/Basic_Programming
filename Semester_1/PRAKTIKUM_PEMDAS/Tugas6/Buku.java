package Semester_1.Basic_Programming.Semester_1.PRAKTIKUM_PEMDAS.Tugas6;

public class Buku {
    private String kategori;
    private String namaBuku;
    private int tahunTerbit;
    private int jumlahHalaman;
    private String[] daftarNamaPenulis;
    private int jumlahPenulis;
    private int idx = 0;

    Buku (String kategori, String namaBuku, int tahunTerbit, int jumlahHalaman, int jumlahPenulis) {
        this.kategori = kategori;
        this.namaBuku = namaBuku;
        this.tahunTerbit = tahunTerbit;
        this.jumlahHalaman = jumlahHalaman;
        this.jumlahPenulis = jumlahPenulis;
        this.daftarNamaPenulis = new String[this.jumlahPenulis];
    }

    void tambahPenulis (String namaPenulis) {
        if (idx == jumlahPenulis) {
            System.out.println("Gagal Menambahkan Penulis; Slot Penulis sudah Penuh!");
        } else {
            daftarNamaPenulis[idx] = namaPenulis;
            idx++;
        }
    }

    void infoBuku () {
        System.out.printf("""
                ======   %s   =====
                kategori        : %s
                Tebal           : %d halaman
                Tahun Terbit    : %d
                Nama Penulis    : """, kategori, namaBuku, jumlahHalaman, tahunTerbit);

        for (int i = 0; i < jumlahPenulis; i++) {
            if (i != 0) {
                System.out.println("                  - " + daftarNamaPenulis[i]);
                continue;
            }
            System.out.println(" - " + daftarNamaPenulis[i]);
        }
    }
}
