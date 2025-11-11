package CLI;
import java.util.Scanner;
class DataOperator implements DataOperations {
    private Data data;

    public DataOperator() {
        this.data = null;
    }

    @Override
    public void viewData(Scanner scanner) {
        System.out.println("\n--- Lihat Data ---");
        if (this.data == null) {
            System.out.println("Belum ada data saat ini.");
            System.out.println("Tekan enter untuk kembali ke menu.");
            scanner.nextLine();
        } else {
            System.out.println("Nama    : " + data.getName());
            System.out.println("NIM     : " + data.getNim());
            System.out.println("Hobi    : " + data.getHobby());
            System.out.println("Motto   : " + data.getMotto());
            System.out.println("Tekan enter untuk kembali ke menu.");
            scanner.nextLine();
        }
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.println("\n--- Update/Masukkan Data ---");
        System.out.print("Masukkan Nama: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan Hobi: ");
        String hobby = scanner.nextLine();
        System.out.print("Masukkan Motto: ");
        String motto = scanner.nextLine();

        if (this.data == null) {
            this.data = new Data(name, nim, hobby, motto);
            System.out.println("Data baru berhasil dibuat.");
            System.out.println("Tekan enter untuk kembali ke menu.");
            scanner.nextLine();
        } else {
            data.setName(name);
            data.setNim(nim);
            data.setHobby(hobby);
            data.setMotto(motto);
            System.out.println("Data berhasil diperbarui.");
            System.out.println("Tekan enter untuk kembali ke menu.");
            scanner.nextLine();
        }
    }
}