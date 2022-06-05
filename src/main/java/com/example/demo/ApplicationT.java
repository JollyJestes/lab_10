package com.example.demo;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ApplicationT extends Application {
    @Override
    public void start(Stage stage) {

        TableView<Kvadrat> table = new TableView<Kvadrat>();

        TableColumn<Kvadrat, String> akCol
                = new TableColumn<Kvadrat, String>("ak");

        TableColumn<Kvadrat, String> PkCol
                = new TableColumn<Kvadrat, String>("Pk");

        TableColumn<Kvadrat, String> SkCol
                = new TableColumn<Kvadrat, String>("Sk");

        TableColumn<Kvadrat, String> dCol
                = new TableColumn<Kvadrat, String>("d");

        TableColumn<Kvadrat, String> ak2Col
                = new TableColumn<Kvadrat, String>("ak2");

        TableColumn<Kvadrat, String> Pk2Col
                = new TableColumn<Kvadrat, String>("Pk2");

        TableColumn<Kvadrat, String> Sk2Col
                = new TableColumn<Kvadrat, String>("Sk2");

        TableColumn<Kvadrat, String> d2Col
                = new TableColumn<Kvadrat, String>("d2");

        TableColumn<Kvadrat, String> ak3Col
                = new TableColumn<Kvadrat, String>("ak3");

        TableColumn<Kvadrat, String> Pk3Col
                = new TableColumn<Kvadrat, String>("Pk3");

        TableColumn<Kvadrat, String> Sk3Col
                = new TableColumn<Kvadrat, String>("Sk3");

        TableColumn<Kvadrat, String> d3Col
                = new TableColumn<Kvadrat, String>("d3");

        akCol.setCellValueFactory(new PropertyValueFactory<>("ak"));
        PkCol.setCellValueFactory(new PropertyValueFactory<>("Pk"));
        SkCol.setCellValueFactory(new PropertyValueFactory<>("Sk"));
        dCol.setCellValueFactory(new PropertyValueFactory<>("d"));
        ak2Col.setCellValueFactory(new PropertyValueFactory<>("ak2"));
        Pk2Col.setCellValueFactory(new PropertyValueFactory<>("Pk2"));
        Sk2Col.setCellValueFactory(new PropertyValueFactory<>("Sk2"));
        d2Col.setCellValueFactory(new PropertyValueFactory<>("d2"));
        ak3Col.setCellValueFactory(new PropertyValueFactory<>("ak3"));
        Pk3Col.setCellValueFactory(new PropertyValueFactory<>("Pk3"));
        Sk3Col.setCellValueFactory(new PropertyValueFactory<>("Sk3"));
        d3Col.setCellValueFactory(new PropertyValueFactory<>("d3"));


        ObservableList<Kvadrat> list = getKvadrat();
        table.setItems(list);


        table.getColumns().addAll(akCol, PkCol, SkCol, dCol,ak2Col,Pk2Col,Sk2Col,d2Col,ak3Col,Pk3Col, Sk3Col,d3Col);

        StackPane root = new StackPane();
        root.setPadding(new Insets(5));
        root.getChildren().add(table);

        stage.setTitle("Квадрат");

        Scene scene = new Scene(root, 600, 300);
        stage.setScene(scene);
        stage.show();

    }

    private ObservableList<Kvadrat> getKvadrat() {

        Kvadrat kvadrat1 = new Kvadrat();
        Kvadrat kvadrat2 = new Kvadrat();
        Kvadrat kvadrat3 = new Kvadrat();
        kvadrat1.setAk(5);
        kvadrat1.setD(4);
        kvadrat1.setPk(10);
        kvadrat1.setSk(25);
        kvadrat2.setAk2(3);
        kvadrat2.setD2(5);
        kvadrat2.setPk2(15);
        kvadrat2.setSk2(30);
        kvadrat3.setAk3(8);
        kvadrat3.setD3(6);
        kvadrat3.setPk3(18);
        kvadrat3.setSk3(38);
        ObservableList<Kvadrat> list = FXCollections.observableArrayList(kvadrat1, kvadrat2, kvadrat3);
        return list;
    }

    public static void main(String[] args) {
        launch(args);
    }
}