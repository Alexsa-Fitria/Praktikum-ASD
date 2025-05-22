package P2jobsheet10 ;

import java.util.Scanner;

public class StudentKRSQueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentKRSQueue queue = new StudentKRSQueue(10);
        int choice;
        do {
            System.out.println("\n=== Menu Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Proses 2 Mahasiswa (Persetujuan KRS)");
            System.out.println("3. Tampilkan Semua Mahasiswa");
            System.out.println("4. Tampilkan Dua Mahasiswa Pertama");
            System.out.println("5. Tampilkan Mahasiswa Terakhir");
            System.out.println("6. Tampilkan Jumlah Total Mahasiswa");
            System.out.println("7. Tampilkan jumlah mahasiswa yang telah menyelesaikan proses persetujuan KRS");
            System.out.println("8. Tampilkan jumlah mahasiswa yang belum menyelesaikan proses persetujuan KRS.");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("NIM: ");
                    String nim = sc.nextLine();
                    System.out.println("Nama: ");
                    String name = sc.nextLine();
                    System.out.println("Program Studi: ");
                    String studyProgram = sc.nextLine();
                    System.out.println("Kelas: ");
                    String className = sc.nextLine();
                    StudentKRS std = new StudentKRS(nim, name, studyProgram, className);
                    queue.enqueue(std);
                    break;
                case 2:
                    // Proses 2 mahasiswa (sesi persetujuan pertama)

                    queue.dequeue2();

                    // Proses 2 mahasiswa lagi (sesi persetujuan kedua)


                    break; // Keluar dari loop jika antrian kosong
                case 3:
                    queue.print();
                    break;
                case 4:
                    queue.peek2();
                    break;
                case 5:
                    queue.viewRear();
                    break;
                case 6:
                    System.out.println("Ukuran antrian: " + queue.size);
                    break;
                case 7:
                    queue.printApprovedCount();
                    break;
                case 8:
                    queue.printRemainingStudent();
                    break;
                case 0:
                    System.out.println("Terima kasih!!");
                    break;
                default:
                    System.out.println("Menu Tidak Valid!!");
            }
        } while (choice != 0);
    }
}