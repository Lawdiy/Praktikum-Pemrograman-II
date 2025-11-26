package Modul6_Pemro_II_FaisalTanjung_2410817310012;
import java.util.Scanner;
public class UpdateDataAction implements MenuAction {
    private final DataRepository repository;

    public UpdateDataAction(DataRepository repository) {
        this.repository = repository;
    }

    @Override
    public String getLabel() {
        return "Update/Masukkan Data";
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public void execute(Scanner scanner) {
        System.out.println("\n--- Update/Masukkan Data (State & Builder Pattern) ---");

        if (repository instanceof InMemoryDataRepository) {
            System.out.println("Status: " + ((InMemoryDataRepository) repository).getStatus());
        }

        System.out.print("Masukkan Nama: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        System.out.print("Masukkan Hobi: ");
        String hobby = scanner.nextLine();

        System.out.print("Masukkan Motto: ");
        String motto = scanner.nextLine();

        Data newData = new Data.Builder()
                .setName(name)
                .setNim(nim)
                .setHobby(hobby)
                .setMotto(motto)
                .build();

        repository.saveData(newData);

        System.out.println("Proses selesai.");
        System.out.println("Tekan enter untuk kembali ke menu.");
        scanner.nextLine();
    }
}