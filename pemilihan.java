import java.util.Scanner;

public class pemilihan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tugas, kuis, uts, uas;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=========================");

        System.out.print("Masukkan Nilai Tugas: ");
        tugas = sc.nextInt();
        System.out.print("Masukkan Nilai KUis: ");
        kuis = sc.nextInt();
        System.err.print("Masukkan Nilai UTS: ");
        uts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        uas = sc.nextInt();

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("=========================");
            System.out.println("Nilai tidak valid");
            System.out.println("=========================");
        } else {
            double nilaiAkhir = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3);
            String nilaiHuruf;

            if (nilaiAkhir >80){
                nilaiHuruf = "A";
            } else if ( nilaiAkhir >73){
                nilaiHuruf = "B+";
            } else if (nilaiAkhir > 65){
                nilaiHuruf = "B";
            } else if (nilaiAkhir >60){
                nilaiHuruf = "C+";
            } else if (nilaiAkhir >50){
                nilaiHuruf = "C";
            } else if ( nilaiAkhir >39){
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "D";
            }

            System.out.println("=========================");
            System.out.println("=========================");
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("=========================");
            System.out.println("=========================");

            if (nilaiAkhir >=50){
                System.out.println("SELAMAT ANDA LULUS");
            } else {
                System.out.println("ANDA TIDAK LULUS");
            }
        }
        
        sc.close();
    }
}