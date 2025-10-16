package Modul4_Pemro_II_FaisalTanjung_2410817310012.soal2;
import java.util.Scanner;
public class Soal2Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama hewan peliharaan:");
        String name = scanner.nextLine();
        System.out.print("Ras:");
        String breed = scanner.nextLine();
        HewanPeliharaan pet = new HewanPeliharaan(name, breed);
        pet.display();
    }
}