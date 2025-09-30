package Modul1_Pemro_II_FaisalTanjung_2410817310012;
import java.util.Scanner;
public class PRAK103_2410817310012_FAISALTANJUNG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.print("");
        int total = scanner.nextInt();
        System.out.print("");
        int current = scanner.nextInt();

        if(current % 2 == 0){
            current++;
        }
        do {
            if (count > 0) {
                System.out.print(", ");
            }
            System.out.print(current);
            current += 2;
            count++;
        } while (count < total);
        scanner.close();
    }
}
