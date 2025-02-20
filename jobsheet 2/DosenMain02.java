public class DosenMain02 {
    public static void main(String[] args) {
        Dosen02 dosen1 = new Dosen02();
        dosen1.idDosen = "123456789";
        dosen1.nama = "prof. Susilo";
        dosen1.tahunBergabung = 2005;
        dosen1.bidangKeahlian = "ilmu komputer";
        dosen1.setAktif(true );

        dosen1.tampilkanInformasi();
        dosen1.ubahKeahlian("Information Technology");
        dosen1.tampilkanInformasi();

        int masaKerja = dosen1.hitungMasaKerja(2025); 
        System.out.println("Masa kerja dosen2: " + masaKerja + " tahun");
    }
}
