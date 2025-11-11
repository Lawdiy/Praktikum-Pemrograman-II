package CLI;
import java.util.Scanner;
abstract class BaseMenu implements MenuOperations {
    protected DataOperator operator;
    protected Scanner scanner;

    public BaseMenu() {
        this.operator = new DataOperator();
        this.scanner = new Scanner(System.in);
    }

    protected abstract void displayMenu();
    protected abstract int getUserChoice();

    @Override
    public void run() {
        boolean running = true;
        while (running) {
            displayMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    operator.viewData(scanner);
                    break;
                case 2:
                    operator.inputData(scanner);
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Harap masukkan angka yang benar.");
            }
        }
        System.out.println("Terima kasih, program selesai.");
        scanner.close();
    }
}