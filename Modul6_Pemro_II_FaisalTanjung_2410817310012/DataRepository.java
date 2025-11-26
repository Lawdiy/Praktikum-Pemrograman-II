package Modul6_Pemro_II_FaisalTanjung_2410817310012;
public interface DataRepository {
    Data getData();
    void saveData(Data data);
    boolean hasData();
    void setRealData(Data data);
    void changeState(RepositoryState state);
}