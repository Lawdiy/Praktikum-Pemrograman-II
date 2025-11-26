package Modul6_Pemro_II_FaisalTanjung_2410817310012;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Menu {
    private List<MenuAction> actions = new ArrayList<>();
    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void addAction(MenuAction action) {
        this.actions.add(action);
    }

    public void run() {
        boolean running = true;
        while (running) {
            displayMenu();
            int choice = getUserChoice();

            if (choice < 1 || choice > actions.size()) {
                System.out.println("Pilihan tidak valid.");
                continue;
            }

            MenuAction selectedAction = actions.get(choice - 1);

            selectedAction.execute(scanner);

            if (selectedAction.isExit()) {
                running = false;
            }
        }
        scanner.close();
    }

    private void displayMenu() {
        System.out.println("\n===== SELAMAT DATANG DI PROGRAM CLI (SOLID) =====");
        for (int i = 0; i < actions.size(); i++) {
            System.out.println((i + 1) + ". " + actions.get(i).getLabel());
        }
        System.out.print("Masukkan pilihan Anda (angka): ");
    }

    private int getUserChoice() {
        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            return choice;
        } else {
            scanner.nextLine(); // consume bad input
            return -1;
        }
    }
}