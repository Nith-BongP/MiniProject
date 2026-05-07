import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField display;

    private double firstNumber = 0;
    private String operator = "";
    private boolean start = true;

    @FXML
    private void numberPressed(ActionEvent event) {
        if (start) {
            display.setText("");
            start = false;
        }
        String value = ((Button) event.getSource()).getText();
        display.setText(display.getText() + value);
    }

    @FXML
    private void operatorPressed(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();
        if (!"".equals(operator)) {
            return;
        }
        operator = value;
        firstNumber = Double.parseDouble(display.getText());
        display.setText("");
    }

    @FXML
    private void equalsPressed(ActionEvent event) {
        double secondNumber = Double.parseDouble(display.getText());
        double result = 0;
        switch (operator) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    display.setText("Error");
                    return;
                }
                break;
        }
        display.setText(String.valueOf(result));
        operator = "";
        start = true;
    }

    @FXML
    private void clearPressed(ActionEvent event) {
        display.setText("");
        operator = "";
        start = true;
        firstNumber = 0;
    }

    @FXML
    private void decimalPressed(ActionEvent event) {
        if (start) {
            display.setText("0.");
            start = false;
        } else if (!display.getText().contains(".")) {
            display.setText(display.getText() + ".");
        }
    }
}