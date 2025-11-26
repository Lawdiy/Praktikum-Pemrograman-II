package Modul6_Pemro_II_FaisalTanjung_2410817310012;
import java.util.Scanner;
public class ViewDataAction implements MenuAction {
    private final DataRepository repository; // Inject Repository via Constructor (DIP)

    public ViewDataAction(DataRepository repository) {
        this.repository = repository;
    }

    @Override
    public String getLabel() {
        return "Lihat Data";
    }

    @Override
    public void execute(Scanner scanner) {
        System.out.println("\n--- Lihat Data ---");
        if (!repository.hasData()) {
            System.out.println("Belum ada data saat ini.");
        } else {
            Data data = repository.getData();
            System.out.println("Nama    : " + data.getName());
            System.out.println("NIM     : " + data.getNim());
            System.out.println("Hobi    : " + data.getHobby());
            System.out.println("Motto   : " + data.getMotto());
        }
        System.out.println("Tekan enter untuk kembali ke menu.");
        scanner.nextLine();
    }

    @Override
    public boolean isExit() { return false; }
}
