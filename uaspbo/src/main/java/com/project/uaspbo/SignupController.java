package com.project.uaspbo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class SignupController {
    @FXML
    private Button loginBtn;

    @FXML
    private void goToLogin() throws IOException {
        Main.setRoot("login");
    }
}
