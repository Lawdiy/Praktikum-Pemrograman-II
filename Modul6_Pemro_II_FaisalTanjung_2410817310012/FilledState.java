package Modul6_Pemro_II_FaisalTanjung_2410817310012;
public class FilledState implements RepositoryState {
    @Override
    public void handleSave(DataRepository context, Data newData) {
        System.out.println("[State Info]: Menimpa data lama dengan data baru...");
        context.setRealData(newData); // Update data

    }

    @Override
    public String getStatusMessage() {
        return "Data sudah ada. Input baru akan menimpa data lama.";
    }
}