package Modul6_Pemro_II_FaisalTanjung_2410817310012;
public abstract class DataRepositoryDec implements DataRepository {
    protected DataRepository wrappedRepository;

    public DataRepositoryDec(DataRepository repository) {
        this.wrappedRepository = repository;
    }

    @Override
    public Data getData() {
        return wrappedRepository.getData();
    }

    @Override
    public void saveData(Data data) {
        wrappedRepository.saveData(data);
    }

    @Override
    public boolean hasData() {
        return wrappedRepository.hasData();
    }

    @Override
    public void setRealData(Data data) {
        wrappedRepository.setRealData(data);
    }

    @Override
    public void changeState(RepositoryState state) {
        wrappedRepository.changeState(state);
    }
}
