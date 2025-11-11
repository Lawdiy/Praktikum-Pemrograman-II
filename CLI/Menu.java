package CLI;
public class Menu extends BaseMenu {
    @Override
    protected void displayMenu() {
        System.out.println("\n===== SELAMAT DATANG DI PROGRAM CLI =====");
        System.out.println("1. Lihat Data");
        System.out.println("2. Update/Masukkan Data");
        System.out.println("3. Keluar");
        System.out.print("Masukkan pilihan Anda (angka): ");
    }

    @Override
    protected int getUserChoice() {
        if (scanner.hasNextInt()) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            return choice;
        } else {
            scanner.nextLine();
            return -1;
        }
    }
}
