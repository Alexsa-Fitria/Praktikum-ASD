package jobsheet11;

import java.util.Scanner;

public class MahasiswaQueueMain02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaQueue02 queue = new MahasiswaQueue02(5); 
        int pilihan;

        do {
            System.out.println("==== Menu Antrian Layanan Mahasiswa ====");
            System.out.println("1. Daftar Mahasiswa (Enqueue)");
            System.out.println("2. Panggil Mahasiswa Berikutnya (Dequeue)");
            System.out.println("3. Tampilkan Mahasiswa di Depan");
            System.out.println("4. Tampilkan Mahasiswa di Belakang");
            System.out.println("5. Tampilkan Semua Mahasiswa");
            System.out.println("6. Ukuran Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 
            switch (pilihan) {
                case 1:
                    if (queue.isFull()) {
                        System.out.println("Antrian Penuh!");
                    } else {
                        System.out.print("NIM: ");
                        String nim = sc.nextLine();
                        System.out.print("Nama: ");
                        String nama = sc.nextLine();
                        System.out.print("Program Studi: ");
                        String programStudi = sc.nextLine();
                        System.out.print("Kelas: ");
                        String namaKelas = sc.nextLine();
                        MahasiswaData02 mahasiswa = new MahasiswaData02(nim, nama, programStudi, namaKelas);
                        queue.enqueue(mahasiswa);
                    }
                    break;
                case 2:
                    MahasiswaData02 servedMahasiswa = queue.dequeue();
                    if (servedMahasiswa == null) {
                        System.out.println("Antrian Kosong!");
                    } else {
                        System.out.println("Mahasiswa yang dilayani:");
                        servedMahasiswa.print();
                    }
                    break;
                case 3:
                    queue.displayFront();
                    break;
                case 4:
                    queue.displayRear();
                    break;
                case 5:
                    queue.displayAll();
                    break;
                case 6:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + queue.getSize());
                    break;
                case 7:
                queue.clear();
                System.out.println("Antrian dikosongkan.");
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Menu tidak valid!");
                    break;
            }
            System.out.println();
        } while (pilihan != 0);

        sc.close();
    
    }
}
