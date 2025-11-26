package Modul6_Pemro_II_FaisalTanjung_2410817310012;
public interface RepositoryState {
    void handleSave(DataRepository context, Data newData);
    String getStatusMessage(); // Pesan untuk user (misal: "Data Kosong" atau "Data Ada")
}
