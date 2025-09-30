package Modul1_Pemro_II_FaisalTanjung_2410817310012;
import java.util.Scanner;
public class PRAK102_2410817310012_FAISALTANJUNG {
    public static void main(String[] args) {
        int count=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        int number = scanner.nextInt();
        while(count <= 10){
            if(count > 0)
            {
                System.out.print(", ");
            }
            if (number % 5 == 0)
            {
                System.out.print(number /5 - 1);
            }
            else
            {
                System.out.print(number);
            }
            number++;
            count++;
        }
        scanner.close();
    }
}
