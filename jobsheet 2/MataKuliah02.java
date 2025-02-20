public class MataKuliah02  {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi() {
        System.out.println("KodeMK: " + kodeMK );
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    void SKS (int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS baru: " + sksBaru);
    }

    void tambahJam (int jam) {
        this.jumlahJam += jam;
        System.out.println("jumlah jam setelah ditambah: " + this.jumlahJam);
    }

    void kurangJam (int jam) {
        if (this.jumlahJam >= jam) {
            this.jumlahJam -= jam;
            System.out.println("jumlah jam setelah dikurangi: " + this.jumlahJam);
        } else {
            System.out.println("jumlah jam tidak valid");
        }
    }

    public MataKuliah02 (){

    }

    public MataKuliah02 (String kodeMk, String nama, int sks, int jumlahJam){
        this.kodeMK = kodeMk;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}
