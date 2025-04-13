package jobsheet7;

public class DataDosen02 {
    Dosen02[] DataDosen02 = new Dosen02[2];
    int idx;

    void tambah(Dosen02 dsn) {
        if (idx < DataDosen02.length) {
            DataDosen02[idx] = dsn;
            idx++;
        }else {
            System.out.println("Data Dosen Sudah Penuh!");
        }
    }

    //menampilkan data dosen
    void tampil() {
        if (idx == 0) {
            System.out.println("Tidak Ada Data Dosen");
            return;
        }
        for (int i = 0; i < idx; i++) {
            DataDosen02[i].tampil();
            System.out.println();
        }
    }

    //A.
    void pencarianDataSequential02(String nama) {
        int jumlahHasil = 0;
        for (int i = 0; i < idx; i++) {
            if (DataDosen02[i].nama.equalsIgnoreCase(nama)) {
                DataDosen02[i].tampil();
                jumlahHasil++;
            }
        }
        if (jumlahHasil > 1) {
            System.out.println("Peringatan! Pastikan algoritma yang diterapkan sesuai dengan kasus yang diberikan!");
        } else if (jumlahHasil == 0) {
            System.out.println("Data tidak ditemukan.");
        }
    }

    //B.
    void pencarianDataBinary02(int usia) {
        sortingASC();
        int kiri = 0, kanan = idx -1;
        boolean ditemukan = false;

        while (kiri <= kanan) {
            int tengah = (kiri + kanan) / 2;
            if (DataDosen02[tengah].usia == usia) {
                DataDosen02[tengah].tampil();
                ditemukan = true;
                break;
            } else if (DataDosen02[tengah].usia < usia) {
                kiri = tengah + 1;
            } else {
                kanan = tengah -1;
            }
        }
        if (!ditemukan) {
            System.out.println("Data tidak ditemukan.");
        }
    }

    //mengurutkan data dosen secara ascending (asc)
    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (DataDosen02[j].usia > DataDosen02[j+1].usia) {
                    Dosen02 temp = DataDosen02[j];
                    DataDosen02[j] = DataDosen02[j+1];
                    DataDosen02[j+1] = temp;
                }
            }
        }
    }

    //mengurutkan data dosen secara descending (dsc)
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (DataDosen02[j].usia < DataDosen02[j+1].usia) {
                    Dosen02 temp = DataDosen02[j];
                    DataDosen02[j] = DataDosen02[j+1];
                    DataDosen02[j+1] = temp;
                }
            }
        }
    }
}

