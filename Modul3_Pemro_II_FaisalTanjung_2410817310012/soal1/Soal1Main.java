package Modul3_Pemro_II_FaisalTanjung_2410817310012.soal1;
import java.util.LinkedList;
import java.util.Scanner;
public class Soal1Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Modul3_Pemro_II_FaisalTanjung_2410817310012.soal1.Dadu> daftarDadu = new LinkedList<>();

        System.out.print("Masukkan jumlah dadu: ");
        int jumlahDadu = scanner.nextInt();

        int total = 0;
        for (int i = 1; i <= jumlahDadu; i++) {
            Modul3_Pemro_II_FaisalTanjung_2410817310012.soal1.Dadu dadu = new Modul3_Pemro_II_FaisalTanjung_2410817310012.soal1.Dadu();
            dadu.acakNilai();
            daftarDadu.add(dadu);
            System.out.println("Dadu ke-" + i + " bernilai " + dadu.getNilai());
            total += dadu.getNilai();
        }

        System.out.println("Total nilai dadu keseluruhan " + total);
        scanner.close();
    }
}