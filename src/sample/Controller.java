package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.input.MouseEvent;

import java.awt.*;

public class Controller {

    public TextField texto1;

    public TextField texto2;

    public TextField Pokemon1;

    public TextField Pokemon2;

    public TextField Pokemon3;

    public TextField Pokemon4;

    public TextField Pokemon5;

    public TextField Pokemon6;

    public PieChart pieChart;

//He intentado hacerlo pero he tenido problemas en el sample, tuve problemas con el proyecto de Pokemon y por eso he tenido que hacer este.

        @FXML
        public void PulsarBoton(MouseEvent event){

            String uno = Pokemon1.getText();
            String dos = Pokemon2.getText();
            String tres = Pokemon3.getText();
            String cuatro = Pokemon4.getText();
            String cinco = Pokemon5.getText();
            String seis = Pokemon6.getText();

            ObservableList<PieChart.Data> pieChartData =
            FXCollections.observableArrayList(
            new PieChart.Data(uno,1),
            new PieChart.Data(dos,2),
            new PieChart.Data(tres,3),
            new PieChart.Data(cuatro,4),
            new PieChart.Data(cinco,5),
            new PieChart.Data(seis,6));

            pieChart.setData(pieChartData);

            pieChart.setTitle(texto1.getText());
            pieChart.setLabelLineLength(Double.parseDouble(texto2.getText()));
        }

    private void installTooltip(PieChart.Data data) {
    }
}


