package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class Controller {

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Coffee coffee = new Coffee();
    Coke coke = new Coke();
    Pocari pocari = new Pocari();
    Redhorse redhorse = new Redhorse();
    Soju soju = new Soju();

    public void initialize() {

        coffee.setColor("White Mocha Latte");
        coffee.setTaste("Sweet");

        coke.setColor("black");
        coke.setTaste("Sweet");

        pocari.setColor("white");
        pocari.setTaste("mild lemon-lime flavor with a hint of sweetness");

        redhorse.setColor("yellow");
        redhorse.setTaste("distinctive sweetish taste balanced by a smooth bitterness that leads in a strong alcohol kick");

        soju.setColor("clear");
        soju.setTaste("clean and neutral");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("My coffee is " + coffee.getColor() + " and tastes " + coffee.getTaste());
        }

        if (sourceButton == btn2) {
            alert.setContentText("The color of coke is " + coke.getColor() + " and tastes " + coke.getTaste());
        }
        if (sourceButton == btn3) {
            alert.setContentText("The color of pocari is " + pocari.getColor() + " and tastes " + pocari.getTaste());
        }
        if (sourceButton == btn4) {
            alert.setContentText("The color of redhorse is " + redhorse.getColor() + " and tastes " + redhorse.getTaste());
        }
        if (sourceButton == btn5) {
            alert.setContentText("The color of soju is " + soju.getColor() + " and tastes " + soju.getTaste());
        }

        alert.showAndWait();

    }
}
