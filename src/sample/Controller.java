package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import java.awt.*;
import java.util.Date;

public class Controller {

    @FXML
    public TextField message;
    @FXML
    public TextArea communicationWindow;

    public void onClickSendM(ActionEvent actionEvent) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long Second = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long Minute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long Hour = totalHours % 24;
        communicationWindow.appendText("You [" + Hour + ":" + Minute + ":" + Second + "]: " + message.getText() + "\n");
        message.requestFocus();
        message.clear();
    }

    public void enterPress(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER) {
            long totalMilliseconds = System.currentTimeMillis();
            long totalSeconds = totalMilliseconds / 1000;
            long Second = totalSeconds % 60;
            long totalMinutes = totalSeconds / 60;
            long Minute = totalMinutes % 60;
            long totalHours = totalMinutes / 60;
            long Hour = totalHours % 24;
            communicationWindow.appendText("You [" + Hour + ":" + Minute + ":" + Second + "]: " + message.getText() + "\n");
            message.requestFocus();
            message.clear();
        }
    }
}
