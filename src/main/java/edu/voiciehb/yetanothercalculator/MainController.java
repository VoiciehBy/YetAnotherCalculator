package edu.voiciehb.yetanothercalculator;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {
    public Label resultLabel;
    private boolean isPlusButtonPressed = false;
    private boolean isMinusButtonPressed = false;
    private boolean isStarButtonPressed = false;
    private boolean isSlashButtonPressed = false;
    private boolean isEqualsButtonPressed = false;

    private float result = 0.0f;

    private String sum(float value) {
        return String.valueOf(Float.parseFloat(resultLabel.getText()) + value);
    }
    private String difference(float value) {
        return String.valueOf(Float.parseFloat(resultLabel.getText()) - value);
    }
    private String product(float value) {
        return String.valueOf(Float.parseFloat(resultLabel.getText()) * value);
    }
    private String quotient(float value) {
        if(value != 0)
            return String.valueOf(Float.parseFloat(resultLabel.getText()) / value);
        else return "?";
    }

    private void handleArithmeticOperations(int value){
        if (isPlusButtonPressed) {
            result = Float.parseFloat(sum(value));
            resultLabel.setText(String.valueOf(value));
            isPlusButtonPressed = false;
        } else if (isMinusButtonPressed) {
            result = Float.parseFloat(difference(value));
            resultLabel.setText(String.valueOf(value));
            isMinusButtonPressed = false;
        } else if (isStarButtonPressed) {
            result = Float.parseFloat(product(value));
            resultLabel.setText(String.valueOf(value));
            isStarButtonPressed = false;
        }else if (isSlashButtonPressed) {
            result = Float.parseFloat(quotient(value));
            resultLabel.setText(String.valueOf(value));
            isSlashButtonPressed = false;
        }
        else if(isEqualsButtonPressed){
            resultLabel.setText(String.valueOf(result));
            isEqualsButtonPressed = false;
        }
        else {
            String tmp = resultLabel.getText();
            if(tmp.equals("0"))
                resultLabel.setText("");
            resultLabel.setText(resultLabel.getText() + String.valueOf(value));
        }
    }

    public void onDigitButtonOnAction(ActionEvent actionEvent){
        Button button = (Button) actionEvent.getSource();
        int digit = Integer.parseInt(button.getText());
        handleArithmeticOperations(digit);
    }

    public void plusButtonOnAction(ActionEvent actionEvent) {
        isPlusButtonPressed = true;
    }
    public void minusButtonOnAction(ActionEvent actionEvent) {
        isMinusButtonPressed = true;
    }
    public void starButtonOnAction(ActionEvent actionEvent) {
        isStarButtonPressed = true;
    }
    public void slashButtonOnAction(ActionEvent actionEvent) {
        isSlashButtonPressed = true;
    }
    public void equalButtonOnAction(ActionEvent actionEvent) {
        isEqualsButtonPressed = true;
        resultLabel.setText(String.valueOf(result));
        isEqualsButtonPressed = false;
    }
}