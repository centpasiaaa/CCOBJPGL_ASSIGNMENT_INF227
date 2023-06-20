package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import model.*;

public class RestaurantController {

    @FXML
    ImageView img1, img2;

    @FXML
    Button btn1, btn2;

    Jollibee jollibee = new Jollibee();
    Mcdo mcdo = new Mcdo();
    Kfc kfc = new Kfc();
    Popeyes popeyes = new Popeyes();
    Shakeys shakeys = new Shakeys();


    public void initialize() {

        jollibee.setColor("Yellow");
        jollibee.setTaste("Very Sweet");

        kfc.setColor("Red");
        kfc.setTaste("Sweet");

        mcdo.setColor("Yellow");
        mcdo.setTaste("Very Sweet");

        popeyes.setColor("Red");
        popeyes.setTaste("Sweet");

        shakeys.setColor("Yellow");
        shakeys.setTaste("Very Sweet");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Apples are " + jollibee.getColor() + " and " + jollibee.getTaste());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Mangoes are " + kfc.getColor() + " and " + kfc.getTaste());
        }

        alert.showAndWait();

    }
}