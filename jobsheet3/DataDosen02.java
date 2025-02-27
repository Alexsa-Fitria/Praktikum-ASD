class DataDosen02 {
    public static void dataSemuaDosen(Dosen02[] arrayOfDosen) {
        for (Dosen02 dosen : arrayOfDosen) {
            dosen.informasi();
            System.out.println("-------------------------");
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen02[] arrayOfDosen) {
        int lakiLaki = 0, perempuan = 0;
        for (Dosen02 dosen : arrayOfDosen) {
            if (dosen.getJenisKelamin()) {
                lakiLaki++;
            } else {
                perempuan++;
            }
        }
        System.out.println("Jumlah Dosen Laki-laki: " + lakiLaki);
        System.out.println("Jumlah Dosen Perempuan: " + perempuan);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen02[] arrayOfDosen) {
        int totalUsiaLakiLaki = 0, totalUsiaPerempuan = 0, countLakiLaki = 0, countPerempuan = 0;
        for (Dosen02 dosen : arrayOfDosen) {
            if (dosen.getJenisKelamin()) {
                totalUsiaLakiLaki += dosen.getUsia();
                countLakiLaki++;
            } else {
                totalUsiaPerempuan += dosen.getUsia();
                countPerempuan++;
            }
        }
        double rerataUsiaLakiLaki = countLakiLaki > 0 ? (double) totalUsiaLakiLaki / countLakiLaki : 0;
        double rerataUsiaPerempuan = countPerempuan > 0 ? (double) totalUsiaPerempuan / countPerempuan : 0;
        System.out.println("Rata-rata Usia Dosen Laki-laki: " + rerataUsiaLakiLaki);
        System.out.println("Rata-rata Usia Dosen Perempuan: " + rerataUsiaPerempuan);
    }

    public static void infoDosenPalingTua(Dosen02[] arrayOfDosen) {
        Dosen02 dosenPalingTua = arrayOfDosen[0];
        for (Dosen02 dosen : arrayOfDosen) {
            if (dosen.getUsia() > dosenPalingTua.getUsia()) {
                dosenPalingTua = dosen;
            }
        }
        System.out.println("Dosen Paling Tua:");
        dosenPalingTua.informasi();
    }

    public static void infoDosenPalingMuda(Dosen02[] arrayOfDosen) {
        Dosen02 dosenPalingMuda = arrayOfDosen[0];
        for (Dosen02 dosen : arrayOfDosen) {
            if (dosen.getUsia() < dosenPalingMuda.getUsia()) {
                dosenPalingMuda = dosen;
            }
        }
        System.out.println("Dosen Paling Muda:");
        dosenPalingMuda.informasi();
    }
}