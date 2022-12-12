package com.project.uaspbo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class AdminLoginController {
    @FXML
    Button backToMainMenuBtn;

    @FXML
    private void goBackToMainMenu() throws IOException {
        Main.setRoot("login");
    }
}
