package com.example.t02_2072051;

import com.example.t02_2072051.model.dataMhs;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.TableView;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class CollectionController implements Initializable {

    @FXML
    private TextField txtNrp;
    @FXML
    private TextField txtNama;
    @FXML
    private Button btnTambah;
    @FXML
    private TextField txtNrp2;
    @FXML
    private Button btnHapus;
    @FXML
    private TableView<dataMhs> table1;
    @FXML
    private TableColumn<dataMhs, String> kolom1;
    @FXML
    private TableColumn<dataMhs, String> kolom2;
    private ObservableList<dataMhs> oList;

    @FXML
    private void onTambah(ActionEvent actionEvent) {
        if (txtNrp.getText().trim().isEmpty() || txtNama.getText().trim().isEmpty())
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Isi semua field");
            alert.showAndWait();
        } else {
            dataMhs dataMhs = new dataMhs();
            dataMhs.setNrp(txtNrp.getText().trim());
            dataMhs.setNama(txtNama.getText().trim());
            oList.add(dataMhs);
        }
    }

    @FXML
    private void onHapus(ActionEvent actionEvent) {
        table1.getItems().removeAll(table1.getSelectionModel().getSelectedItem());
//        if (txtNrp2.getText()
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        oList = FXCollections.observableArrayList();
        table1.setItems(oList);
        kolom1.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getNrp()));
        kolom2.setCellValueFactory(data -> new SimpleStringProperty(data.getValue().getNama()));

    }
}
