package Modul1_Pemro_II_FaisalTanjung_2410817310012;
import java.util.Scanner;
public class PRAK105_2410817310012_FAISALTANJUNG {
    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jari-jari: ");
        double radius = scanner.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double height = scanner.nextDouble();
        double volume = PI * radius * radius * height;
        System.out.printf("Volume tabung dengan jari-jari %.lf cm dan tinggi %.lf cm adalah %.3f m^3", radius, height, volume);
        scanner.close();
    }
}