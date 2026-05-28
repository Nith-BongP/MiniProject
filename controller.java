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
        Double db_num1 = Double.parseDouble(num1);
        Double db_num2 = Double.parseDouble(num2);
        Double result = db_num1 + db_num2;
        System.out.println(result);
        Result.setText(String.valueOf(result));


    }

}
