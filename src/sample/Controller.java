package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField ip1;
    @FXML
    TextField ip2;
    @FXML
    TextField kq;

    public void getArea() {
        int so1 = Integer.parseInt(ip1.getText());
        int so2 = Integer.parseInt(ip2.getText());
        kq.setText(String.valueOf(so1*so2));
    }
}
