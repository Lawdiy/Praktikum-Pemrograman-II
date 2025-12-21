package com.example.modul7.controller;

import com.example.modul7.model.Monster;
import com.example.modul7.repository.IMonsterRepository;
import com.example.modul7.repository.MonsterRepository;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class JournalController {
    @FXML private TextField txtId;
    @FXML private TextField txtName;
    @FXML private TextField txtType;
    @FXML private TextField txtHealth;
    @FXML private TextArea txtDesc;

    @FXML private TableView<Monster> tableMonsters;
    @FXML private TableColumn<Monster, String> colName;
    @FXML private TableColumn<Monster, String> colType;
    @FXML private TableColumn<Monster, Integer> colHealth;

    private final IMonsterRepository repo = new MonsterRepository();

    @FXML
    public void initialize() {
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colType.setCellValueFactory(new PropertyValueFactory<>("type"));
        colHealth.setCellValueFactory(new PropertyValueFactory<>("health"));

        tableMonsters.setItems(repo.getAll());

        tableMonsters.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) {
                fillForm(newVal);
            }
        });
    }

    @FXML
    private void handleSave() {
        try {
            String id = txtId.getText();
            String name = txtName.getText();
            if(id.isEmpty() || name.isEmpty()) {
                showAlert("Error", "ID dan Nama tidak boleh kosong!");
                return;
            }

            Monster m = new Monster(
                    id,
                    name,
                    txtType.getText(),
                    Integer.parseInt(txtHealth.getText()),
                    txtDesc.getText()
            );
            repo.add(m);
            handleClear();
        } catch (NumberFormatException e) {
            showAlert("Error Input", "Health harus diisi angka!");
        }
    }

    @FXML
    private void handleUpdate() {
        int selectedIndex = tableMonsters.getSelectionModel().getSelectedIndex();

        if (selectedIndex >= 0) {
            try {
                Monster updatedMonster = new Monster(
                        txtId.getText(),
                        txtName.getText(),
                        txtType.getText(),
                        Integer.parseInt(txtHealth.getText()),
                        txtDesc.getText()
                );

                repo.update(selectedIndex, updatedMonster);

                handleClear();
            } catch (NumberFormatException e) {
                showAlert("Error", "Health harus angka, cuy!");
            }
        } else {
            showAlert("Peringatan", "Pilih dulu data di tabel yang mau di-update!");
        }
    }

    @FXML
    private void handleDelete() {
        Monster selected = tableMonsters.getSelectionModel().getSelectedItem();
        if (selected != null) {
            repo.delete(selected);
            handleClear();
        } else {
            showAlert("Peringatan", "Pilih dulu musuh yang mau dihapus!");
        }
    }

    @FXML
    private void handleClear() {
        txtId.clear();
        txtName.clear();
        txtType.clear();
        txtHealth.clear();
        txtDesc.clear();
        tableMonsters.getSelectionModel().clearSelection();
    }

    private void fillForm(Monster m) {
        txtId.setText(m.getId());
        txtName.setText(m.getName());
        txtType.setText(m.getType());
        txtHealth.setText(String.valueOf(m.getHealth()));
        txtDesc.setText(m.getDesc());
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}