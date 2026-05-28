import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button Button_Calculate;

    @FXML
    private Label Result;

    @FXML
    private TextField textfield_num1;

    @FXML
    private TextField textfield_num2;

    @FXML
    void on_calculate(ActionEvent event) {
        String num1 = textfield_num1.getText();
        String num2 = textfield_num2.getText();
        System.out.println(num1);
        System.out.println(num2);
    }

}
