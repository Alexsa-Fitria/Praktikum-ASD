import java.util.Scanner;

class Dosen02  {
    private String kode;
    private String nama;
    private boolean jenisKelamin; 
    private int usia;

    public Dosen02 (String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public boolean getJenisKelamin() {
        return jenisKelamin;
    }

    public int getUsia() {
        return usia;
    }

    public void informasi () {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia: " + usia);
    }
}