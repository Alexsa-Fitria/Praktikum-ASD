import java.util.Scanner;

public class DosenDemo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = scanner.nextInt();
        scanner.nextLine(); 

        Dosen02[] dosenArray = new Dosen02[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("\nMasukkan informasi dosen ke-" + (i + 1) + ":");

            System.out.print("Kode: ");
            String kode = scanner.nextLine();

            System.out.print("Nama: ");
            String nama = scanner.nextLine();

            System.out.print("Jenis Kelamin (true for Laki-laki, false for Perempuan): ");
            boolean jenisKelamin = scanner.nextBoolean();

            System.out.print("Usia: ");
            int usia = scanner.nextInt();
            scanner.nextLine(); 
            System.out.println("-------------------------");

            dosenArray[i] = new Dosen02(kode, nama, jenisKelamin, usia);
        }

        System.out.println("\nInformasi dosen:");
        for (Dosen02 dosen : dosenArray) {
            dosen.informasi();
            System.out.println("-------------------------");
        }

        scanner.close();
    }
}

