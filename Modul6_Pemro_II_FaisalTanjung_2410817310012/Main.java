package Modul6_Pemro_II_FaisalTanjung_2410817310012;
public class Main {
    public static void main(String[] args) {
        DataRepository coreRepo = new InMemoryDataRepository();
        DataRepository repo = new LoggingDataRepository(coreRepo);
        Menu app = new Menu();
        app.addAction(new ViewDataAction(repo));
        app.addAction(new UpdateDataAction(repo));
        app.addAction(new ExitAction());
        app.run();
    }
}