package com.example.modul7.repository;

import com.example.modul7.model.Monster;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MonsterRepository implements IMonsterRepository {
    private final ObservableList<Monster> monsterList;

    public MonsterRepository() {
        monsterList = FXCollections.observableArrayList();
    }

    @Override
    public ObservableList<Monster> getAll() {
        return monsterList;
    }

    @Override
    public void add(Monster monster) {
        monsterList.add(monster);
    }

    @Override
    public void update(int index, Monster monster) {
        monsterList.set(index, monster);
    }

    @Override
    public void delete(Monster monster) {
        monsterList.remove(monster);
    }
}