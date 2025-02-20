public class MataKuliahMain {
    public static void main(String[] args) {

        MataKuliah02 matkul = new MataKuliah02();
        matkul.kodeMK = "RTI242008";
        matkul.nama = "Algoritma dan Struktur Data";

        matkul.SKS(2);
        matkul.tambahJam(4); 
        matkul.kurangJam(2);
        matkul.tampilkanInformasi();
    }
}
