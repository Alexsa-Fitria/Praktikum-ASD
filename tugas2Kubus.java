import java.util.Scanner;

public class tugas2Kubus {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        
        do {
            tampilkanMenu();
            pilihan = sc.nextInt();
            
            switch (pilihan) {
                case 1:
                    hitungVolume(sc);
                    break;
                case 2:
                    hitungLuasPermukaan(sc);
                    break;
                case 3:
                    hitungKeliling(sc);
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);
        
        sc.close();
    }
    
    public static void tampilkanMenu() {
        System.out.println("Menu:");
        System.out.println("1. Hitung Volume Kubus");
        System.out.println("2. Hitung Luas Permukaan Kubus");
        System.out.println("3. Hitung Keliling Kubus");
        System.out.println("4. Keluar");
        System.out.print("Masukkan pilihan Anda: ");
    }
    
    public static void hitungVolume(Scanner input) {
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = input.nextDouble();
        double volume = sisi * sisi * sisi;
        System.out.printf("Volume kubus adalah: %.2f%n", volume);
    }
    
    public static void hitungLuasPermukaan(Scanner input) {
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = input.nextDouble();
        double luasPermukaan = 6 * sisi * sisi;
        System.out.printf("Luas permukaan kubus adalah: %.2f%n", luasPermukaan);
    }
    
    public static void hitungKeliling(Scanner input) {
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = input.nextDouble();
        double keliling = 12 * sisi;
        System.out.printf("Keliling kubus adalah: %.2f%n", keliling);
    }
}

