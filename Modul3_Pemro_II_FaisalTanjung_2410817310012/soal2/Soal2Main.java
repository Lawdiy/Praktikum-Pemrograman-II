package Modul3_Pemro_II_FaisalTanjung_2410817310012.soal2;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.HashMap;
public class Soal2Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Negara> countryList = new LinkedList<>();
        HashMap<Integer, String> monthName = new HashMap<>();

        monthName.put(1, "Januari");
        monthName.put(2, "Februari");
        monthName.put(3, "Maret");
        monthName.put(4, "April");
        monthName.put(5, "Mei");
        monthName.put(6, "Juni");
        monthName.put(7, "Juli");
        monthName.put(8, "Agustus");
        monthName.put(9, "September");
        monthName.put(10, "Oktober");
        monthName.put(11, "November");
        monthName.put(12, "Desember");

        int jumlah = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < jumlah; i++) {
            String countryName = scanner.nextLine();
            String governmentType = scanner.nextLine();
            String leaderName = scanner.nextLine();

            if (governmentType.equals("monarki")) {
                Negara country = new Negara(countryName, governmentType, leaderName);
                countryList.add(country);
            } else {
                int date = scanner.nextInt();
                int month = scanner.nextInt();
                int year = scanner.nextInt();
                scanner.nextLine();
                Negara country = new Negara(countryName, governmentType, leaderName, date, month, year);
                countryList.add(country);
            }
        }
        for (int i = 0; i < countryList.size(); i++) {
            Negara country = countryList.get(i);
            country.display(monthName);
        }
        scanner.close();
    }
}