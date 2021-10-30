package edu.voiciehb.yetanothercalculator;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class MainController {
    public Label resultLabel;
    private boolean isPlusButtonPressed = false;
    private boolean isMinusButtonPressed = false;
    private boolean isStarButtonPressed = false;
    private boolean isSlashButtonPressed = false;

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

    private void handleArithmeticOperations(float value){
        if (isPlusButtonPressed) {
            resultLabel.setText(sum(value));
            isPlusButtonPressed = false;
        } else if (isMinusButtonPressed) {
            resultLabel.setText(difference(value));
            isMinusButtonPressed = false;
        } else if (isStarButtonPressed) {
            resultLabel.setText(product(value));
            isStarButtonPressed = false;
        }else if (isSlashButtonPressed) {
            resultLabel.setText(quotient(value));
            isSlashButtonPressed = false;
        }
        else resultLabel.setText(String.valueOf(value));
    }

    public void oneButtonOnAction(ActionEvent actionEvent) {
        handleArithmeticOperations(1);
    }
    public void twoButtonOnAction(ActionEvent actionEvent) {
        handleArithmeticOperations(2);
    }
    public void threeButtonOnAction(ActionEvent actionEvent) {
        handleArithmeticOperations(3);
    }
    public void fourButtonOnAction(ActionEvent actionEvent) {
        handleArithmeticOperations(4);
    }
    public void fiveButtonOnAction(ActionEvent actionEvent) {
        handleArithmeticOperations(5);
    }
    public void sixButtonOnAction(ActionEvent actionEvent) {
        handleArithmeticOperations(6);
    }
    public void sevenButtonOnAction(ActionEvent actionEvent) {
        handleArithmeticOperations(7);
    }
    public void eightButtonOnAction(ActionEvent actionEvent) {
        handleArithmeticOperations(8);
    }
    public void nineButtonOnAction(ActionEvent actionEvent) {
        handleArithmeticOperations(9);
    }
    public void zeroButtonOnAction(ActionEvent actionEvent) {
        handleArithmeticOperations(0);
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
        resultLabel.setText(resultLabel.getText());
    }
}