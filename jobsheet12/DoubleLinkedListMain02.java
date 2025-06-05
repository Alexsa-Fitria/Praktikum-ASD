package jobsheet12;

import java.util.Scanner;

public class DoubleLinkedListMain02 {
    public static void main(String[] args) {
        DoubleLinkedList02 list = new DoubleLinkedList02();
        Scanner scan = new Scanner(System.in);

        int pilihan;
        do {
            System.out.println("====== Menu Double Linked List Mahasiswa ======");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus dari awal");
            System.out.println("4. Hapus dari akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine(); // consume newline

            switch (pilihan) {
                case 1:
                    Mahasiswa02 mhs = inputMahasiswa(scan);
                    list.addFirst(mhs);
                    break;
                case 2:
                    Mahasiswa02 mhs2 = inputMahasiswa(scan);
                    list.addLast(mhs2);
                    break;
                case 3:
                    list.removeFirst(); 
                    break;
                case 4:
                    list.removeLast(); 
                case 5:
                    list.print();
                    break;
                case 6:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node02 found = list.search(nim); 
                    if (found != null) {
                         System.out.println("Data Mahasiswa ditemukan: ");
                         found.data.tampil();
                     } else {
                         System.out.println("Data Mahasiswa tidak ditemukan.");
                    }
                    break;
                case 7:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 7);

        scan.close();
    }

    public static Mahasiswa02 inputMahasiswa(Scanner scan) {
        System.out.print("Masukkan NIM: ");
        String nim = scan.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scan.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = scan.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = scan.nextDouble();
        scan.nextLine(); // consume newline
        return new Mahasiswa02(nim, nama, kelas, ipk);
    }
}