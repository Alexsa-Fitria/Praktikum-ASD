package jobsheet7;

import java.util.Scanner;
public class MahasiswaDemo02 {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in); 
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        MahasiswaBerprestasi02 list = new MahasiswaBerprestasi02(jumMhs); 

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.next();
            System.out.print("Nama  : ");
            String nama = sc.next();
            System.out.print("Kelas : ");
            String kelas = sc.next();
            System.out.print("IPK   : ");
            String ip = sc.next();
            Double ipk = Double.parseDouble(ip);
            sc.nextLine();
            System.out.println("-------------------------------------");
            Mahasiswa02 mhs = new Mahasiswa02(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }  


        list.tampil();
        //melakukan pencarian data sequential
        System.out.println("-------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari : ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
       
        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

    }
}

