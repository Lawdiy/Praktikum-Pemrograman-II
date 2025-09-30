package Modul1_Pemro_II_FaisalTanjung_2410817310012;
import java.util.Scanner;
public class PRAK101_2410817310012_FAISALTANJUNG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Lengkap: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan Tempat Lahir: ");
        String birthplace = scanner.nextLine();
        System.out.print("Masukkan Tanggal Lahir: ");
        int birthdate = scanner.nextInt();
        System.out.print("Masukkan Bulan Lahir: ");
        int birthmonth = scanner.nextInt();
        System.out.print("Masukkan Tahun Lahir: ");
        int birthyear = scanner.nextInt();
        System.out.print("Masukkan Tinggi badan: ");
        int height = scanner.nextInt();
        System.out.print("Masukkan Berat badan: ");
        int weight = scanner.nextInt();

        String monthName;
        switch (birthmonth) {
            case 1:
                monthName = "Januari";
                break;
            case 2:
                monthName = "Februari";
                break;
            case 3:
                monthName = "Maret";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "Mei";
                break;
            case 6:
                monthName = "Juni";
                break;
            case 7:
                monthName = "Juli";
                break;
            case 8:
                monthName = "Agustus";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "Oktober";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "Desember";
                break;
            default:
                monthName = "bulan tidak valid";
                break;
        }
        System.out.println("Nama Lengkap "+name+", Lahir di "+birthplace+" pada tanggal "+birthdate+" "+monthName+" "+birthyear+" Tinggi badan "+height+" dan Berat Badan "+weight+" Kilogram");
        scanner.close();
    }
}
