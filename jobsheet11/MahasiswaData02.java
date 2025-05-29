package jobsheet11;

public class MahasiswaData02 {
    String nim, nama, programStudi, namaKelas;

public MahasiswaData02(String nim, String nama, String programStudi, String namaKelas) {
    this.nim = nim;
    this.nama = nama;
    this.programStudi = programStudi;
    this.namaKelas = namaKelas;
}

public void tampilkanData() {
    System.out.println("NIM: " + nim);
    System.out.println("Nama: " + nama);
    System.out.println("Program Studi: " + programStudi);
    System.out.println("Kelas: " + namaKelas);
}
}
