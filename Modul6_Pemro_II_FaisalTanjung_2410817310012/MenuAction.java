package Modul6_Pemro_II_FaisalTanjung_2410817310012;
import java.util.Scanner;
public interface MenuAction {
    String getLabel();
    void execute(Scanner scanner);
    boolean isExit();
}