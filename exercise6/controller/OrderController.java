package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import model.BedroomLamp;
import model.CeilingLamp;
import model.WallLamp;

public class OrderController implements Initializable {


    @FXML

    Label name1, name2, name3, qty1, qty2, qty3, amount1, amount2, amount3, Total;

    @FXML
    Stage stage;

    @FXML
    Scene scene;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        if (HomeController.blamp.getProductStatus()) {
            name1.setText(HomeController.blamp.getProductName());
            qty1.setText(Double.toString(HomeController.blamp.getProductQuantity()));
            amount1.setText(Double.toString(HomeController.blamp.getProductPrice() * HomeController.blamp.getProductQuantity()));
            name1.setVisible(true);
            qty1.setVisible(true);
            amount1.setVisible(true);
            // price1.setVisible(true);
        }
        if (HomeController.clamp.getProductStatus()) {
            name2.setText(HomeController.clamp.getProductName());
            qty2.setText(Double.toString(HomeController.clamp.getProductQuantity()));
            amount2.setText(Double.toString(HomeController.clamp.getProductPrice() * HomeController.clamp.getProductQuantity()));
            name2.setVisible(true);
            qty2.setVisible(true);
            amount2.setVisible(true); 
        }
        if (HomeController.wlamp.getProductStatus()) {
            name3.setText(HomeController.wlamp.getProductName());
            qty3.setText(Double.toString(HomeController.wlamp.getProductQuantity()));
            amount3.setText(Double.toString(HomeController.wlamp.getProductPrice() * HomeController.wlamp.getProductQuantity()));
            name3.setVisible(true);
            qty3.setVisible(true);
            amount3.setVisible(true);
        }
        double amount1 = HomeController.blamp.getProductPrice() * HomeController.blamp.getProductQuantity();
        double amount2 = HomeController.clamp.getProductPrice() * HomeController.clamp.getProductQuantity();
        double amount3 = HomeController.wlamp.getProductPrice() * HomeController.wlamp.getProductQuantity();
        
        
        double total = amount1 + amount2 + amount3;
        Total.setText(Double.toString(total));
    } //controller:OrderController
}