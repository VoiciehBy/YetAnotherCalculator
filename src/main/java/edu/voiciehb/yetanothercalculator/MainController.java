package edu.voiciehb.yetanothercalculator;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class MainController {
    public Label resultLabel;
    private boolean bPlus = false;
    private boolean bMinus = false;

    private String sum(int value) {
        return String.valueOf(Integer.parseInt(resultLabel.getText()) + value);
    }

    private String difference(int value) {
        return String.valueOf(Integer.parseInt(resultLabel.getText()) - value);
    }

    public void oneButtonOnAction(ActionEvent actionEvent) {
        if (bPlus) {
            resultLabel.setText(sum(1));
            bPlus = false;
        } else if (bMinus) {
            resultLabel.setText(difference(1));
            bMinus = false;
        } else resultLabel.setText("1");
    }

    public void twoButtonOnAction(ActionEvent actionEvent) {
        if (bPlus) {
            resultLabel.setText(sum(2));
            bPlus = false;
        } else if (bMinus) {
            resultLabel.setText(difference(2));
            bMinus = false;
        } else resultLabel.setText("2");
    }

    public void threeButtonOnAction(ActionEvent actionEvent) {
        if (bPlus) {
            resultLabel.setText(sum(3));
            bPlus = false;
        } else if (bMinus) {
            resultLabel.setText(difference(3));
            bMinus = false;
        } else resultLabel.setText("3");
    }

    public void fourButtonOnAction(ActionEvent actionEvent) {
        if (bPlus) {
            resultLabel.setText(sum(4));
            bPlus = false;
        } else if (bMinus) {
            resultLabel.setText(difference(4));
            bMinus = false;
        } else resultLabel.setText("4");
    }

    public void fiveButtonOnAction(ActionEvent actionEvent) {
        if (bPlus) {
            resultLabel.setText(sum(5));
            bPlus = false;
        } else if (bMinus) {
            resultLabel.setText(difference(5));
            bMinus = false;
        } else resultLabel.setText("5");
    }

    public void sixButtonOnAction(ActionEvent actionEvent) {
        if (bPlus) {
            resultLabel.setText(sum(6));
            bPlus = false;
        } else if (bMinus) {
            resultLabel.setText(difference(6));
            bMinus = false;
        } else resultLabel.setText("6");
    }

    public void sevenButtonOnAction(ActionEvent actionEvent) {
        if (bPlus) {
            resultLabel.setText(sum(7));
            bPlus = false;
        } else if (bMinus) {
            resultLabel.setText(difference(7));
            bMinus = false;
        } else resultLabel.setText("7");
    }

    public void eightButtonOnAction(ActionEvent actionEvent) {
        if (bPlus) {
            resultLabel.setText(sum(8));
            bPlus = false;
        } else if (bMinus) {
            resultLabel.setText(difference(8));
            bMinus = false;
        } else resultLabel.setText("8");
    }

    public void nineButtonOnAction(ActionEvent actionEvent) {
        if (bPlus) {
            resultLabel.setText(sum(9));
            bPlus = false;
        } else if (bMinus) {
            resultLabel.setText(difference(9));
            bMinus = false;
        } else resultLabel.setText("9");
    }

    public void zeroButtonOnAction(ActionEvent actionEvent) {
        if (bPlus) {
            resultLabel.setText(sum(0));
            bPlus = false;
        } else if (bMinus) {
            resultLabel.setText(difference(0));
            bMinus = false;
        } else resultLabel.setText("0");
    }

    public void plusButtonOnAction(ActionEvent actionEvent) {
        bPlus = true;
    }

    public void minusButtonOnAction(ActionEvent actionEvent) {
        bMinus = true;
    }
}