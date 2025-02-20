public class Dosen02 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilkanInformasi(){
        System.out.println(" Id Dosen: " + idDosen);
        System.out.println(" Nama Dosen: " + nama);
        System.out.println("Status Keaktifan: " + statusAktif);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    void setAktif (boolean status){
        this.statusAktif = status;
        System.out.println("Status Keaktifan: " + (status ? "Aktif" : "Tidak Aktif"));
    }

    int hitungMasaKerja(int tahunSaatini){
        return tahunSaatini - tahunBergabung;

    }

    void ubahKeahlian(String keahlian){
        this.bidangKeahlian = keahlian;
    }

    public Dosen02(){

    }

    public Dosen02 (String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian){
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
}
