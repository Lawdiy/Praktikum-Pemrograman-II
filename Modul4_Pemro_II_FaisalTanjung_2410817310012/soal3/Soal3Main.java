package Modul4_Pemro_II_FaisalTanjung_2410817310012.soal3;
import java.util.Scanner;
public class Soal3Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.print("Nama hewan peliharaan: ");
            String name = scanner.nextLine();

            System.out.print("Ras: ");
            String breed = scanner.nextLine();

            System.out.print("Warna bulu: ");
            String furColor = scanner.nextLine();

            Kucing cat = new Kucing(name, breed, furColor);
            cat.display();

        } else if (choice == 2) {
            System.out.print("Nama hewan peliharaan: ");
            String name = scanner.nextLine();

            System.out.print("Ras: ");
            String breed = scanner.nextLine();

            System.out.print("Warna bulu: ");
            String furColor = scanner.nextLine();

            System.out.print("Kemampuan: ");
            String ability = scanner.nextLine();

            Anjing dog = new Anjing(name, breed, furColor, ability);
            dog.display();

        } else {
            System.out.println("Pilihan tidak valid.");
        }
        scanner.close();
    }
}