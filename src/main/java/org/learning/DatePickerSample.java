package org.learning;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.LocalDateStringConverter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Created by Zdenca on 4/26/2017.
 */
public class DatePickerSample extends Application {

    private Stage stage;
    private DatePicker checkInDatePicker;
    private final String pattern = "dd-MM-yyyy";

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        this.stage = stage;
        stage.setTitle("DatePickerSample");
        initUI();
        stage.show();
    }

    private void initUI() {
        VBox vbox = new VBox(20);
        vbox.setStyle("-fx-padding: 10;");
        Scene scene = new Scene(vbox, 300, 300);
        stage.setScene(scene);

        checkInDatePicker = new DatePicker(LocalDate.now());
        StringConverter converter = new StringConverter<LocalDate>() {
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(pattern);

            @Override
            public String toString(LocalDate date) {
                if (date != null) {
                    return dateFormatter.format(date);
                } else {
                    return "";
                }
            }

            @Override
            public LocalDate fromString(String string) {
                if (string != null && string.isEmpty()) {
                    return LocalDate.parse(string, dateFormatter);
                } else {
                    return null;
                }
            }
        };

        checkInDatePicker.setConverter(converter);
        checkInDatePicker.setPromptText(pattern.toLowerCase());
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        Label checkInLabel = new Label("Check-In Date");
        gridPane.add(checkInLabel, 0, 0);

        GridPane.setHalignment(checkInLabel, HPos.LEFT);
        gridPane.add(checkInDatePicker, 0, 1);
        vbox.getChildren().add(gridPane);
        checkInDatePicker.requestFocus();

    }
}
