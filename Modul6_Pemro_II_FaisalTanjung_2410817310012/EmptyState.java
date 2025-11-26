package Modul6_Pemro_II_FaisalTanjung_2410817310012;
public class EmptyState implements RepositoryState {
    @Override
    public void handleSave(DataRepository context, Data newData) {
        System.out.println("[State Info]: Membuat data baru...");
        context.setRealData(newData); // Simpan data

        context.changeState(new FilledState());
    }

    @Override
    public String getStatusMessage() {
        return "Belum ada data. Silakan input data baru.";
    }
}
