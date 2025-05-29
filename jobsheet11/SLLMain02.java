package jobsheet11;

import java.util.LinkedList;
import java.util.Scanner;
public class SLLMain02 {
   public static void main(String[] args) {
       SingleLinkedList02 sll = new SingleLinkedList02();
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("------------------------------");
            System.out.print("Masukkan NIM mahasiswa: ");
            String nim = sc.nextLine();
            System.out.print("Masukkan nama mahasiswa: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan kelas mahasiswa: ");
            String kls = sc.nextLine();
            System.out.print("Masukkan IPK mahasiswa: ");
            double ip = sc.nextDouble();
            sc.nextLine(); 

            Mahasiswa02 std = new Mahasiswa02(nim, nama, kls, ip);
            sll.addLast(std);
        }

        sll.print();

        System.out.println("data index 1 : ");
        sll.getData(1);
        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
   }
}
