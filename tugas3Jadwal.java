import java.util.Scanner;

public class tugas3Jadwal {
    static String[] namaMataKuliah;
    static int[] sks;
    static int[] semester;
    static String[] hari;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();
        sc.nextLine(); 

        namaMataKuliah = new String[jumlahMataKuliah];
        sks = new int[jumlahMataKuliah];
        semester = new int[jumlahMataKuliah];
        hari = new String[jumlahMataKuliah];

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            namaMataKuliah[i] = sc.nextLine();
            System.out.print("Masukkan SKS mata kuliah ke-" + (i + 1) + ": ");
            sks[i] = sc.nextInt();
            System.out.print("Masukkan semester mata kuliah ke-" + (i + 1) + ": ");
            semester[i] = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Masukkan hari mata kuliah ke-" + (i + 1) + " (misal, Senin): ");
            hari[i] = sc.nextLine();
        }

        int pilihan;
        do {
            tampilkanMenu();
            pilihan = sc.nextInt();
            sc.nextLine(); 
            
            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal();
                    break;
                case 2:
                    System.out.print("Masukkan hari (Senin, Selasa, dan berikutnya: ");
                    String hariPilihan = sc.nextLine();
                    tampilkanJadwalBerdasarkanHari(hariPilihan);
                    break;
                case 3:
                    System.out.print("Masukkan semester: ");
                    int semesterPilihan = sc.nextInt();
                    tampilkanJadwalBerdasarkanSemester(semesterPilihan);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String namaMataKuliahPilihan = sc.nextLine();
                    cariMataKuliah(namaMataKuliahPilihan);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);

        sc.close();
    }

    public static void tampilkanMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Tampilkan seluruh jadwal mata kuliah");
        System.out.println("2. Tampilkan jadwal berdasarkan hari");
        System.out.println("3. Tampilkan jadwal berdasarkan semester");
        System.out.println("4. Cari mata kuliah berdasarkan nama");
        System.out.println("5. Keluar");
        System.out.print("Masukkan pilihan Anda: ");
    }

    public static void tampilkanSeluruhJadwal() {
        System.out.println("\nSeluruh Jadwal Mata Kuliah:");
        for (int i = 0; i < namaMataKuliah.length; i++) {
            System.out.println("Nama Mata Kuliah: " + namaMataKuliah[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hari[i]);
        }
    }

    public static void tampilkanJadwalBerdasarkanHari(String hariPilihan) {
        System.out.println("\nJadwal Mata Kuliah pada " + hariPilihan + ":");
        boolean ada = false;
        for (int i = 0; i < namaMataKuliah.length; i++) {
            if (hari[i].equalsIgnoreCase(hariPilihan)) {
                System.out.println("Nama Mata Kuliah: " + namaMataKuliah[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hari[i]);
                ada = true;
            }
        }
        if (!ada) {
            System.out.println("Tidak ada jadwal mata kuliah pada hari " + hariPilihan);
        }
    }

    public static void tampilkanJadwalBerdasarkanSemester(int semesterPilihan) {
        System.out.println("\nJadwal Mata Kuliah Semester " + semesterPilihan + ":");
        boolean ada = false;
        for (int i = 0; i < namaMataKuliah.length; i++) {
            if (semester[i] == semesterPilihan) {
                System.out.println("Nama Mata Kuliah: " + namaMataKuliah[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hari[i]);
                ada = true;
            }
        }
        if (!ada) {
            System.out.println("Tidak ada jadwal mata kuliah untuk semester " + semesterPilihan);
        }
    }

    public static void cariMataKuliah(String namaMataKuliahPilihan) {
        System.out.println("\nHasil Pencarian Mata Kuliah '" + namaMataKuliahPilihan + "':");
        boolean ada = false;
        for (int i = 0; i < namaMataKuliah.length; i++) {
            if (namaMataKuliah[i].equalsIgnoreCase(namaMataKuliahPilihan)) {
                System.out.println("Nama Mata Kuliah: " + namaMataKuliah[i] + ", SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hari[i]);
                ada = true;
            }
        }
        if (!ada) {
            System.out.println("Mata kuliah '" + namaMataKuliahPilihan + "' tidak ditemukan.");
        }
    }
}

