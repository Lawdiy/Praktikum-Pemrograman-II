package Modul6_Pemro_II_FaisalTanjung_2410817310012;
public class LoggingDataRepository extends DataRepositoryDec {

    public LoggingDataRepository(DataRepository repository) {
        super(repository);
    }

    @Override
    public void saveData(Data data) {
        System.out.println("\n[SYSTEM LOG]: Mencoba menyimpan data milik " + data.getName() + "...");

        super.saveData(data);

        System.out.println("[SYSTEM LOG]: Data berhasil tersimpan di memory pada " + java.time.LocalDateTime.now());
    }
}