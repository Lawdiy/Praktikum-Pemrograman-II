package Modul6_Pemro_II_FaisalTanjung_2410817310012;
public class InMemoryDataRepository implements DataRepository {
    private Data data;

    private Modul6_Pemro_II_FaisalTanjung_2410817310012.RepositoryState currentState = new EmptyState();

    public void changeState(RepositoryState newState) {
        this.currentState = newState;
    }

    public void setRealData(Data data) {
        this.data = data;
    }

    @Override
    public void saveData(Data newData) {
        currentState.handleSave(this, newData);
    }

    @Override
    public Data getData() {
        return data;
    }

    @Override
    public boolean hasData() {
        return data != null;
    }

    public String getStatus() {
        return currentState.getStatusMessage();
    }
}