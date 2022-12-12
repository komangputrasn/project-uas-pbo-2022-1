package com.project.uaspbo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class LoginController {
    @FXML
    Button loginAsAdminBtn;

    @FXML
    Button signupBtn;

    @FXML
    Button loginAsMentorBtn;

    @FXML
    public void switchToAdminLogin() throws IOException {
        Main.setRoot("admin-login-view");
    }

    public void switchToSignup() throws IOException {
        Main.setRoot("signup-view");
    }

    public void switchToMentorLogin() throws IOException {
        Main.setRoot("mentor-login-view");
    }
}
