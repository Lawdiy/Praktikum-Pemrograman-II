package Modul6_Pemro_II_FaisalTanjung_2410817310012;
import java.util.Scanner;
public class ExitAction implements MenuAction {
    @Override
    public String getLabel() {
        return "Keluar";
    }

    @Override
    public void execute(Scanner scanner) {
        System.out.println("Terima kasih, program selesai.");
    }

    @Override
    public boolean isExit() { return true; }
}