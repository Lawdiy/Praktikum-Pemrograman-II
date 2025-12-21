package com.example.modul7.repository;

import com.example.modul7.model.Monster;
import javafx.collections.ObservableList;

public interface IMonsterRepository {
    ObservableList<Monster> getAll();
    void add(Monster monster);
    void update(int index, Monster monster); // Tambahkan ini
    void delete(Monster monster);
}