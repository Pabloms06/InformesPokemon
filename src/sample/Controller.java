package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;

import java.awt.*;

public class Controller {

    public TextField texto1;

    public TextField texto2;

    public TextField pokemon1;

    public TextField Pokemon2;

    public TextField Pokemon3;

    public TextField Pokemon4;

    public TextField Pokemon5;

    public TextField Pokemon6;



        @FXML
        public void PulsarBoton(ObservableList<PieChart.Data> data){
            PieChart pie = new PieChart(data);

            data = FXCollections.observableArrayList();
            String uno = pokemon1.getText();
            String dos = Pokemon2.getText();
            String tres = Pokemon3.getText();
            String cuatro = Pokemon4.getText();
            String cinco = Pokemon5.getText();
            String seis = Pokemon6.getText();


            new PieChart.Data(uno,1);
            new PieChart.Data(dos,2);
            new PieChart.Data(tres,3);
            new PieChart.Data(cuatro,4);
            new PieChart.Data(cinco,5);
            new PieChart.Data(seis,6);

            pie.setTitle(texto1.getText());
            pie.setLabelLineLength(Double.parseDouble(texto2.getText()));
        }

    }


