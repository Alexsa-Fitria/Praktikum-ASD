package jobsheet11;

public class Mahasiswa02 {
    String nim;
    String Nama;
    String Kelas;
    double ipk;

    public Mahasiswa02(String nim, String nama, String kls, double ip) {
        this.nim = nim;
        this.Nama = nama;
        this.Kelas = kls;
        this.ipk = ip;
    }

    public void tampilInformasi() {
        System.out.println("NIM\t\t: " + nim);
        System.out.println("Nama\t\t: " + Nama);
        System.out.println("Kelas\t\t: " + Kelas);
        System.out.println("IPK\t\t: " + ipk);
    }
}
