package org.learning;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Zdenca on 6/21/2017.
 */
public class Controller implements Initializable {
    @FXML
    TableView<Product> table;
    @FXML
    TableColumn<Product, String> name;
    @FXML
    TableColumn<Product, Double> price;
    @FXML
    TableColumn<Product, String> nestedX;
    @FXML
    TableColumn<Product, Double> nestedY;

    private void setCellOfTable() {
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        nestedX.setCellValueFactory(new PropertyValueFactory<>("item"));
        nestedY.setCellValueFactory(new PropertyValueFactory<>("currentPrice"));

    }

    public ObservableList<Product> getProducts() {
        ObservableList<Product> products = FXCollections.observableArrayList();
        products.add(new Product("Jan", 23.00, "zelenina", 24.0));
        products.add(new Product("hello", 18.0, "hh", 12.0));
        return products;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setCellOfTable();
        table.setItems(getProducts());
    }
}
