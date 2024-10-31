package architectural.LoginMVP;

import java.util.Scanner;

public class LoginApp {

    public static void main(String[] args) {
        ConsoleLoginView loginView = new ConsoleLoginView();
        loginView.showLoginForm();
    }
}

