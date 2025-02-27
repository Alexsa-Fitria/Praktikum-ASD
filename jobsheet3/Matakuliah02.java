public class Matakuliah02 {
   
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah02(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void cetakInfo() {
        System.out.println("Kode        : " + this.kode);
        System.out.println("Nama        : " + this.nama);
        System.out.println("Sks         : " + this.sks);
        System.out.println("Jumlah Jam  : " + this.jumlahJam);
        System.out.println("-------------------------------");
    }
}
